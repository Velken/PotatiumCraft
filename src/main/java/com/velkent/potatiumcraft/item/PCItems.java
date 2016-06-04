package com.velkent.potatiumcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PCItems {

    public static ItemBase potatium_ingot;
    public static ItemBase potatium;
    public static ItemBase potatium_dust;
    public static ItemBase potatium_star;
    public static ItemBase potatium_wing;
    public static ItemBase potatium_eye;

    public static Item.ToolMaterial potatium_material;
    public static Item.ToolMaterial impure_potatium_material;

    public static ItemBase eye_potatium_sword;
    public static ItemBase potatium_sword;
    public static ItemBase impure_potatium_sword;


    public static void init()   {
            potatium_material = EnumHelper.addToolMaterial("potatium", 58, 10000, 100.0F, 100.0F, 100);
            impure_potatium_material =EnumHelper.addToolMaterial("impure_potaitum", 29, 5000, 50.0F, 50.0F, 50);


            potatium_ingot = register(new ItemBase("potatium_ingot").setCreativeTab(CreativeTabs.MATERIALS));
            potatium = register(new ItemBase("potatium").setCreativeTab(CreativeTabs.MATERIALS));
            potatium_dust = register(new ItemBase("potatium_dust").setCreativeTab(CreativeTabs.MATERIALS));
            potatium_star = register(new ItemBase("potatium_star").setCreativeTab(CreativeTabs.MATERIALS));
            potatium_wing = register(new ItemBase("potatium_wing").setCreativeTab(CreativeTabs.MATERIALS));
            potatium_eye = register(new ItemBase("potatium_eye").setCreativeTab(CreativeTabs.MATERIALS));


            eye_potatium_sword = (ItemBase) register(new ItemBase("eye_potatium_sword").setCreativeTab(CreativeTabs.COMBAT)).setMaxStackSize(1);
            potatium_sword = (ItemBase) register(new ItemBase("potatium_sword").setCreativeTab(CreativeTabs.COMBAT)).setMaxStackSize(1);
            impure_potatium_sword = (ItemBase) register(new ItemBase("impure_potatium_sword").setCreativeTab(CreativeTabs.COMBAT)).setMaxStackSize(1);

        }


    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if (item instanceof ItemBase) {
                ((ItemBase)item).registerItemModel();
        }

        return item;
       }


}
