package com.velkent.potatiumcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PCItems {

        public static ItemBase potatium_ingot;

    public static void init() {
            potatium_ingot = register(new ItemBase("potatium_ingot").setCreativeTab(CreativeTabs.MATERIALS));
        }

        private static <T extends Item> T register(T item) {
            GameRegistry.register(item);

            if (item instanceof ItemBase) {
                ((ItemBase)item).registerItemModel();
            }

            return item;
        }


}
