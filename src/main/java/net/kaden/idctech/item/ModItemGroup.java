package net.kaden.idctech.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.kaden.idctech.IDCTECH;
import net.kaden.idctech.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroup {
/*public static final ItemGroup IDRCF_MATERIALS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(IDRCF.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.idctech_materials"))
                    .icon(() -> new ItemStack(ModItems.INVERITE)).entries((displayContext, entries) -> {


                        entries.add(ModItems.INVERITE);
                        entries.add(ModItems.RAW_INVERITE);
                        entries.add(ModItems.MARODITE);
                        entries.add(ModItems.CHARRED_TOMATO);

                    }).build());
};*/

    public static final ItemGroup IDCTECH_MATERIALS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(IDCTECH.MOD_ID, "inverite"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.idctech_materials"))
                    .icon(() -> new ItemStack(ModItems.INVERITE)).entries((displayContext, entries) -> {


                        entries.add(ModItems.INVERITE);
                    }).build());
    public static final ItemGroup IDCTECH_TOOLS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(IDCTECH.MOD_ID, "tools"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.idctech_tools"))
                    .icon(() -> new ItemStack(ModItems.WRENCH)).entries((displayContext, entries) -> {
                        entries.add(ModItems.WRENCH);
                    }).build());
    public static final ItemGroup IDCTECH_BLOCK = Registry.register(Registries.ITEM_GROUP,
            new Identifier(IDCTECH.MOD_ID, "block"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.idctech_block"))
                    .icon(() -> new ItemStack(ModBlocks.INVERITE_LAMP_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.INVERITE_LAMP_BLOCK);
                    }).build());


    public static void registerItemGroups() {
        IDCTECH.LOGGER.info("Registering Item Groups for " + IDCTECH.MOD_ID);
    }
}
