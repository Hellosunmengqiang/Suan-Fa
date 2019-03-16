package ÅÅĞò;

import java.util.Scanner;

public class ¿ìËÙÅÅĞò {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int a[]=new int[100001];
		for(int i=1;i<=n;i++)
		{
			a[i]=cin.nextInt();
			
		}
		ks(a,1,n);
		for(int i=1;i<=n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void ks(int a[],int left,int right)
	{
		int i,j,t;
		if(left>right)
			return;
		t=a[left];
		
		i=left;
		j=right;
		while(i!=j)
		{
			while(a[j]>=t&&i<j)
				j--;
			while(a[i]<=t&&i<j)
				i++;
			if(i<j)
			{
				int er=a[i];
				a[i]=a[j];
				a[j]=er;
				
			}
		}
		a[left]=a[i];
		a[i]=t;
		ks(a,left,i-1);
		ks(a,i+1,right);
		return;
	}
}
