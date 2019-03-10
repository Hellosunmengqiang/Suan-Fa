package 贪心与动态规划;

import java.util.Scanner;

public class 动态子序列{
    static int[][] shu = new int[200][200];

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s1 = cin.next();
        String s2 = cin.next();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        get(c1, c1.length, c2, c2.length);
    }

    private static void get(char[] cs1, int length1, char[] cs2, int length2) {
        for (int i = 0; i < length1; i++) {
            shu[i][0] = i;
        }
        for (int i = 0; i < length2; i++) {
            shu[0][i] = i;
        }
        for (int i = 1; i < length1; i++) {
            for (int j = 1; j < length2; j++) {
                int m = (cs1[i] == cs2[j] ? 0 : 1);
                int n = shu[i - 1][j] + 1;
                int z = shu[i][j - 1] + 1;
                int x = shu[i - 1][j - 1] + m;
                shu[i][j] = mathmin(n, z, x);
            }
        }
        System.out.println(shu[length1-1][length2-1]+1);
    }

    private static int mathmin(int a, int b, int c) {
    	int t;
    	if(a<b)
    		t=a;
    	else
    		t=b;
    		if(t<c)
    			return t;
    		else 
    			return c;
    		/* int m=a<b?a:b;
    		 * return m<c?m:c;
    		 * 
    		 * */
        
    }
}

