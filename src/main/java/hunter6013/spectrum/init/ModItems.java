package hunter6013.spectrum.init;

import hunter6013.spectrum.Reference;
import hunter6013.spectrum.items.ItemPrism;
import hunter6013.spectrum.util.Utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item prism;

	public static void init() {
		prism = new ItemPrism("itemprism", "prism");
	}
	
	public static void register() {
		registerItem(prism);
	}
	
	public static void registerRenders() {
		registerRender(prism);
	}
	
	public static void registerItem(Item item) {
		GameRegistry.register(item);
		Utils.getLogger().info("Registered item" + item.getUnlocalizedName().substring(5));
		
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName(), "inventory"));
		Utils.getLogger().info("Register render for " + item.getUnlocalizedName());
	}
	
}
