package 集合;

import java.util.Scanner;
import java.util.Stack;

public class 括号问题 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
			String s=cin.nextLine();
			if(kuohao(s))
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}	
	}
	public static boolean kuohao(String s)
	{
		Stack<Character> st=new Stack<>();
		for(Character i:s.toCharArray())
		{
			if(i=='{'||i=='['||i=='(')
				st.push(i);
			else if(i=='}')
			{
				if(st.isEmpty()||st.peek()!='{')
					return false;
				st.pop();
			}
			else if(i==')')
			{
				if(st.isEmpty()||st.peek()!='(')
					return false;
				st.pop();
			}
			else if(i==']')
			{
				if(st.isEmpty()||st.peek()!='[')
					return false;
				st.pop();
			}
			
				
		}
		return st.isEmpty();
		
	}

}
