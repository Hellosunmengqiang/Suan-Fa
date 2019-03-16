package ≈≈–Ú;

import java.util.Scanner;

public class —°‘Ò≈≈–Ú {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		  int n=cin.nextInt();
		  
		 int a[]=new int[1001];
		 for(int i=0;i<n;i++)
		  {
			  a[i]=cin.nextInt();
		  }
		  int k;
		  for(int i=0;i<n-1;i++)
		  {
			
			  k=i;
			  for(int j=i+1;j<n;j++)
			  {
				  if(a[j]<a[k])
					  k=j;
			  }
			  if(k!=i)
				  swap(a,i,k);
				  
		  }
		  for(int i=0;i<n;i++)
			  System.out.print(a[i]+" ");
	}
	
	private static void swap(int a[],int a1,int a2)
	{
		int m;
		   m=a[a1];
		   a[a1]=a[a2];
		   a[a2]=m;
	}

}
