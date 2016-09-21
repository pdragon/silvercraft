package com.silvercraft.gui;

import org.lwjgl.opengl.GL11;

//import com.silvercraft.main.MainRegistry;
import com.silvercraft.lib.Strings;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import buildcraft.core.lib.gui.GuiBuildCraft;
import buildcraft.core.lib.utils.StringUtils;

import com.silvercraft.tile_entity.SCTileAutoWorkbench;
//import buildcraft.factory.TileAutoWorkbench;
//import com.silvercraft.tile_entity.TileAutoWorkbench;

//import com.silvercraft.tile_entity.TileAutoWorkbench;

public class GuiAutoCrafting extends GuiBuildCraft{
	public static final ResourceLocation TEXTURE = new ResourceLocation(Strings.MODID+":textures/gui/autobench.png");
	private SCTileAutoWorkbench bench;

	public GuiAutoCrafting(InventoryPlayer inventoryplayer, World world, SCTileAutoWorkbench tile) {
		super(new ContainerAutoWorkbench(inventoryplayer, tile), tile, TEXTURE);
		this.bench = tile;
		xSize = 176;
		ySize = 197;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		String title = StringUtils.localize("tile.autoWorkbenchBlock.name");
		//fontRendererObj.drawString(title, getCenteredOffset(title), 6, 0x404040);
		fontRendererObj.drawString(title, 84, 4, 0x404040);
		//fontRendererObj.drawString(StringUtils.localize("gui.inventory"), 8, (ySize - 96) + 2, 0x404040);
		fontRendererObj.drawString(StringUtils.localize("gui.inventory"), 8, (ySize - 96) + 2 - 48, 0x404040);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int mouseX, int mouseY) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(TEXTURE);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		if (bench.progress > 0) {
			int progress = bench.getProgressScaled(23);
			drawTexturedModalRect(guiLeft + 89, guiTop + 45, 176, 0, progress + 1, 12);
		}
	}                         
}
