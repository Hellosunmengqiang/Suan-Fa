package 博弈;

import java.util.Scanner;

public class 威佐夫博弈 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
			int m=cin.nextInt();
			int n=cin.nextInt();
			if(m<n)
			{
				m=m^n;
				n=m^n;
				m=m^n;
			}
			int k=m-n;
			int t=(int) (k*(1+Math.sqrt(5))/2);
			if(t==n)
				System.out.println("0");
			else
				System.out.println("1");
			
		}
	}

}
//威佐夫博奕（Wythoff Game）：有两堆各若干个物品，两个人轮流从某一堆或同时从两堆中取同样多的物品，
//规定每次至少取一个，多者不限，最后取光者得胜。