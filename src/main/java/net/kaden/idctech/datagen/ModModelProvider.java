package net.kaden.idctech.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.kaden.idctech.block.ModBlocks;
import net.kaden.idctech.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        /* always check in idrcf REPO or on kaupenjoe's vid, but this is how it should work
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK, "block");
         */
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_INVERITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_INVERITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_INVERITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INVERITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INVERITE_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        /* always check in idrcf REPO or on kaupenjoe's vid, but this is how it should work
       itemModelGenerator.register(ModItems.ITEM, Models.GENERATED);
         */
        itemModelGenerator.register(ModItems.WRENCH, Models.GENERATED);
        itemModelGenerator.register(ModItems.INVERITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_INVERITE, Models.GENERATED);

    }
}
