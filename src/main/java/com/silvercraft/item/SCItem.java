package com.silvercraft.item;

import com.silvercraft.lib.Strings;
import com.silvercraft.creativetabs.SCCreativeTabs;
import com.silvercraft.item.ItemIngotSilver;
import com.silvercraft.item.ItemNuggetSilver;
import com.silvercraft.item.ItemSilverArmour;
import com.silvercraft.item.ItemSilverAxe;
import com.silvercraft.item.ItemSilverHoe;
import com.silvercraft.item.ItemSilverPickAxe;
import com.silvercraft.item.ItemSilverShears;
import com.silvercraft.item.ItemSilverShovel;
import com.silvercraft.item.ItemSilverSword;

import cpw.mods.fml.common.registry.GameRegistry;
//import com.silvercraft.main.Item;
//import com.silvercraft.main.ItemArmor;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

public class SCItem {
	public static void mainRegistry() {
		initialiseItem();
		registerItem();
	}  
	public static final Item.ToolMaterial silverToolMaterial = EnumHelper.addToolMaterial("silverToolMaterial", 4, 400, 10.0F, 6.0F, 30);
    public static final ItemArmor.ArmorMaterial silverArmourMaterial = EnumHelper.addArmorMaterial("silverArmourMaterial", 5000, new int[]{3,5,4,2}, 30);
    
    public static Item itemSilverIngot;
    public static Item itemSilverNugget;
    
    public static Item itemSilverPickaxe;
    public static Item itemSilverAxe;
    public static Item itemSilverShovel;
    public static Item itemSilverHoe;
    public static Item itemSilverSword;
    public static Item itemSilverShears;
    
    public static Item itemSilverHelmet;
    public static Item itemSilverPlate;
    public static Item itemSilverLeggings;
    public static Item itemSilverBoots;
    
    public static void initialiseItem() {

    	itemSilverIngot = 	new ItemIngotSilver().setUnlocalizedName("IngotSilver").setTextureName(Strings.MODID+":IngotSilver").setCreativeTab(SCCreativeTabs.tabSilver);
    	itemSilverNugget = 	new ItemNuggetSilver().setUnlocalizedName("NuggetSilver").setTextureName(Strings.MODID+":NuggetSilver").setCreativeTab(SCCreativeTabs.tabSilver);    	
    	
    	itemSilverPickaxe = new ItemSilverPickAxe(silverToolMaterial).setUnlocalizedName("itemSilverPickaxe").setTextureName(Strings.MODID+":SilverPickaxe").setCreativeTab(SCCreativeTabs.tabSilver);
    	itemSilverAxe = 	new ItemSilverAxe(silverToolMaterial).setUnlocalizedName("itemSilverAxe").setTextureName(Strings.MODID+":SilverAxe").setCreativeTab(SCCreativeTabs.tabSilver);
    	itemSilverSword = 	new ItemSilverSword(silverToolMaterial).setUnlocalizedName("itemSilverSword").setTextureName(Strings.MODID+":SilverSword").setCreativeTab(SCCreativeTabs.tabSilver);
    	itemSilverHoe = 	new ItemSilverHoe(silverToolMaterial).setUnlocalizedName("itemSilverHoe").setTextureName(Strings.MODID+":SilverHoe").setCreativeTab(SCCreativeTabs.tabSilver);
    	itemSilverShovel = 	new ItemSilverShovel(silverToolMaterial).setUnlocalizedName("itemSilverShovel").setTextureName(Strings.MODID+":SilverShovel").setCreativeTab(SCCreativeTabs.tabSilver);
    	itemSilverShears = 	new ItemSilverShears(silverToolMaterial).setUnlocalizedName("itemSilverShears").setTextureName(Strings.MODID+":SilverShears").setCreativeTab(SCCreativeTabs.tabSilver);
    	
    	
    	itemSilverHelmet   = new ItemSilverArmour(silverArmourMaterial, 0, 0).setUnlocalizedName("itemSilverHelmet").setTextureName(Strings.MODID+":SilverHelmet").setCreativeTab(SCCreativeTabs.tabSilver);
    	itemSilverPlate    = new ItemSilverArmour(silverArmourMaterial, 0, 1).setUnlocalizedName("itemSilverPlate").setTextureName(Strings.MODID+":SilverChestplate").setCreativeTab(SCCreativeTabs.tabSilver);
    	itemSilverLeggings = new ItemSilverArmour(silverArmourMaterial, 0, 2).setUnlocalizedName("itemSilverLeggings").setTextureName(Strings.MODID+":SilverLegs").setCreativeTab(SCCreativeTabs.tabSilver);
    	itemSilverBoots    = new ItemSilverArmour(silverArmourMaterial, 0, 3).setUnlocalizedName("itemSilverBoots").setTextureName(Strings.MODID+":SilverBoots").setCreativeTab(SCCreativeTabs.tabSilver);
    	
    }
    public static void registerItem() {
    	GameRegistry.registerItem(itemSilverHelmet, itemSilverHelmet.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemSilverPlate, itemSilverPlate.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemSilverLeggings, itemSilverLeggings.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemSilverBoots, itemSilverBoots.getUnlocalizedName().substring(5));
    	
    	GameRegistry.registerItem(itemSilverPickaxe, itemSilverPickaxe.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemSilverAxe, itemSilverAxe.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemSilverSword, itemSilverSword.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemSilverHoe, itemSilverHoe.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemSilverShovel, itemSilverShovel.getUnlocalizedName().substring(5));
    	
    	GameRegistry.registerItem(itemSilverNugget, itemSilverNugget.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemSilverIngot, itemSilverIngot.getUnlocalizedName().substring(5));
   
    }
}
