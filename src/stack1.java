class spstack{
	private Object[] stacklem;
	private int top;
	public spstack(int maxsize)
	{
		top=0;
		stacklem=new Object[maxsize];
	}
	public void clear()
	{
		top=0;
		
	}
	public boolean isEmpty()
	{
		return top==0;
		
	}
	public int length()
	{
		return top;
	}
	public Object peek()
	{
		if(!isEmpty())
			return stacklem[top-1];
		else 
			return null;
		
	}
	public void push(Object x)
	{
		if(top==stacklem.length)
			System.out.println("Õ»Âú£¡");
		else
		{
			 stacklem[top]=x;
		      top++;
		}	
	}
	public Object pop()
	{
		if(isEmpty())
		  return null;
		else
		{
		   Object t=stacklem[top-1];
		   top--;
		   return t;
		}
		/*  return stacklem[--top];
		*/
	}
}
public class stack1{
	public static void main(String[] args) {
		spstack sp=new spstack(20);
		for(int i=0;i<20;i++)
		{
		    sp.push(i);
		}
		for(int i=0;i<20;i++)
		{
		System.out.print(sp.pop()+" ");
	    }
	}
}
