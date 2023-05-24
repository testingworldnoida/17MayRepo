package testing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.json.XML;

import com.fasterxml.jackson.databind.ObjectMapper;

public class B {
	
	
	public static void main(String[] args) throws IOException   {
		File f = new File("C:\\Users\\Nitin Tyagi\\Desktop\\task\\Data.xml");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s=br.readLine();
        String data = "";
        ObjectMapper mapper = new ObjectMapper();
	     while(s!=null)
	     {
	    	 data=data+s;
	    	 s=br.readLine();
	     }
		String soapmessageString = data;
		JSONObject soapDatainJsonObject = XML.toJSONObject(soapmessageString);
		
		Map<String, Object> map =mapper.readValue(soapDatainJsonObject.toString(), Map.class);
		
		
	    String prefix="";
	    List<String> result1 = new ArrayList<>();
	    TC_001.normalizeMapToFlatList(map, result1, prefix);

	    for (String s1 : result1){
	    	System.out.println(s1);
	    }
	    
	    	   
	}
        

 private static void normalizeMapToFlatList(Map<String, Object> map, List<String> result, String prefix)
{
  for (String key : map.keySet())
  {
    Object value = map.get(key);
    
    if (value instanceof LinkedHashMap)
    {
      normalizeMapToFlatList((Map<String, Object>)value, result, prefix == "" ? key : prefix + "." + key);
     
    }
    else if (value instanceof ArrayList)
    {
      int i=0;	
      for (Object item : (ArrayList)value)
      {
    	
        if (item instanceof LinkedHashMap)
        {
          normalizeMapToFlatList((Map<String, Object>)item, result, prefix == "" ? key : prefix  +"." + key+"["+i+"]");
          
        }
        i=i+1;
      }
    }
    else
    {
      result.add(prefix == "" ? key : prefix + "." + key + "=" + map.get(key));
      
    }
    
  }
}
	
        
	}