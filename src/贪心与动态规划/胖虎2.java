package 贪心与动态规划;
import java.util.Scanner;
public class 胖虎2 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt(),W=cin.nextInt();
        int INF=Integer.MAX_VALUE;
        int dp[]=new int[10001];
        int w,v,i,j,s=0,p=0;
        for(i = 1;i < 10001;i++)dp[i] = INF;
        for(i = 0;i < n;i++)
        {
           w=cin.nextInt();
            v=cin.nextInt();
            s += v;
            for(j = s;j >= v;j--)
            {
                if((j-v) == 0)
                    dp[j] = Math.min(w, dp[j]);
                else if(dp[j-v] != INF)
                    dp[j] = Math.min(dp[j - v] + w, dp[j]);
            }
        }
        for(i = 0;i <= s;i++){
            if(dp[i] <= W){
                p = i;
            }
        }
        System.out.println(p);
        cin.close();
    }
}
