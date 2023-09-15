package net.kaden.idctech.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kaden.idctech.IDCTECH;
import net.kaden.idctech.block.custom.InveriteLampBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class ModBlocks {

    /* public static final Block INVERITE_BLOCK = registerBlock("inverite_block",
            new Block( FabricBlockSettings.copyOf(Blocks.IRON_BLOCK))); */
    public static final Block INVERITE_BLOCK = registerBLock("inverite_block",
            new Block( FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block INVERITE_ORE = registerBLock("inverite_ore",
            new Block( FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_INVERITE_ORE = registerBLock("deepslate_inverite_ore",
            new Block( FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE).strength(4f)));
    public static final Block NETHER_INVERITE_ORE = registerBLock("nether_inverite_ore",
            new Block( FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(4f)));
    public static final Block END_INVERITE_ORE = registerBLock("end_inverite_ore",
            new Block( FabricBlockSettings.copyOf(Blocks.END_STONE).strength(4f)));
    private static Item registerBLockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(IDCTECH.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

public static final Block INVERITE_LAMP_BLOCK = registerBLock("inverite_lamp_block",
        new InveriteLampBlock(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASEDRUM).strength(4f).requiresTool().luminance((state -> state.get(InveriteLampBlock.CLICKED) ? 15 : 0))));
    private static Block registerBLock(String name, Block block){
        registerBLockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(IDCTECH.MOD_ID, name), block);

    }
    public static void registerModBLocks(){
        IDCTECH.LOGGER.info("Registering custom blocks for"+ IDCTECH.MOD_ID);
    }
}

