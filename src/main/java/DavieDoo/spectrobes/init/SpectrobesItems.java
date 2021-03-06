package DavieDoo.spectrobes.init;

import DavieDoo.spectrobes.Reference;
import DavieDoo.spectrobes.SpectrobesMod;
import items.ItemPrizmod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SpectrobesItems {

	public static Item itemKomapod;
	public static Item prizmod;
	
	
	public static void init() {
		itemKomapod = new Item().setUnlocalizedName("ItemKomapod").setCreativeTab(SpectrobesMod.tabSpectrobes);
		prizmod = new ItemPrizmod().setUnlocalizedName("prizmod").setCreativeTab(SpectrobesMod.tabSpectrobes);
		
	}
	
	public static void register() {
		
		GameRegistry.registerItem(itemKomapod, itemKomapod.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(prizmod, prizmod.getUnlocalizedName().substring(5));
		
	}
	
	public static void registerRenders() {
		
		registerRender(itemKomapod);
		registerRender(prizmod);
		
	}
	
	public static void registerRender(Item item) {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
	
}
