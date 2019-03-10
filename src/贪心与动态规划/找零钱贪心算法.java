package 贪心与动态规划;

import java.util.Scanner;

public class 找零钱贪心算法 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int m[]= {25,10,5,1};
		int sum=cin.nextInt();
		int as[]=getmoney(m,sum);
		for(int i=0;i<as.length;i++)
		{
			System.out.println(as[i]+"个"+m[i]+"元面值");
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
