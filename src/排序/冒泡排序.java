package ≈≈–Ú;

import java.util.Scanner;

public class √∞≈›≈≈–Ú {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=cin.nextInt();
		}
		maopao(a,n);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	public static int[] maopao(int a[],int n)
	
	{
		int t=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
					
				}
			}
		}
		return a;
		
	}

}
