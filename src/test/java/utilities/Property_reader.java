package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Property_reader {

	public Property_reader() {
		// TODO Auto-generated constructor stub
	}

	public String[] property_read(String Datas[]) throws IOException
	{
		 FileReader fileReader = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties" );
		  Properties properties = new Properties();
		  properties.load(fileReader);
		  int length= Datas.length;
		  String[] arr= new String[length];
		  for(int i =0;i<Datas.length;i++)
		  {
			 arr[i]= properties.getProperty(Datas[i]);
		  }
		return arr;
	}
	
}
