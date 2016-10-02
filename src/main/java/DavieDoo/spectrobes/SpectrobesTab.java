package DavieDoo.spectrobes;

import DavieDoo.spectrobes.init.SpectrobesItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SpectrobesTab extends CreativeTabs{

	public SpectrobesTab(String label) {
		super(label);
		this.setBackgroundImageName("spectrobes.png");
	}


	@Override
	public Item getTabIconItem() {
		
		return SpectrobesItems.itemKomapod;
	}

}
