package DavieDoo.spectrobes.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockFossil extends Block{

	public BlockFossil(Material materialIn) {
		super(materialIn);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isOpaqueCube() {
		
		return false;
	}

}