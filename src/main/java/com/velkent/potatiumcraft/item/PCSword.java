package com.velkent.potatiumcraft.item;

import com.velkent.potatiumcraft.PCraft;
import com.velkent.potatiumcraft.creativetab.PCCreativeTabs;
import net.minecraft.item.ItemSword;

public class PCSword extends ItemSword {

    private final float attackDamage;
    private final ToolMaterial material;

    public PCSword(String name, ToolMaterial material) {
        super(material);
        this.material = material;
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(PCCreativeTabs.PCWeapon);
        this.setMaxDamage(material.getMaxUses());
        this.attackDamage = 3.0F + this.material.getDamageVsEntity();
        this.setMaxStackSize(1);
        PCraft.proxy.registerItemRenderer(this, 0, name);
    }


}
