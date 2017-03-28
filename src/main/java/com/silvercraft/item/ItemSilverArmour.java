package com.silvercraft.item;

import com.silvercraft.lib.Strings;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemSilverArmour  extends ItemArmor{

	public ItemSilverArmour(ArmorMaterial armourMaterial, int renderIndex, int armourType) {
		super(armourMaterial, renderIndex, armourType);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(this.armorType == 2)
		{
			return Strings.MODID+":textures/models/armor/Silver_2.png";
		}
		return Strings.MODID+":textures/models/armor/Silver_1.png";
	} 
	
	/**
	 * Called to tick armor in the armor slot. Override to do something
	 * 
	 * @param world
	 * @param player
	 * @param itemStack
	 */
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if(player.getCurrentArmor(3) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(1) != null){
			/*
			ItemStack helmet = player.getCurrentArmor(3);
			ItemStack plate = player.getCurrentArmor(2);
			ItemStack pants = player.getCurrentArmor(1);
			if(helmet.getItem() == SCItem.itemSilverHelmet && plate.getItem() == SCItem.itemSilverPlate && pants.getItem() == SCItem.itemSilverLeggings)
			{
				//player.addPotionEffect(new PotionEffect(Potion.confusion.getId(), 100, 1));
				player.capabilities.allowFlying = true;				
			}else{
				player.capabilities.allowFlying = false;
				System.out.println("tick");
			}
			*/
		}
		
		if(player.getCurrentArmor(0) != null){
			ItemStack boots = player.getCurrentArmor(0);
			if(boots.getItem() == SCItem.itemSilverBoots){
				player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 100, 1));
			}
		}
	}

}
