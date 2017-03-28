package com.silvercraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class PBlock extends Block {

	public PBlock(Material material){
		super(material);
	}
	
	// To prevent X-Ray effect if usage transparent texture
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	//@Override
	public boolean renderAs(){
		return false;
	}
	
	//@Override
	//public int getRenderType(){
	//	return 1;
	//}
}
