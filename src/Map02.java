import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map02 {
	
	public static void main(String[] args) {
		Map<String,String> m=new HashMap<String,String>();
		  m.put("1","java");
		  m.put("2","mysql");
		  m.put("3", "class");
		  Set<Entry<String,String>> set=m.entrySet();

		Iterator<Entry<String,String>> it=set.iterator();
		
		  while(it.hasNext())
         {
	         Entry<String,String> as=it.next();
	         String key=as.getKey();
	         String value=as.getValue();
	         System.out.println("key:"+key+"   value:"+value);
          }
	      
	}

}
