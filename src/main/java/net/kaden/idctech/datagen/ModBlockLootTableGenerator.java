package net.kaden.idctech.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.kaden.idctech.block.ModBlocks;
import net.kaden.idctech.item.ModItems;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
  //  addDrop(ModBlocks.BLOCK);
  //check either tutorial or IDRCF repo to get more info

    //ores
    addDrop(ModBlocks.INVERITE_ORE,oreDrops(ModBlocks.INVERITE_ORE, ModItems.RAW_INVERITE));
    addDrop(ModBlocks.DEEPSLATE_INVERITE_ORE,oreDrops(ModBlocks.DEEPSLATE_INVERITE_ORE, ModItems.RAW_INVERITE));
    addDrop(ModBlocks.NETHER_INVERITE_ORE,oreDrops(ModBlocks.NETHER_INVERITE_ORE, ModItems.RAW_INVERITE));
    addDrop(ModBlocks.END_INVERITE_ORE,oreDrops(ModBlocks.END_INVERITE_ORE, ModItems.RAW_INVERITE));
    //reg blocks
    addDrop(ModBlocks.INVERITE_BLOCK);
    }
}
