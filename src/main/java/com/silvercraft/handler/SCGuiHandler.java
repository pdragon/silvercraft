package com.silvercraft.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

//import com.silvercraft.gui.GuiTutFurnace;
//import com.silvercraft.inventory.ContainerTutFurnace;
//import com.silvercraft.tile_entity.TileEntityTutFurnace;

import cpw.mods.fml.common.network.IGuiHandler;

public class SCGuiHandler implements IGuiHandler {
	
	public static final int MOD_TILE_ENTITY_GUI = 0;
	
	public SCGuiHandler (){
		
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == MOD_TILE_ENTITY_GUI){
			//TileEntityTutFurnace tileEntityFurnace = (TileEntityTutFurnace) world.getTileEntity(x, y, z);
			//return new ContainerTutFurnace(player.inventory, tileEntityFurnace);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == MOD_TILE_ENTITY_GUI){
			//TileEntityTutFurnace tileEntityTestContainer = (TileEntityTutFurnace) world.getTileEntity(x, y, z);
			//return new GuiTutFurnace(player.inventory, tileEntityTestContainer);
		}
		return null;
	}

}
