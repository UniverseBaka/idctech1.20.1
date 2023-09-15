package net.kaden.idctech.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.kaden.idctech.block.ModBlocks;
import net.kaden.idctech.block.custom.InveriteLampBlock;
import net.kaden.idctech.item.ModItems;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

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
        registerCustomLamp(blockStateModelGenerator);
    }
    private void registerCustomLamp(BlockStateModelGenerator blockStateModelGenerator){
        Identifier identifier =
                TexturedModel.CUBE_ALL.upload(ModBlocks.INVERITE_LAMP_BLOCK,
                        blockStateModelGenerator.modelCollector);
        Identifier identifier2 =
                blockStateModelGenerator.createSubModel(ModBlocks.INVERITE_LAMP_BLOCK,"_on",
                        Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.INVERITE_LAMP_BLOCK)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(InveriteLampBlock.CLICKED, identifier2, identifier)));


    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        /* always check in idrcf REPO or on kaupenjoe's vid, but this is how it should work
       itemModelGenerator.register(ModItems.ITEM, Models.GENERATED);
         */
        itemModelGenerator.register(ModItems.WRENCH, Models.GENERATED);
        itemModelGenerator.register(ModItems.INVERITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_INVERITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.INVERITE_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.INVERITE_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.INVERITE_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.INVERITE_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.INVERITE_HOE, Models.GENERATED);


    }
}
