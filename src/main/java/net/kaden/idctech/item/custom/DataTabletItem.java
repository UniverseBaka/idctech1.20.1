package net.kaden.idctech.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DataTabletItem extends Item {
    public DataTabletItem(Settings settings) {
        super(settings);
    }

    // Method to set the "idctech.last_block_wrenched" NBT data
    public static void setLastBlockWrenched(ItemStack stack, String lastBlockWrenched) {
        if (!stack.hasNbt()) {
            stack.setNbt(new NbtCompound());
        }
        stack.getNbt().putString("idctech.last_block_wrenched", lastBlockWrenched);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return stack.hasNbt();
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (stack.hasNbt()) {
            String lastBlockWrenched = stack.getNbt().getString("idctech.last_block_wrenched");
            tooltip.add(Text.literal(lastBlockWrenched));
        }
    }
}
