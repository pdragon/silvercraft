package com.silvercraft.main;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.silvercraft.block.SCBlock;
import com.silvercraft.gui.info_book.GuiBook;
//import com.silvercraft.entity.EntityGrenade;
//import com.silvercraft.entity.EntityTutMob;
import com.silvercraft.item.SCItem;
//import com.silvercraft.model.ModelTutMob;
//import com.silvercraft.render.RenderTutMob;
//import com.silvercraft.render.item.ItemRenderTutChest;
//import com.silvercraft.render.tile_entity.TutChestRenderer;
//import com.silvercraft.tile_entity.TileEntityTutChest;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	
	public void registerRenderThings(){
		
		//RenderingRegistry.registerEntityRenderingHandler(EntityTutMob.class, new RenderTutMob(new ModelTutMob(), 0));
		//RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new RenderSnowball(TMItem.tutGrenade));
		
		//ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTutChest.class, new TutChestRenderer());
		//MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(TMBlock.tutChest), new ItemRenderTutChest());
	}
	
	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
	//@Override
	public static void openBookGui()
	{
	     Minecraft.getMinecraft().displayGuiScreen(new GuiBook());
	}
}
