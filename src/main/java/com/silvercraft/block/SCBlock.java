package com.silvercraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.silvercraft.lib.Strings;
import com.silvercraft.block.BlockAutoWrench;
import com.silvercraft.block.BlockOreSilver;
import com.silvercraft.block.BlockStorageSilver;
import com.silvercraft.creativetabs.SCCreativeTabs;

import cpw.mods.fml.common.registry.GameRegistry;

public class SCBlock{
	
	public static Block blockAutoWrench;
    public static Block blockOreSilver;
    public static Block blockSilverStorage;
	
	public static void mainRegistry() {
		initialiseBlock();
		registerBlock();
	}
	
	public static void initialiseBlock(){
		blockAutoWrench = 	new BlockAutoWrench(Material.wood).setBlockName("Ore_Silver").setBlockTextureName(Strings.MODID+":AutoWrench").setCreativeTab(SCCreativeTabs.tabSilver);
		//blockAutoWrench = 	new CustomBlockTileEntity(Material.wood).setBlockName("Ore_Silver").setBlockTextureName(Strings.MODID+":AutoWrench").setCreativeTab(SCCreativeTabs.tabSilver);
    	blockOreSilver = 	new BlockOreSilver(Material.rock).setBlockName("blockOreSilver").setBlockTextureName(Strings.MODID+":Ore_Silver").setCreativeTab(SCCreativeTabs.tabSilver);
    	blockSilverStorage= new BlockStorageSilver(Material.iron).setBlockName("StorageSilver").setBlockTextureName(Strings.MODID+":Block_Silver").setCreativeTab(SCCreativeTabs.tabSilver);
	}
	public static void registerBlock() {
		GameRegistry.registerBlock(blockOreSilver, Strings.MODID + blockOreSilver.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(blockSilverStorage, Strings.MODID + blockSilverStorage.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(blockAutoWrench, Strings.MODID + blockAutoWrench.getUnlocalizedName().substring(5));
	}

}
