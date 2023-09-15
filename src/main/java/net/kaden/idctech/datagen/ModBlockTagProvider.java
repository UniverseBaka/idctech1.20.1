package net.kaden.idctech.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.kaden.idctech.block.ModBlocks;
import net.kaden.idctech.util.ModTags;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

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
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.DEEPSLATE_INVERITE_ORE, ModBlocks.INVERITE_ORE, ModBlocks.NETHER_INVERITE_ORE, ModBlocks.END_INVERITE_ORE);
        getOrCreateTagBuilder(ModTags.Blocks.ISWRENCHABLE)
                .add(Blocks.DIRT, Blocks.GRASS_BLOCK);

        getOrCreateTagBuilder(ModTags.Blocks.ORE)
                .add(ModBlocks.INVERITE_ORE, ModBlocks.NETHER_INVERITE_ORE, ModBlocks.END_INVERITE_ORE, ModBlocks.DEEPSLATE_INVERITE_ORE);
        getOrCreateTagBuilder(ModTags.Blocks.METAL_BLOCKS)
                .add(ModBlocks.INVERITE_BLOCK);
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5")));

    }
}
