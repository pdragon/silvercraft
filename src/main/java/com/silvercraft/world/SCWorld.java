package com.silvercraft.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraft.item.ItemStack;

import com.silvercraft.block.SCBlock;

public class SCWorld {
	public static void mainRegistry(){
		initialiseWorldGen();
		registerLootInCheasts();
	}
	
	public static void initialiseWorldGen(){
		registerWorldGen(new SCWorldGenOre(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProberblity){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProberblity);
	}
	private static void registerLootInCheasts(){
		// В сундуках автогенерируемых строений периодически будет встречаться от 1 до 10 блоков серебра
    	ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST,
                new WeightedRandomChestContent(new ItemStack(SCBlock.blockSilverStorage), 1, 10, 3));
	}
}
