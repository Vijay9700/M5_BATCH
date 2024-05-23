package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_Utility {

	public String readProperty(String key) throws IOException {
		// step 1-->get an object of external file
		FileInputStream fis = new 
		FileInputStream("./commondata/m5login.properties");
		// step 2-->create an obj for properties
		Properties prop = new Properties();
		// step 3-->load the file
		prop.load(fis);
		// step 4-->read the data
		String data = prop.getProperty(key);
		return data;
	}

}
