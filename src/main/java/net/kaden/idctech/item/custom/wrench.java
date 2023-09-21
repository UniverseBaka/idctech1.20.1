package net.kaden.idctech.item.custom;

import net.kaden.idctech.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class wrench extends Item {
    public wrench(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);

        if (user.isSneaking()) {
            BlockPos pos = user.getBlockPos();
            BlockState state = world.getBlockState(pos);

            if (isWrenchable(state)) {
                // Update the DataTabletItem with the new block data
                ItemStack dataTablet = findDataTabletItem(user.getInventory());
                if (!dataTablet.isEmpty()) {
                    NbtCompound nbt = new NbtCompound();
                    nbt.putString("idctech.last_block_wrenched", state.getBlock().getTranslationKey());
                    DataTabletItem.setLastBlockWrenched(dataTablet, nbt.toString());
                }

                // Break the block
                world.breakBlock(pos, true, user);
                stack.damage(1, user, (entity) -> entity.sendToolBreakStatus(hand));
                return TypedActionResult.success(stack);
            }
        }

        return TypedActionResult.pass(stack);
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

    private ItemStack findDataTabletItem(Inventory inventory) {
        for (int i = 0; i < inventory.size(); i++) {
            ItemStack stack = inventory.getStack(i);
            if (stack.getItem() instanceof DataTabletItem) {
                return stack;
            }
        }
        return ItemStack.EMPTY;
    }
}
