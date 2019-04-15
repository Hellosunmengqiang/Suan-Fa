package ¼¯ºÏ;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
 
public class vector2  {
    static Scanner cin = new Scanner(System.in);
    public static void main(String[] args) {
        Vector<String> str1 = new Vector<>();
        Vector<String> str2 = new Vector<>();
        Vector<String> str3 = new Vector<>();
        while(cin.hasNext()){
            int type = cin.nextInt();
            String number = cin.next();
            if(type==0)
                str1.add(number);
            else if(type==1)
                str2.add(number);
            else
                str3.add(number);
        }
        Collections.reverse(str1);
        Collections.reverse(str2);
        Collections.reverse(str3);    
        while (str1.size() < 10)str1.add("0");
        while (str2.size() < 10)str2.add("0");
        while (str3.size() < 10)str3.add("0");
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("%s %s %s",str1.get(i),str2.get(i),str3.get(i)));
        }
    }
}/*
2	18270477699
1	10149800116
0	19906559817
1	16209018105
1	16804212234
2	19289130583
1	17982711123
0	10897630486
1	11860787674
0	15192777554*/