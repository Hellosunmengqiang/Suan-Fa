package ̰���붯̬�滮;

import java.util.Scanner;

public class ����Ǯ̰���㷨 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int m[]= {25,10,5,1};
		int sum=cin.nextInt();
		int as[]=getmoney(m,sum);
		for(int i=0;i<as.length;i++)
		{
			System.out.println(as[i]+"��"+m[i]+"Ԫ��ֵ");
		}
		
	}
	public static int[] getmoney(int []s,int m)
	{
		int q=s.length;
		int[] mun=new int[q];
		for(int i=0;i<q;i++)
		{
			mun[i]=m/s[i];
			m=m%s[i];
		}
		return mun;
		
	}

}
