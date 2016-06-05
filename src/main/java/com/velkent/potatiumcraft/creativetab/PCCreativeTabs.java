package com.velkent.potatiumcraft.creativetab;

import com.velkent.potatiumcraft.item.PCItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class PCCreativeTabs extends CreativeTabs {
    public PCCreativeTabs(int index, String label){
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return null;
    }


    public static final PCCreativeTabs PCMain = new PCCreativeTabs(CreativeTabs.getNextID(), "main") {

        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return PCItems.potatium;
        }


    };

    public static final PCCreativeTabs PCWeapon = new PCCreativeTabs(CreativeTabs.getNextID(), "weapon"){
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem(){ return PCItems.potatium_sword; }
    };
}

