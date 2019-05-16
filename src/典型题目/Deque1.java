package µäĞÍÌâÄ¿;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Deque1 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
			a[i]=cin.nextInt();
		Deque<Integer> q=new LinkedList<Integer>();
		for(int i=a.length-1;i>=0;i--)
		{
			if(!q.isEmpty())
			{
				int t=q.getLast();
				q.pollLast();
				q.addFirst(t);
				
			}
			q.addFirst(a[i]);
		}
		System.out.println(n);
		for(Integer i:q)
		{
			System.out.print(i+" ");
		}
		
	}

}
