package 博弈;

import java.util.Scanner;

public class 尼姆博奕 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
			int n=cin.nextInt();
			int x=cin.nextInt();
			while(n-->1)
			{
				int m=cin.nextInt();
				x^=m;
				
			}
			if(x%2==0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

}
//尼姆博奕（Nimm Game）：有三堆各若干个物品，两个人轮流从某一堆取任意多的物品，
//规定每次至少取一个，多者不限，最后取光者得胜。