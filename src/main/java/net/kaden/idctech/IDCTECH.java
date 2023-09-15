package net.kaden.idctech;

import net.fabricmc.api.ModInitializer;

import net.kaden.idctech.block.ModBlocks;
import net.kaden.idctech.item.ModItemGroup;
import net.kaden.idctech.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IDCTECH implements ModInitializer {
	public static final String MOD_ID = "idctech";
    public static final Logger LOGGER = LoggerFactory.getLogger("idctech");

	@Override
	public void onInitialize() {
		ModBlocks.registerModBLocks();
		ModItems.registerModITems();
		ModItemGroup.registerItemGroups();
		LOGGER.info("Hello Fabric world!");
	}
}