package net.kaden.idctech.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.kaden.idctech.item.ModItems;
import net.kaden.idctech.util.ModTags;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;


import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    public void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Items.TECH)
                .add(ModItems.WRENCH)
                .add(ModItems.DATA_TABLET);

        getOrCreateTagBuilder(ModTags.Items.METALS)
                .add(ModItems.INVERITE, Items.IRON_INGOT, Items.GOLD_INGOT, Items.COPPER_INGOT,Items.NETHERITE_INGOT);
        getOrCreateTagBuilder(ModTags.Items.RARE)
                .add(ModItems.INVERITE,Items.DIAMOND,Items.NETHERITE_INGOT,Items.EMERALD,ModItems.RAW_INVERITE);


    }

}