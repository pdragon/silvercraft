package com.silvercraft.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

import buildcraft.core.lib.gui.BuildCraftContainer;
import buildcraft.core.lib.gui.slots.SlotOutput;
import buildcraft.core.lib.gui.slots.SlotUntouchable;

import buildcraft.factory.gui.SlotWorkbench;

import com.silvercraft.tile_entity.SCTileAutoWorkbench;
//import buildcraft.factory.TileAutoWorkbench;
//import com.silvercraft.tile_entity.TileAutoWorkbench;


public class ContainerAutoWorkbench extends BuildCraftContainer {

    public IInventory craftResult;

    private final SCTileAutoWorkbench tile;
    private int lastProgress;
    private ItemStack prevOutput;

	public ContainerAutoWorkbench(InventoryPlayer inventoryplayer, SCTileAutoWorkbench t) {
		super(t.getSizeInventory());
		
		craftResult = new InventoryCraftResult();
		this.tile = t;
		//addSlotToContainer(new SlotUntouchable(craftResult, 0, 93, 27));
		addSlotToContainer(new SlotUntouchable(craftResult, 0, 93, 15));
		//addSlotToContainer(new SlotOutput(tile, TileAutoWorkbench.SLOT_RESULT, 124, 35));
		addSlotToContainer(new SlotOutput(tile, SCTileAutoWorkbench.SLOT_RESULT, 124, 23));
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				//addSlotToContainer(new SlotWorkbench(tile, 10 + x + y * 3, 30 + x * 18, 17 + y * 18));
				addSlotToContainer(new SlotWorkbench(tile, 10 + x + y * 3, 30 + x * 18, 5 + y * 18));
			}
		}
		
		for (int x = 0; x < 9; x++) {
			addSlotToContainer(new Slot(tile, x, 8 + x * 18, 64));
		}
		
		for (int x = 0; x < 9; x++) {
			addSlotToContainer(new Slot(tile, x, 8 + x * 18, 84));
		}

		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 9; x++) {
				addSlotToContainer(new Slot(inventoryplayer, x + y * 9 + 9, 8 + x * 18, 115 + y * 18));
			}
		}

		for (int x = 0; x < 9; x++) {
			addSlotToContainer(new Slot(inventoryplayer, x, 8 + x * 18, 173));
		}

		onCraftMatrixChanged(tile);
	}  

    @Override
    public void updateProgressBar(int id, int data) {
        switch (id) {
            case 0:
                tile.progress = data;
                break;
        }
    }

    @Override
    public final void onCraftMatrixChanged(IInventory inv) {
        super.onCraftMatrixChanged(inv);
        tile.craftMatrix.rebuildCache();
        ItemStack output = tile.craftMatrix.getRecipeOutput();
        craftResult.setInventorySlotContents(0, output);
    }

    @Override
    public ItemStack slotClick(int i, int j, int modifier, EntityPlayer entityplayer) {
        ItemStack stack = super.slotClick(i, j, modifier, entityplayer);
        onCraftMatrixChanged(tile.craftMatrix);
        return stack;
    }

    @Override
    public boolean canInteractWith(EntityPlayer entityplayer) {
        return tile.isUseableByPlayer(entityplayer);
    }
}

