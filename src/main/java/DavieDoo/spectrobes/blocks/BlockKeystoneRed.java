package DavieDoo.spectrobes.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class BlockKeystoneRed extends Block{
	
	public static final BlockKeystoneRed Instance = new BlockKeystoneRed();
	public static final String name = "keystone_red";
	
	public BlockKeystoneRed() {
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
