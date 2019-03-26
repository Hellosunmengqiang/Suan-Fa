package Ê÷;

import java.util.Scanner;
public class ¶ÑÅÅĞòÓë¶ş²æÊ÷ {
	static int h[]=new int[1001];
	static int n;
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int num=cin.nextInt();
		
		for(int i=1;i<=num;i++)
			h[i]=cin.nextInt();
		
		n=num;
		creat();
	
		//sort();
		
		for(int i=1;i<=num;i++)
			System.out.print(deletemax()+" ");
			
	}
	public static void swap(int x,int y)
	{
		int t=h[x];
		h[x]=h[y];
		h[y]=t;
		return;
	}
	
	public static void siftdown(int i) {
		int t,flag=0;
		while(i*2<=n&&flag==0)
		{
			if(h[i]>h[i*2])
				t=i*2;
			else
				t=i;
			if(i*2+1<=n)
			{
				if(h[i*2+1]<h[t])
					t=i*2+1;
			}
			if(t!=i)
			{
				swap(t,i);
				i=t;
			}
			else 
				flag=1;
		}
		return;
	}
	
	public static void creat()
	{
		int i;
		for( i=n/2;i>=1;i--)
		{
			siftdown(i);
		}
		return;
	}
	
	public static void sort()
	{
		while(n>1)
		{
			swap(1,n);
			n--;
			siftdown(1);
		}
		return;
	}
	public static int deletemax()
	{
		int t;
		t=h[1];
		h[1]=h[n];
		n--;
		siftdown(1);
		return t;
		
	}
}





