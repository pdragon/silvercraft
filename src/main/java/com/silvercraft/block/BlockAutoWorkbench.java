package com.silvercraft.block;
/*
import com.silvercraft.lib.Strings;
import com.silvercraft.main.ClientProxy;
import com.silvercraft.main.MainRegistry;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;

import net.minecraftforge.common.util.ForgeDirection;
import scala.util.Random;
*/


import com.silvercraft.main.MainRegistry;
import com.silvercraft.gui.ContainerAutoWorkbench;
import com.silvercraft.handler.SCGuiHandler;

import buildcraft.BuildCraftFactory;
import buildcraft.api.transport.IItemPipe;
import buildcraft.core.GuiIds;
import buildcraft.factory.TileAutoWorkbench;
//import buildcraft.core.ICustomTextureBlock;


import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;

public class BlockAutoWorkbench extends buildcraft.core.lib.block.BlockBuildCraft 
{
	public BlockAutoWorkbench(Material material) {
		super(material);
		setHardness(3.0F);
	} 
	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par6, float par7, float par8, float par9) {
		if (super.onBlockActivated(world, i, j, k, entityplayer, par6, par7, par8, par9)) {
			return true;
		}

		if (entityplayer.isSneaking()) {
			return false;
		}

		if (entityplayer.getCurrentEquippedItem() != null) {
			if (entityplayer.getCurrentEquippedItem().getItem() instanceof IItemPipe) {
				return false;
			}
		}

		if (!world.isRemote) {
			entityplayer.openGui(MainRegistry.modInstance, MainRegistry.GUI_ENUM.AUTOWRENCH.ordinal(), world, i, j, k);
		}

		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileAutoWorkbench();
	}
	 
}

/*
public class BlockAutoWrench extends BlockContainer
{

    private static boolean hasTileEntity;

    public BlockAutoWrench()
    {
        super(Material.rock);
        this.setBlockName("grinder");
       
        stepSound = soundTypeSnow;
        blockParticleGravity = 1.0F;
        slipperiness = 0.6F;
        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        lightOpacity = 20; // cast a light shadow
        setTickRandomly(false);
        useNeighborBrightness = false;
    }
    //@Override
    public Item getItemDropped(
          int state, //metadata 
          Random rand, 
          int fortune)
    {
        return Item.getItemFromBlock(this);
    }

    @Override
    public void onBlockAdded(World parWorld, int x, int y, int z)
    {
        //TODO: Добавить позиционирование блока (куда повёрнут будет при создании)
    }

    @Override
    public boolean onBlockActivated(
          World parWorld, 
          int x, int y, int z,
          EntityPlayer parPlayer,
          int parIBlockState,
          //EnumFacing parSide, 
          float hitX, 
          float hitY, 
          float hitZ)
    {
        if (!parWorld.isRemote)
        {
            parPlayer.openGui(MainRegistry.modInstance, 
                  MainRegistry.GUI_ENUM.AUTOWRENCH.ordinal(), 
                  parWorld, 
                  x, 
                  y, 
                  z
            ); 
        }
        return true;
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta)
    {
     // DEBUG
     System.out.println("BlockGrinder createNewTileEntity()");
        return new TileEntityGrinder();
    }

    @Override
    public void breakBlock(
          World worldIn, 
          int x, int y, int z,
          Block block,
          int state)
    {
        if (!hasTileEntity)
        {
            TileEntity tileentity = worldIn.getTileEntity(x,y,z);

            if (tileentity instanceof TileEntityGrinder)
            {
                InventoryHelper.dropInventoryItems(worldIn, pos, 
                      (TileEntityGrinder)tileentity);
                worldIn.updateComparatorOutputLevel(pos, this);
            }
        }

        super.breakBlock(worldIn, pos, state);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getItem(World worldIn, BlockPos pos)
    {
        return Item.getItemFromBlock(BlockSmith.blockGrinder);
    }

    @Override
    public int getRenderType()
    {
        return 3;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public IBlockState getStateForEntityRender(IBlockState state)
    {
        return getDefaultState().withProperty(FACING, EnumFacing.SOUTH);
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        EnumFacing enumfacing = EnumFacing.getFront(meta);

        if (enumfacing.getAxis() == EnumFacing.Axis.Y)
        {
            enumfacing = EnumFacing.NORTH;
        }

        return getDefaultState().withProperty(FACING, enumfacing);
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return ((EnumFacing)state.getValue(FACING)).getIndex();
    }

    @Override
    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {FACING});
    }

    @SideOnly(Side.CLIENT)
    static final class SwitchEnumFacing
    {
        static final int[] enumFacingArray = new int[EnumFacing.values()
              .length];

        static
        {
            try
            {
                enumFacingArray[EnumFacing.WEST.ordinal()] = 1;
            }
            catch (NoSuchFieldError var4)
            {
                ;
            }

            try
            {
                enumFacingArray[EnumFacing.EAST.ordinal()] = 2;
            }
            catch (NoSuchFieldError var3)
            {
                ;
            }

            try
            {
                enumFacingArray[EnumFacing.NORTH.ordinal()] = 3;
            }
            catch (NoSuchFieldError var2)
            {
                ;
            }

            try
            {
                enumFacingArray[EnumFacing.SOUTH.ordinal()] = 4;
            }
            catch (NoSuchFieldError var1)
            {
                // You should improve the error handling here
            }
        }
    }
}
*/