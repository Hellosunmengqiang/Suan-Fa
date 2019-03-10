class spqueue{
	private Object[] queueelem;
	private int front;
	private int rear;
	public spqueue(int maxsize)
	{
		front=rear=0;
		queueelem=new Object[maxsize];
		
	}
	public void clear()
	{
		front=rear=0;
		
	}
	public boolean isEmpty()
	{
		return front==rear;
		
	}
	public int length()
	{
		return (rear-front+queueelem.length)%queueelem.length;
	}
	public Object peek()
	{
		if(front==rear)
			return null;
		else return queueelem[front];
		
	}
	public void add(Object x)
	{
		if((rear+1)%queueelem.length==front)
		System.out.println("¶ÓÁÐÒÑÂú£¡");
		else {
			queueelem[rear]=x;
			rear=(rear+1)%queueelem.length;
		}
			
	}
	public Object poll()
	{
		if(rear==front)
		return null;
		else
		{
			Object t=queueelem[front];
			front=(front+1)%queueelem.length;
			return t;
		}
	}
}
public class queue2 {
	public static void main(String[] args) {
		spqueue sp=new spqueue(20);
		for(int i=0;i<20;i++)
		{
		    sp.add(i);
		}
		for(int i=0;i<20;i++)
		{
		System.out.println(sp.poll());
	}

}
}
