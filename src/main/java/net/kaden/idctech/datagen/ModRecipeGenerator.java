package net.kaden.idctech.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.kaden.idctech.block.ModBlocks;
import net.kaden.idctech.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
       /* examples for base vanilla type recipes, as always either check IDRCF repo or KaupenJoe's Tutorial
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.INVERITE, RecipeCategory.MISC, ModBlocks.INVERITE_BLOCK);
        offerSmelting(exporter, List.of(ModItems.RAW_INVERITE, ModBlocks.INVERITE_ORE, ModBlocks.NETHER_INVERITE_ORE, ModBlocks.END_INVERITE_ORE, ModBlocks.DEEPSLATE_INVERITE_ORE), RecipeCategory.MISC, ModItems.INVERITE, 0.7f, 200, "inverite_smelting");
        offerBlasting(exporter, List.of(ModItems.RAW_INVERITE, ModBlocks.INVERITE_ORE, ModBlocks.NETHER_INVERITE_ORE, ModBlocks.END_INVERITE_ORE, ModBlocks.DEEPSLATE_INVERITE_ORE), RecipeCategory.MISC, ModItems.INVERITE, 0.7f, 100, "inverite_smelting");

        */
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.INVERITE, RecipeCategory.MISC, ModBlocks.INVERITE_BLOCK);
        offerSmelting(exporter, List.of(ModItems.RAW_INVERITE, ModBlocks.INVERITE_ORE, ModBlocks.NETHER_INVERITE_ORE, ModBlocks.END_INVERITE_ORE, ModBlocks.DEEPSLATE_INVERITE_ORE), RecipeCategory.MISC, ModItems.INVERITE, 0.7f, 200, "inverite_smelting");
        offerBlasting(exporter, List.of(ModItems.RAW_INVERITE, ModBlocks.INVERITE_ORE, ModBlocks.NETHER_INVERITE_ORE, ModBlocks.END_INVERITE_ORE, ModBlocks.DEEPSLATE_INVERITE_ORE), RecipeCategory.MISC, ModItems.INVERITE, 0.35f, 100, "inverite_blasting");

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModItems.WRENCH)
                .pattern("I I")
                .pattern(" I ")
                .pattern(" I ")
                .input('I', ModItems.INVERITE)
                .criterion("has_item", conditionsFromItem(ModItems.INVERITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WRENCH)));


    }
}
