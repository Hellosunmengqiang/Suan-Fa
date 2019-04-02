package 典型题目;
import java.util.Scanner;

public class 单词翻转 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int t=0;
		char c[]=new char[100];
		char n[]=new char[100];
		while(cin.hasNext())
		{
			n=cin.nextLine().toCharArray();
			for(int i=0;i<n.length;i++)
			{
				if(!((n[i]>='a'&&n[i]<='z')||(n[i]>='A'&&n[i]<='Z')))
				{
					for(int j=t-1;j>=0;j--)
					{
						System.out.print(c[j]);
					}
					System.out.print(n[i]);
					t=0;
				}
				else
				{
					c[t]=n[i];
					t++;
				}
			}
			System.out.println();
		}
	}
}
/*#include<stdio.h>
void main()
{  char n,ch[100];
     int i,t=0,j;
   while(scanf("%c",&n)!=EOF)
    {  if(!(n>='a'&&n<='z'||n>='A'&&n<='Z'))
       { 
          for(i=t-1;i>=0;i--) 
            printf("%c",ch[i]);
             printf("%c",n);
             t=0;
             continue;
       }
      ch[t]=n;t++;
    }
}*/







