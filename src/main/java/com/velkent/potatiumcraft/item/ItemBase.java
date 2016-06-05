package com.velkent.potatiumcraft.item;


import com.velkent.potatiumcraft.creativetab.PCCreativeTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.velkent.potatiumcraft.PCraft;


public class ItemBase extends Item {

    protected String name;

    public ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(PCCreativeTabs.PCMain);
    }

    public void registerItemModel() {
        PCraft.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}