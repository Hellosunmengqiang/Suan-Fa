package 典型题目;
import java.awt.List;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;
 
public class 出圈{
   public static void main(String[] args) {
    Scanner cin=new Scanner(System.in);
    while(cin.hasNext()) {
        int n=cin.nextInt();
        
       Vector<Integer> list=new Vector<>();
        for(int i=1;i<=n;i++)
            list.add(i);
      
       
        while(list.size()!=2) {
           
            for(int i=1;i<list.size();i=i+1)
            {
            System.out.print(list.get(i)+" ");
            list.remove(i);
            }
             
        }
        System.out.println();
        System.out.println(list.get(0));  
        System.out.println(list.get(1));
    }
     
    cin.close();
   }
}/*出圈
10 3*/
/*package 题目2;
import java.util.Scanner;
public class p1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            F(sc.nextInt(), sc.nextInt());
        }
        sc.close();
    }
     
    private static void F(int n, int m){
        //构建循环链表
        Node head = new Node(null, null);
        head.next = head;
        Node p = head;
        for(int i = 1; i <= n; i++){
            p.next = new Node(i, p.next);
            p = p.next;
        }
         
        // count代表当前数的数字
        int count = 0; 
        p = head;
        while(head.next.next != head){
            if(p.next == head)
                p = head;
             
            count++; //开始报数
            if(count % m == 0){ //报数到第个m人
                //System.out.println(p.next.data);
                p.next = p.next.next; //该人出圈
            }else{
                p = p.next; //往下继续循环到只剩一个人
            }
        }
        System.out.println(head.next.data);
    }
     
 private static class Node{
        private Integer data;
        private Node next;
         
        public Node(Integer data, Node next){
            this.data = data;
            this.next = next;
        }
    }
     
}
*/
