package 树;
import java.util.*;

public class 二叉树先中后{
    static Scanner sc=new Scanner(System.in);
    static class node{
        char val;
        node left=null;
        node right=null;
        node(char val){
            this.val=val;
        }
    }
    public static void main(String [] args){
        while(sc.hasNext()){
            char[] pre=sc.next().toCharArray(),
                   ord=sc.next().toCharArray();
            node root=createTree(pre,ord);
            postOrder(root);
            System.out.println();
        }
        sc.close();
    }
    private static void postOrder(node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val);
        }
    }
    private static node createTree(char[] pre,char[] ord){
        int len=ord.length;
        if(len==0) return null;
        node root=new node(pre[0]);
        for(int i=0;i<len;i++){
            if(ord[i]==pre[0]){
                root.left=createTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(ord,0,i));
                root.right=createTree(Arrays.copyOfRange(pre,i+1,len),Arrays.copyOfRange(ord,i+1,len));
            }
        }
        return root;
    }
}
