package net.kaden.idctech.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kaden.idctech.IDCTECH;
import net.kaden.idctech.item.custom.DataTabletItem;
import net.kaden.idctech.item.custom.wrench;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
//public static final Item TEST_ITEM = registerItem("test_item", new Item(new FabricItemSettings()));

    public static final Item INVERITE = registerItem("inverite", new Item(new FabricItemSettings()));
    public static final Item RAW_INVERITE = registerItem("raw_inverite", new Item(new FabricItemSettings()));
    public static final Item WRENCH = registerItem("wrench", new wrench(new FabricItemSettings()));
    public static final Item INVERITE_SWORD = registerItem("inverite_sword", new SwordItem(ModToolMaterial.INVERITE,3,2f, new FabricItemSettings()));
    public static final Item INVERITE_SHOVEL = registerItem("inverite_shovel", new ShovelItem(ModToolMaterial.INVERITE,-2,2f, new FabricItemSettings()));
    public static final Item INVERITE_PICKAXE = registerItem("inverite_pickaxe", new PickaxeItem(ModToolMaterial.INVERITE,0,2f, new FabricItemSettings()));
    public static final Item INVERITE_AXE = registerItem("inverite_axe", new AxeItem(ModToolMaterial.INVERITE,5,2f, new FabricItemSettings()));
    public static final Item INVERITE_HOE = registerItem("inverite_hoe", new HoeItem(ModToolMaterial.INVERITE,-3,2f, new FabricItemSettings()));
//utility items
    public static final Item DATA_TABLET = registerItem("data_table", new DataTabletItem(new FabricItemSettings()));




    private  static Item registerItem(String name, Item item){
     return Registry.register(Registries.ITEM, new Identifier(IDCTECH.MOD_ID, name), item);
    }
    public static void registerModITems(){
    IDCTECH.LOGGER.info("Registering custom items for"+ IDCTECH.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS);

    }
}
