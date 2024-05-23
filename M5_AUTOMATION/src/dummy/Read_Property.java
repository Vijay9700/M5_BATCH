package dummy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Property {
	public static void main(String[] args) throws IOException {
		//step 1-->get an object of external file
		FileInputStream fis=new 
		 FileInputStream("./commondata/m5login.properties");
		//step 2-->create an obj for properties
		Properties prop=new Properties();
		//step 3-->load the file
		prop.load(fis);
		//step 4-->read the data
		String data = prop.getProperty("url");
		System.out.println(data);
	}

}
