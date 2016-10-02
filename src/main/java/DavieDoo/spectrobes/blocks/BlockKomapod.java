package DavieDoo.spectrobes.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class BlockKomapod extends Block{
	
	public static final BlockKomapod Instance = new BlockKomapod();
	public static final String name = "komapod";
	
	public BlockKomapod() {
		super(Material.glass);
		
		
	}
	
	@Override
	public boolean isOpaqueCube() {
		
		return false;
	}
	
	@Override
	public boolean isFullCube() {
		
		return false;
		
	}

	@Override
	public int getRenderType() {
		
		return 3;
		
	}
	
	
}