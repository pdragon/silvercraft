package com.silvercraft.block;

import com.silvercraft.lib.Strings;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockAutoWrench extends Block{

	public BlockAutoWrench(Material material) {
		super(material);
		
	}
	public boolean onBlockActivated(World world, int x, int y, int z, 
			EntityPlayer player, int f, float fi, float fj, float fk){
		//FMLNetworkHandler.openGui(entityPlayer, mod, modGuiId, world, x, y, z);
		player.openGui(Strings.MODID, 0, world, x, y, z);
		return true;
	}

}
