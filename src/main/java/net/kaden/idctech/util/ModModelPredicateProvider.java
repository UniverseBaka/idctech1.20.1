package net.kaden.idctech.util;

import net.kaden.idctech.IDCTECH;
import net.kaden.idctech.item.ModItems;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;

public class ModModelPredicateProvider {
    public static void registerModModels() {
        ModelPredicateProviderRegistry.register(ModItems.DATA_TABLET, new Identifier(IDCTECH.MOD_ID,"on"),
                (stack, world, entity, seed) -> stack.hasNbt() ? 1f : 0f);


    }
}