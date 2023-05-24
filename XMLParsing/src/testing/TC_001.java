package testing;

import java.io.*;
import java.util.*;


import org.json.JSONObject;
import org.json.XML;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;


public class TC_001 {

	public static void main(String[] args) throws IOException   {
		File f = new File("D:\\sampleJson.json");
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
		 // Remove Value from Json using Json Path (Any specific key)
	     DocumentContext documentContext = JsonPath.parse(data);
	     documentContext.delete("glossary.title");
	     System.out.println(documentContext.jsonString());

	     // Remove Value from Json using parent key
	     documentContext.delete("glossary.GlossDiv.GlossList.GlossEntry.ID");
	     System.out.println(documentContext.jsonString());
	     
	     // Adding value to JSON at runtime

	     documentContext.put("glossary.GlossDiv.GlossList.GlossEntry", "Name","Value");
	     System.out.println(documentContext.jsonString());
          
	     
	     
	     /*documentContext.delete(deletePath);
	     List<Object> result = documentContext.read(deletePath);
	     assertThat(result.size()).isEqualTo(0);
	     
	     String soapmessageString = data;
		
		
		
		JSONObject soapDatainJsonObject = XML.toJSONObject(soapmessageString);
		
		Map<String, Object> map =mapper.readValue(soapDatainJsonObject.toString(), Map.class);
		
		
	    String prefix="";
	    List<String> result1 = new ArrayList<>();
	    TC_001.normalizeMapToFlatList(map, result1, prefix);

	    for (String s1 : result1){
	    	System.out.println(s1);
	    }
	    */
	    	   
	}
        

 static void normalizeMapToFlatList(Map<String, Object> map, List<String> result, String prefix)
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