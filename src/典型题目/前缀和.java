package 典型题目;

import java.util.Scanner;

public class 前缀和 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int m=cin.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=cin.nextInt();
		int sum[]=new int[n];
		for(int i=1;i<n;i++)
			sum[i]=sum[i-1]+a[i];
		/*while(m-->0)
		{
			int b=cin.nextInt();
			int c=cin.nextInt();
			System.out.println(sum[c]-sum[b-1]);
		}*/
		int min=99999999;
		for(int i=0;i<n-m;i++)
		{
			min=min<(sum[i+m]-sum[i])?min:(sum[i+m]-sum[i]);
		}
		System.out.println(min);
	}

}
/*for(int i = 1; i <= n; ++i)
    for(int j = 1; j <= n; ++j)
        sum[i][j] = sum[i - 1][j] + sum[i - 1][j] - sum[i - 1][j - 1] + a[i][j];
for(int i = 1; i <= n; ++i)        //枚举矩阵左右端点 
    for(int j= 1; j <= n; ++j)
        for(int k = i; K <= n; ++k)
            for(int h = j; h <= n; ++h)
            {
                tot = sum[k][h] - sum[i - 1][h] - sum[k][j - 1] + sum[i - 1][j - 1];　　//同理矩阵生成
                ans = max(ans, tot);
            }*/
