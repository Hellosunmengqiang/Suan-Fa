package ≈≈–Ú;

import java.util.Scanner;

public class Õ∞≈≈–Ú {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int book[]=new int[10001];
		for(int i=0;i<10000;i++)
		{
			book[i]=0;
		}
		
		for(int i=0;i<n;i++)
		{
			book[cin.nextInt()]++;
			
		}
		for(int i=10000;i>=0;i--)
		{
			for(int j=1;j<=book[i];j++)
			{
				System.out.print(i+" ");
			}
		}
	}

}
