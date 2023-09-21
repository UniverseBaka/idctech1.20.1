package net.kaden.idctech;

import net.fabricmc.api.ClientModInitializer;
import net.kaden.idctech.util.ModModelPredicateProvider;

public class IDCTECHClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        ModModelPredicateProvider.registerModModels();

    }
}
