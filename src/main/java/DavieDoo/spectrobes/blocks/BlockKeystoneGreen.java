package DavieDoo.spectrobes.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockKeystoneGreen extends Block{
	
	public static final BlockKeystoneGreen Instance = new BlockKeystoneGreen();
	public static final String name = "keystone_red";
	
	public BlockKeystoneGreen() {
		super(Material.glass);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
		
		
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
