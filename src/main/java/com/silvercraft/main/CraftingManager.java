package com.silvercraft.main;


import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.silvercraft.item.SCItem;
import com.silvercraft.block.SCBlock;

import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {

	public static void mainRegistry() {
		addCraftingRecipies();
		addSmeltingRecipies();
	}

	public static void addCraftingRecipies() {
		// Shaped Recipie		
    	
    	GameRegistry.addRecipe(new ItemStack(SCItem.itemSilverIngot), new Object[]{"NNN","NNN","NNN", 'N', SCItem.itemSilverNugget});
    	GameRegistry.addRecipe(new ItemStack(SCItem.itemSilverNugget, 9), new Object[]{"   "," I ","   ", 'I', SCItem.itemSilverIngot});
    	GameRegistry.addRecipe(new ItemStack(SCItem.itemSilverSword), new Object[]{" I "," I "," S ", 'I', SCItem.itemSilverIngot, 'S', Items.stick});
    	GameRegistry.addRecipe(new ItemStack(SCItem.itemSilverHoe), new Object[]{" II"," S "," S ", 'I', SCItem.itemSilverIngot, 'S', Items.stick});
    	GameRegistry.addRecipe(new ItemStack(SCItem.itemSilverHoe), new Object[]{"II "," S "," S ", 'I', SCItem.itemSilverIngot, 'S', Items.stick});
    	GameRegistry.addRecipe(new ItemStack(SCItem.itemSilverShovel), new Object[]{" I "," S "," S ", 'I', SCItem.itemSilverIngot, 'S', Items.stick});
    	GameRegistry.addRecipe(new ItemStack(SCBlock.blockSilverStorage), new Object[]{"III","III","III", 'I', SCItem.itemSilverIngot});
    	GameRegistry.addRecipe(new ItemStack(SCItem.itemSilverIngot, 9), new Object[]{"I", 'I', SCBlock.blockSilverStorage});
    	GameRegistry.addRecipe(new ItemStack(SCBlock.blockAutoWrench), new Object[]{" I ","   ","I I", 'I', SCItem.itemSilverIngot});
    	
    
		//Shapeless Recipie
		GameRegistry.addShapelessRecipe(new ItemStack(SCItem.itemSilverNugget, 10), new Object[]{Blocks.dirt , Blocks.cobblestone});
		
		Create("oreSilver", SCBlock.blockOreSilver);
    	Create("blockSilver",  SCBlock.blockSilverStorage);
        Create("ingotSilver", SCItem.itemSilverIngot);
        Create("nuggetSilver", SCItem.itemSilverNugget);
	}

	public static void addSmeltingRecipies() {
		GameRegistry.addSmelting(new ItemStack(Blocks.coal_block, 64), new ItemStack(Items.diamond), 20.2F);
		GameRegistry.addSmelting(SCBlock.blockOreSilver, new ItemStack(SCItem.itemSilverIngot), 20.1F);
	}
	private static void Create(String oreName, Block ore){
    	OreDictionary.registerOre(oreName, new ItemStack(ore));
		GameRegistry.registerCustomItemStack(oreName, new ItemStack(ore));
		FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(ore)); 
    }
    private static void Create(String oreName, Item ore){
    	OreDictionary.registerOre(oreName, new ItemStack(ore));
		GameRegistry.registerCustomItemStack(oreName, new ItemStack(ore));
		FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(ore)); 
    }
}
