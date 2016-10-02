package DavieDoo.spectrobes.blocks;

import java.util.Random;

import DavieDoo.spectrobes.SpectrobesMod;
import DavieDoo.spectrobes.init.SpectrobesItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockFossil extends Block{

	public BlockFossil(Material materialIn) {
		super(materialIn);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isOpaqueCube() {
		
		return false;
	}
	
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return SpectrobesItems.itemKomapod;
    }
	
	

}
