package com.silvercraft.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.silvercraft.gui.ContainerAutoWorkbench;
import com.silvercraft.gui.GuiAutoCrafting;
//import com.silvercraft.lib.SCWorld;
import com.silvercraft.main.MainRegistry;
import com.silvercraft.tile_entity.SCTileAutoWorkbench;

import buildcraft.factory.TileAutoWorkbench;

//import com.silvercraft.tile_entity.TileAutoWorkbench;

//import buildcraft.factory.TileAutoWorkbench;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class SCGuiHandler implements IGuiHandler {
	
	public static final int MOD_TILE_ENTITY_GUI = 0;
	//public static final int MOD_TILE_ENTITY_GUI1 = 1;
	
	public SCGuiHandler (){
		System.out.println("SCGuiHandler");
	}
	
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		System.out.println("getServerGuiElement");
		if(id == MOD_TILE_ENTITY_GUI){
			//NetworkRegistry.INSTANCE.registerGuiHandler(MainRegistry.modInstance, new AWGuiHandler());
		}
		if(id == MainRegistry.GUI_ENUM.AUTOWRENCH.ordinal()){ 
			SCTileAutoWorkbench tileAutoWorkbench = (SCTileAutoWorkbench) world.getTileEntity(x, y, z);
			return new ContainerAutoWorkbench(player.inventory, tileAutoWorkbench);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		System.out.println("getClientGuiElement");
		if(ID == MOD_TILE_ENTITY_GUI){
			//NetworkRegistry.INSTANCE.registerGuiHandler(MainRegistry.modInstance, new AWGuiHandler());
		}
		if(ID == MainRegistry.GUI_ENUM.AUTOWRENCH.ordinal()){
			SCTileAutoWorkbench tileAutoWorkbench = (SCTileAutoWorkbench) world.getTileEntity(x, y, z);
			return new GuiAutoCrafting(player.inventory, world, tileAutoWorkbench);
		}
		return null;
	}

}
