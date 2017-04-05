package hunter6013.spectrum.proxy;

import hunter6013.spectrum.init.ModItems;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerRenders() {
		ModItems.registerRenders();
	}
	
}
