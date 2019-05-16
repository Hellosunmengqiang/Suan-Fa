package dp;
import java.util.Scanner;

public class 数位dp {
    static long[] a = new long[20];
   
    static long[][] dp = new long[20][2];

    static long dfs(int pos, int pre, int sta, boolean limit) {
        //枚举结束
        if (pos == -1) {
            return 1;
        }
        //记忆化
        if (!limit && dp[pos][sta] != -1) {
            return dp[pos][sta];
        }
        //当前位枚举上界
        long up = limit ? a[pos] : 9;
        long tmp = 0;
        for (int i = 0; i <= up; i++) {
            if (pre == 4&& i == 9) {
                continue;
            }
          
            if (i == 4) {
                tmp += dfs(pos - 1, i, 1, limit && i == a[pos]);
            } else {
                tmp += dfs(pos - 1, i, 0, limit && i == a[pos]);
            }
        }
        if (!limit) {
            dp[pos][sta] = tmp;
        }
        return tmp;
    }

    //分解数位
    static long solve(long x) {
        int pos = 0;
        while (x > 0) {
            a[pos++] = x % 10;
            x /= 10;
        }
        //从高位枚举
        return dfs(pos - 1, -1, 0, true);
    }

    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        int t=cin.nextInt();
        while (t-->0) {
            //l = cin.nextInt();
            long  r = cin.nextLong();
    
            for (int i = 0; i < 20; i++) {
                dp[i][0] = dp[i][1] = -1;
            }
            long as=r-solve(r)+1;
            System.out.println(as);
        }
    }
}
