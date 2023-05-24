package testing;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public String fetchPropertyData(String key) throws IOException{
		Properties prop = new Properties();
		File f = new File("./ConfigFiles/ApplicationConfiguration.properties");
		FileReader fr = new FileReader(f);
		prop.load(fr);
		return (prop.get(key).toString());
		
	}

}