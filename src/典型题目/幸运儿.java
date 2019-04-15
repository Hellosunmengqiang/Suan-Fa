package 典型题目;
import java.util.ArrayList;
import java.util.Scanner;
 
public class 幸运儿 {
    public static void main(String[] args) {
 
    Scanner cin =new Scanner(System.in);
    while(cin.hasNext())
    {
        ArrayList<Integer> aList =new ArrayList<Integer>();
        int n=cin.nextInt();
        for(int i=1;i<=n;i++)
            aList.add(i);
        while(aList.size()!=2)
        {
          for(int i=1;i<aList.size();i++)
          {
              System.out.printf(aList.get(i)+" ");
              aList.remove(i);
          }
        }
      System.out.println();
      System.out.println(aList.get(0)+" "+aList.get(1));
    }
}
     
 
}
 