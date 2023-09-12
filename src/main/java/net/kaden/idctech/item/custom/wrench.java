package net.kaden.idctech.item.custom;

import net.kaden.idctech.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class wrench extends Item {
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!context.getWorld().isClient) {
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;
            boolean isSneaking = player.isSneaking();
            ServerWorld world = (ServerWorld) context.getWorld();
            if (isSneaking) {
                if (isWrenchable(context.getWorld().getBlockState(positionClicked))) {
                    world.breakBlock(positionClicked, true, player);
                }
            }
        }




        context.getStack().damage(1, context.getPlayer(),
                playerEntity -> { playerEntity.sendToolBreakStatus(playerEntity.getActiveHand());
                });
        return ActionResult.SUCCESS;
    }

    public wrench(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.idctech.wrench"));
        tooltip.add(Text.translatable("tooltip.idctech.wrench2"));
        super.appendTooltip(stack, world, tooltip, context);
    }

    private boolean isWrenchable(BlockState blockState) {
        return blockState.isIn(ModTags.Blocks.ISWRENCHABLE);

    }
}
