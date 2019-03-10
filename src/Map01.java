import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Map01 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		HashMap<Integer,String> m=new HashMap<>();
		   m.put(1, "java");
		   m.put(2,"mysql");
		   m.put(3,"class");
		   Set<Integer> set=m.keySet();
		   Iterator<Integer> it=set.iterator();
		   while(it.hasNext())
		   {
			   Integer s=it.next();
			   System.out.println(m.get(s));
		   }
		
	}

}
