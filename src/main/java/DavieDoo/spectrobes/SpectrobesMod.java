package DavieDoo.spectrobes;

import DavieDoo.spectrobes.blocks.BlockKeystoneRed;
import DavieDoo.spectrobes.init.SpectrobesBlocks;
import DavieDoo.spectrobes.init.SpectrobesItems;
import DavieDoo.spectrobes.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class SpectrobesMod {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	public static final SpectrobesTab tabSpectrobes = new SpectrobesTab("tabSpectrobes");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		SpectrobesBlocks.init();
		SpectrobesBlocks.register();
		SpectrobesItems.init();
		SpectrobesItems.register();
	
		proxy.preInit();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		proxy.init();
		proxy.registerRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
}	
