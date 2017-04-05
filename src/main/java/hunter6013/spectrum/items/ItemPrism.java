package hunter6013.spectrum.items;

import hunter6013.spectrum.Reference;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemPrism extends Item {

	public ItemPrism(String unlocalizedName, String registryName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, registryName));
	}
	
}
