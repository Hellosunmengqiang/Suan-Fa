package ¼¯ºÏ;

import java.util.Scanner;
import java.util.Vector;

public class vector1 {
	static int a,b;
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		String str[]=cin.nextLine().trim().split(" ");
		int p=Integer.parseInt(str[0]);
		int q=Integer.parseInt(str[1]);

		Vector v[]=new Vector[1001];
		for(int i=0;i<1001;i++)
		{
			v[i]=new Vector();
		}
		while(q-->0)
		{
			String s[]=cin.nextLine().trim().split(" ");
			if(s.length==3)
			{
				
				a=Integer.parseInt(s[1]);
				b=Integer.parseInt(s[2]);
				v[a].add(b);
			}
			else
			{
				a=Integer.parseInt(s[0]);
				b=Integer.parseInt(s[1]);
				if(a==1)
				{
					if(v[b].isEmpty())
					{
						System.out.println();
					}
					else {
						for(Object i:v[b])
							System.out.print(i+" ");
					System.out.println();
					}
				}
				else
				{
					v[b].clear();
				}
			}
		}
	}

}
