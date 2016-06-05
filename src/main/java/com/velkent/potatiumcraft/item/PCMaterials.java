package com.velkent.potatiumcraft.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class PCMaterials {
    public static Item.ToolMaterial potatium_material = EnumHelper.addToolMaterial("potatium", 58, 10000, 100.0F, 100.0F, 100).setRepairItem(new ItemStack(PCItems.potatium_ingot));
    public static Item.ToolMaterial impure_potatium_material = EnumHelper.addToolMaterial("impure_potatium", 58, 10000, 100.0F, 100.0F, 100);
    public static Item.ToolMaterial pure_potatium_material = EnumHelper.addToolMaterial("pure_potatium", 58, 100000, 10000.0F, 10000.0F, 150).setRepairItem(new ItemStack(PCItems.potatium_star));

}
