import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromproperties 
{
 public static void main(String[] args) throws IOException 
 {
	// Step :- to Convert physical of properties class
	FileInputStream fis = new FileInputStream("./src/test/resources/Data.properties");
	//create an instance of properties class 
	Properties property = new Properties();
	// load all key & value pairs from fis to properties 
	property.load(fis);
	//retrive the data 
	System.out.println(property.getProperty("url"));
	System.out.println(property.getProperty("username"));
}
}
