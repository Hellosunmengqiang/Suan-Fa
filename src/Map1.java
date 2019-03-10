import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Map1 {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		Map<String,String> map=new TreeMap<String,String>();
	    int n=Integer.parseInt(cin.nextLine());
		while(n-->0)
		{
			String []s=cin.nextLine().split(" ");
		
	      if(s!=null)
			map.put(s[0], s[1]);
	      else
	    	  continue;
		}
		
		//Set<Map.Entry<String,String>> set=map.entrySet();
		
	//	for(Map.Entry i:set)
		for(String i:map.keySet())
			System.out.println(String.format("%s %s",i ,map.get(i)));
		
		cin.close();
	}
}
