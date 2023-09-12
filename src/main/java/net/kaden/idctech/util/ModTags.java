package net.kaden.idctech.util;

import net.kaden.idctech.IDCTECH;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> ISVALUABLEBLOCK = createBlockTag("isvaluableblock");
        public static final TagKey<Block> ISVALUABLEBLOCK2 = createBlockTag("isvaluableblock2");
        public static final TagKey<Block> ISVALUABLEBLOCK3 = createBlockTag("isvaluableblock3");
        public static final TagKey<Block> ISVALUABLEBLOCK4 = createBlockTag("isvaluableblock4");
        public static final TagKey<Block> ISWRENCHABLE = createBlockTag("iswrenchable");
        public static final TagKey<Block> ORE = createBlockTag("ore");
        public static final TagKey<Block> METAL_BLOCKS = createBlockTag("metal_blocks");



        public static TagKey<Block> createBlockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(IDCTECH.MOD_ID, name));
        }
        private static TagKey<Block> createForgeBlockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier("c", name));



        }


    }
    public static class Items {

        public static final TagKey<Item> METALS = createItemTag("metals");
        public static final TagKey<Item> RARE = createItemTag("rare");
        public static final TagKey<Item> TECH = createItemTag("tech");
        private static TagKey<Item> createItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(IDCTECH.MOD_ID, name));


        }

        private static TagKey<Item> createCommonItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier("c", name));
        }
    }}