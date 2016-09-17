package com.silvercraft.creativetabs;

import net.minecraft.creativetab.CreativeTabs;

public class SCCreativeTabs{
	public static CreativeTabs tabSilver;
	public static void initialiseTabs(){ 
		tabSilver = new SilverCreativeTabBlock("TabSilver");
	}
}