package 博弈;

import java.util.Scanner;

public class 巴什博奕 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
			int n=cin.nextInt();
			int m=cin.nextInt();
			if(n%(m+1)==0)
				System.out.println("No");//先手必败
			else
				System.out.println("Yes");
		}
	}
}
//巴什博奕（Bash Game）：只有一堆n个物品，两个人轮流从这堆物品中取物，
//规定每次至少取一个，最多取m个。最后取光者得胜。