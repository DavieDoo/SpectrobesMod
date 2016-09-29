package DavieDoo.spectrobes.init;

import DavieDoo.spectrobes.Reference;
import DavieDoo.spectrobes.SpectrobesMod;
import DavieDoo.spectrobes.blocks.BlockFossil;
import DavieDoo.spectrobes.blocks.BlockKeystoneBlue;
import DavieDoo.spectrobes.blocks.BlockKeystoneGreen;
import DavieDoo.spectrobes.blocks.BlockKeystoneRed;
import DavieDoo.spectrobes.blocks.BlockKomapod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SpectrobesBlocks {

	public static Block fossil_block;
	public static Block keystone_red;
	public static Block keystone_blue;
	public static Block keystone_green;
	public static Block komapod;

	
	
	
	public static void init() {
		
		fossil_block = new BlockFossil(Material.rock).setUnlocalizedName("fossil_block").setCreativeTab(SpectrobesMod.tabSpectrobes);
		keystone_red = new BlockKeystoneRed().setUnlocalizedName("keystone_red").setCreativeTab(SpectrobesMod.tabSpectrobes);
		keystone_blue = new BlockKeystoneBlue().setUnlocalizedName("keystone_blue").setCreativeTab(SpectrobesMod.tabSpectrobes);
		keystone_green = new BlockKeystoneGreen().setUnlocalizedName("keystone_green").setCreativeTab(SpectrobesMod.tabSpectrobes);
		komapod = new BlockKomapod().setUnlocalizedName("komapod").setCreativeTab(SpectrobesMod.tabSpectrobes);
		
	}

	public static void register() {
		
		GameRegistry.registerBlock(fossil_block, fossil_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(keystone_red, keystone_red.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(keystone_blue, keystone_blue.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(keystone_green, keystone_green.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(komapod, komapod.getUnlocalizedName().substring(5));
		
		
	}
	
	public static void registerRenders() {
		
		registerRender(fossil_block);
		registerRender(keystone_red);
		registerRender(keystone_blue);
		registerRender(keystone_green);
		registerRender(komapod);
		registerCustomModel(keystone_red);
		registerCustomModel(keystone_blue);
		registerCustomModel(keystone_green);
		registerCustomModel(komapod);
	}
	
	public static void registerRender(Block block) {
		
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
		
	}
	
	public static void registerCustomModel(Block block) {
		
		Item item = Item.getItemFromBlock(block);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
	

}
