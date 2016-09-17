package com.silvercraft.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.silvercraft.block.SCBlock;

public class SilverCreativeTabBlock extends CreativeTabs {

	public SilverCreativeTabBlock(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(SCBlock.blockSilverStorage);
	}

}
