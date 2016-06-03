package com.velkent.potatiumcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PCItems {

    public static ItemBase potatium_ingot;
    public static ItemBase potatium;

    public static Item.ToolMaterial potatium_material;

    public static ItemBase eye_potatium_sword;



    public static void init()   {
            potatium_material = EnumHelper.addToolMaterial("potatium", 58, 10000, 100.0F, 100.0F, 100);


            potatium_ingot = register(new ItemBase("potatium_ingot").setCreativeTab(CreativeTabs.MATERIALS));
            potatium = register(new ItemBase("potatium").setCreativeTab(CreativeTabs.MATERIALS));
            eye_potatium_sword = (ItemBase) register(new ItemBase("eye_potatium_sword").setCreativeTab(CreativeTabs.COMBAT)).setMaxStackSize(1);

        }


    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if (item instanceof ItemBase) {
                ((ItemBase)item).registerItemModel();
        }

        return item;
       }


}
