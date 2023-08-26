package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UsageOfPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("./src/test/resources/myfile.properties");
		Properties property = new Properties();
		property.load(file);
		String value = property.getProperty("name");
		System.out.println(value);
		
	}

}
