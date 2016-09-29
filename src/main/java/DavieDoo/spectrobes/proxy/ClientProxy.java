package DavieDoo.spectrobes.proxy;

import DavieDoo.spectrobes.Reference;
import DavieDoo.spectrobes.blocks.BlockKeystoneBlue;
import DavieDoo.spectrobes.blocks.BlockKeystoneGreen;
import DavieDoo.spectrobes.blocks.BlockKeystoneRed;
import DavieDoo.spectrobes.blocks.BlockKomapod;
import DavieDoo.spectrobes.init.SpectrobesBlocks;
import DavieDoo.spectrobes.init.SpectrobesItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.obj.OBJLoader;

public class ClientProxy extends CommonProxy{
	
	 @Override
     public void preInit() {
         //super.preInit(e);

         OBJLoader.instance.addDomain(Reference.MOD_ID.toLowerCase());

     }
	 
	 @Override
	 public void init() {
		 
		 RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		 renderItem.getItemModelMesher().register(Item.getItemFromBlock(BlockKeystoneRed.Instance), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + BlockKeystoneRed.name, "inventory"));
		 renderItem.getItemModelMesher().register(Item.getItemFromBlock(BlockKeystoneBlue.Instance), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + BlockKeystoneBlue.name, "inventory"));
		 renderItem.getItemModelMesher().register(Item.getItemFromBlock(BlockKeystoneGreen.Instance), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + BlockKeystoneGreen.name, "inventory"));
		 renderItem.getItemModelMesher().register(Item.getItemFromBlock(BlockKomapod.Instance), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + BlockKomapod.name, "inventory"));
		 
	 }
	 
	 
	@Override
	public void registerRenders() {
		
		SpectrobesBlocks.registerRenders();
		SpectrobesItems.registerRenders();
		
	}
	
	
}
