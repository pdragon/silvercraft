package com.silvercraft.main;

import com.silvercraft.creativetabs.SCCreativeTabs;
import com.silvercraft.item.SCItem;
import com.silvercraft.lib.Strings;
import com.silvercraft.world.SCWorld;
import com.silvercraft.block.SCBlock;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = Strings.MODID, name = Strings.name, version = Strings.version)
public class MainRegistry
{
	@SidedProxy(clientSide = "com.silvercraft.main.ClientProxy", serverSide = "com.silvercraft.main.ServerProxy") 
	public static ServerProxy proxy;
	
	@Instance(Strings.MODID)
	public static MainRegistry modInstance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	SCCreativeTabs.initialiseTabs();
		SCBlock.mainRegistry();
		SCItem.mainRegistry();
		//SCEntity.mainRegistry();
		SCWorld.mainRegistry();
		CraftingManager.mainRegistry();
		//SCHooks.mainRegistry();
		
		proxy.registerTileEntities();
		proxy.registerRenderThings(); 
    	
    }
    @EventHandler
    public void init(FMLInitializationEvent event){
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	
    }
}