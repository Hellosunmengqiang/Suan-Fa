package ̰���붯̬�滮;

import java.util.Scanner;

public class �򵥶�̬�滮 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		
		int a[][]=new int[n][n];  //i�������꣬j�Ǻ����ꣻ
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				a[i][j]=cin.nextInt();
			}
		}
	
		for(int i=n-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				a[i-1][j]+=Math.max(a[i][j], a[i][j+1]);
			}
		}
		System.out.println(a[0][0]);
	}

}
