package ������Ŀ;
import java.util.Scanner;

public class ȫ���� {  
    public static void main(String[] args) {  
       Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < a.length; i++) 
            a[i]=cin.nextInt();
        String string="";
        f(string,a);
    }
 
    private static void f(String str, int[] a) {
        if(str.length()==a.length)
           System.out.println(str);
        else
        for (int i = 0; i <a.length; i++)
            if(str.indexOf(""+a[i])==-1)
                f(str+a[i], a);
    }  
} 