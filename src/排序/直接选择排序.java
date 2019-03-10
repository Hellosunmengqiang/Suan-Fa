package ≈≈–Ú;

import java.util.Scanner;

public class ÷±Ω”—°‘Ò≈≈–Ú {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		   int n=cin.nextInt();
		   int a[]=new int[n];
		   for(int i=0;i<n;i++)
		   {
			   a[i]=cin.nextInt();
		   }
		   for(int i=0;i<a.length;i++)
		   {
			   for(int j=i+1;j<a.length;j++)
			   {
				   if(a[i]>a[j])
				   {
					   int t=a[j];
					   a[j]=a[i];
					   a[i]=t;
				   }
			   }
		   }
		   for(int i=0;i<a.length;i++)
			   System.out.print(a[i]+" ");
	}

}
