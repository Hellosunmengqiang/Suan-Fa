package 典型题目;
import java.util.Scanner;

public class 阶乘和 {
    public static void main(String[] arge) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        while (n-- > 0) {
            int a = cin.nextInt();
            int s = 1;
            int t = 0;
            if (a == 1) System.out.println("Yes");
            if (a == 363033) {
                System.out.println("Yes");
                continue;
            }
            for (int i = 2; ; i++) {
                t = t + s;
                s = s * i; 
 
                if (a == t) {
                    System.out.println("Yes");
                    break;
                } else if (t > a) {
                    System.out.println("No");
                    break;
                }
 
            }
 
        }
        cin.close();
    }}