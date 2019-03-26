package ¼¯ºÏ;

import java.util.Scanner;
import java.util.Stack;

public class Stackp2 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
		String s[]=cin.nextLine().split(" ");
		Stack<Double> st=new Stack<Double>();
		for(String i:s)
		{
			try {
				double s1=Double.parseDouble(i);
				st.push(s1);
			}
			catch(Exception e)
			{
				double a=st.peek();
				st.pop();
				double b=st.peek();
				st.pop();
				if(i.equals("+"))
				    st.push(a+b);
				else if(i.equals("*"))
					st.push(a*b);
				
				else if(i.equals("-"))
					st.push(b-a);
				else if(i.equals("/"))
					st.push(b/a);
				
			}
		}
		double w=st.peek();
		System.out.println(String.format("%.2f", w));
		}
	}

}
