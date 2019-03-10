import java.util.HashMap;
import java.util.Scanner;

public class HashMap1 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		String s[]=cin.nextLine().split("");
	    HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		for(String i:s)
		{
			if(map.containsKey(i))
			{
				int time=map.get(i);
			    map.put(i,time+1);	
			}
			else
				map.put(i,1);
		}
		
		for(String i:map.keySet()) {
			System.out.println(String.format("%s %d",i, map.get(i)));
		}
		cin.close();
	}

}
