package 贪心与动态规划;

import java.util.ArrayList;
import java.util.Scanner;

public class 组合数贪心算法 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		String str="";
		int n=cin.nextInt();
		ArrayList<String>  list=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			list.add(cin.next());
		}
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if((list.get(i)+list.get(j)).compareTo(list.get(j)+list.get(i))<0)
				{
					String as=list.get(i);
					list.set(i, list.get(j));
					list.set(j, as);
				}
			}
		}
		for(int i=0;i<list.size();i++)
		{
			str+=list.get(i);
		}
		System.out.println(str);
		
	}

}

/*例如：n=3时，3个整数13，312，343，连成的最大整数为34331213。 
又如：n=4时，4个整数7，13，4，246，连成的最大整数为7424613。 */







