package com.velkent.potatiumcraft.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMetal1 extends BlockBase{

    public BlockMetal1(String name) {
        super(Material.IRON, name);

        setHardness(4f);
        setResistance(10f);
    }

    @Override
    public BlockMetal1 setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }


}
