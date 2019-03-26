package 排序;

import java.util.Scanner;
public class 二分查找 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = cin.nextInt();
        }
        int x = cin.nextInt();
        
        int left = 0, right =arr.length-1;
        
        while (right!=left){
            int mid = (left+right)/2;
            
            if(x <= arr[mid]){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        if(arr[left] != x){
            System.out.println("NO");
        }
        else {
            System.out.println(right);//此时left与right相等
        }
    }
}