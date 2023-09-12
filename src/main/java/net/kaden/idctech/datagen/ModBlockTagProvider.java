package net.kaden.idctech.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.kaden.idctech.block.ModBlocks;
import net.kaden.idctech.util.ModTags;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider{
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
  /*  getOrCreateTagBuilder(ModTags.Blocks.TAG)
            .add(ModBLocks.BLOCK_NAME)
*/

        getOrCreateTagBuilder(ModTags.Blocks.ISWRENCHABLE)
                .add(Blocks.DIRT, Blocks.GRASS_BLOCK);

        getOrCreateTagBuilder(ModTags.Blocks.ORE)
                .add(ModBlocks.INVERITE_ORE, ModBlocks.NETHER_INVERITE_ORE, ModBlocks.END_INVERITE_ORE, ModBlocks.DEEPSLATE_INVERITE_ORE);
        getOrCreateTagBuilder(ModTags.Blocks.METAL_BLOCKS)
                .add(ModBlocks.INVERITE_BLOCK);

    }
}
