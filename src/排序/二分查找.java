package ÅÅĞò;

import java.util.Scanner;

public class ¶ş·Ö²éÕÒ {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		   int n=cin.nextInt();
		   int a[]=new int[n];
		   for(int i=0;i<n;i++)
		   {
			   a[i]=cin.nextInt();  
		   }
		   int m=cin.nextInt();
		   System.out.println(binary(a, m));
		   if(a[binary(a, m)]==m)
			   System.out.println("yes");
		   else
			   System.out.println("no");
		   
	}
	public static int binary(int a[],int key)
	{
		if(a.length>0)
		{
		int end=0;;
		int start=a.length-1;
		int mid=(end+start)/2;
		while(end<=start)
		{
			if(a[mid]<key)
				end=mid+1;
			else if(a[mid]>key)
				start=mid-1;
			else 
				return mid;
		}
		}
		return -1;
		
	}

}
