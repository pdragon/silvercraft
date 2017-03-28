package com.silvercraft.block;

import net.minecraft.block.material.Material;

public class BlockOreSilver extends PBlock{

	public BlockOreSilver(Material material) {
		super(material);
		this.setResistance(10.0F);
		this.setHardness(5.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setLightLevel(1.0F); 
	}

}
