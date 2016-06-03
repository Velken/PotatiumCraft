package com.velkent.potatiumcraft;

import com.velkent.potatiumcraft.item.PCItems;
import com.velkent.potatiumcraft.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = PCraft.modId, name = PCraft.name, version = PCraft.version, acceptedMinecraftVersions = "[1.9.4]")
public class PCraft {
    public static final String modId = "potatiumcraft";
    public static final String name = "Potatium Craft";
    public static final String version = "0.0.1";

    @SidedProxy(serverSide = "com.velkent.potatiumcraft.proxy.CommonProxy", clientSide = "com.velkent.potatiumcraft.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.Instance(modId)
    public static PCraft instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        PCItems.init();
        System.out.println("ALL HAIL THE GREAT POTATIUM GOD!!!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("THE GREAT POTATIUM GOD HAS HEARD OUR CRY FOR HELP!!!!");

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("THOU WHO DARES TO AWAKES THE POTATIUM GOD SHALL SUFFER!!!");

    }

}
