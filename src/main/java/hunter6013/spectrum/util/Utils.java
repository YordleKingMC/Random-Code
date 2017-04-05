package hunter6013.spectrum.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import hunter6013.spectrum.Reference;

public class Utils {

	private static Logger Logger;
	
	public static Logger getLogger() {
		if(Logger == null){
			Logger = LogManager.getFormatterLogger(Reference.MODID);
		}
		return Logger;
	}
	
}
