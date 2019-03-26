package ¼¯ºÏ;

import java.util.Scanner;
import java.util.Stack;

public class Stackp1 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
		String s=cin.nextLine();
		System.out.println(check(s));
		}
		
	}
	
	public static boolean check(String s)
	{
		Stack<Character> S=new Stack<Character>();
		for(Character i:s.toCharArray())
		{
			if(i=='(')
				S.push(i);
			else if(i==')')
			{
				if(S.isEmpty()||S.peek()!='(')
					return false;
				S.pop();
			}
		}
		return S.isEmpty();
	}

}
