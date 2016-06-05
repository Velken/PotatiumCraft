package com.velkent.potatiumcraft.item;

import com.velkent.potatiumcraft.creativetab.PCCreativeTabs;
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



    public static PCSword eye_potatium_sword;
    public static PCSword potatium_sword;
    public static PCSword impure_potatium_sword;



    public static void init()   {

            potatium_ingot = register(new ItemBase("potatium_ingot"));
            potatium = register(new ItemBase("potatium"));
            potatium_dust = register(new ItemBase("potatium_dust"));
            potatium_star = register(new ItemBase("potatium_star"));
            potatium_wing = register(new ItemBase("potatium_wing"));
            potatium_eye = register(new ItemBase("potatium_eye"));

            eye_potatium_sword = register(new PCSword("eye_potatium_sword", PCMaterials.pure_potatium_material));
            potatium_sword = register(new PCSword("potatium_sword", PCMaterials.potatium_material));
            impure_potatium_sword = register(new PCSword("impure_potatium_sword", PCMaterials.impure_potatium_material));

        }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if (item instanceof ItemBase) {
                ((ItemBase)item).registerItemModel();
        }

        return item;
       }


}
