package ������Ŀ;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ͳ�Ƶ��� {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
			int n=Integer.parseInt(cin.nextLine());
			while(n-->0)
			{
				String s[]=cin.nextLine().trim().split("");
				Map<String, Integer> map=new TreeMap<>();
				for(String i:s)
				{
					if(map.containsKey(i))
					{
						map.put(i, map.get(i)+1);
					}
					else
						map.put(i, 1);
				}
				for(int i=0;i<s.length;i++)
				{
					for(String j:map.keySet())
					{
						if(s[i].equals(j)&&map.get(j)>0)
					   {
							System.out.print(map.get(j)+""+s[i]);
					        map.put(j, 0);
					   }
					}
				}
				System.out.println();
			}
		}
	}

}
