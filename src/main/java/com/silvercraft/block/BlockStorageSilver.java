package com.silvercraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockStorageSilver extends Block {

	public BlockStorageSilver(Material material) {
		super(material);
		this.blockHardness = 2.0F;
		this.lightValue = 30;
		//setHasSubtypes(true);
		//setMaxDamage(0);
	}
}
