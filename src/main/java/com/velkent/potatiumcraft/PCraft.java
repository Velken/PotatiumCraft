package com.velkent.potatiumcraft;

import com.velkent.potatiumcraft.block.PCBlocks;
import com.velkent.potatiumcraft.item.PCItems;
import com.velkent.potatiumcraft.proxy.CommonProxy;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;



@Mod(modid = PCraft.modId, name = PCraft.name, version = PCraft.version, acceptedMinecraftVersions = "[1.10.0]")
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
        FMLLog.info("BOOTING UP");
        PCItems.init();
        PCBlocks.init();
        FMLLog.info("BIP BIP BOP, SYSTEM BOOTED");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        FMLLog.info("STARTING PotatiumOS");

        FMLLog.info("STARTED PotatiumOS");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        FMLLog.info("[PotatiumOS]: LOGGING IN...");

        FMLLog.info("[PotatiumOS]: ACCESS DENIED! EXTERMINATE!");
    }

}
