package 典型题目;

import java.util.Scanner;
public class 均分硬币 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            if (sum % n == 0) {
                int ans = 0;
                int jun = sum / n;
                for (int i = 1; i < n; i++) {
                    if (a[i - 1] != jun) {
                        a[i] += (a[i - 1] - jun);
                        ans++;
                    }
 
                }
                System.out.println(ans);
            } else
                System.out.println("Oh no!");
        }
    }
}
