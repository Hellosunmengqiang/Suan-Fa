package ºØ∫œ;
import java.util.Scanner;
import java.util.Stack;

public class ¿®∫≈∆•≈‰ {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
		String s=cin.nextLine();
		System.out.println(check(s));
		}
		
	}
	
	public static int check(String s)
	{
		Stack<Character> S=new Stack<Character>();
		for(Character i:s.toCharArray())
		{
			if(i=='('||i=='[')
				S.push(i);
			else if(i==')')
			{
				if(S.isEmpty()||S.peek()!='(')
					return 0;
				S.pop();
			}
			else if(i==']')
			{
				if(S.isEmpty()||S.peek()!='[')
					return 0;
				S.pop();
			}
		}
		return S.size();
	}

}

