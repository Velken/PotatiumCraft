package com.velkent.potatiumcraft.block;

import com.velkent.potatiumcraft.creativetab.PCCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class PCBlocks {

    //ores tier 1
    public static BlockOre ore_potatium;

    //metals tier 1
    public static BlockMetal1 potatium_eye_block;

    public static void init() {
        ore_potatium = register(new BlockOre("ore_potatium").setCreativeTab(PCCreativeTabs.PCMain));
        potatium_eye_block = register(new BlockMetal1("potatium_eye_block").setCreativeTab(PCCreativeTabs.PCMain));
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        GameRegistry.register(itemBlock);

        if (block instanceof BlockBase) {
            ((BlockBase)block).registerItemModel(itemBlock);
        }

        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
