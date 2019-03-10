import java.util.HashSet;
import java.util.Set;
public class compatable1 {
	public static void main(String[] args) {
		Set<Customer> set=new HashSet<Customer>();
		set.add(new Customer("Tom",20));
		set.add(new Customer("Tom",15));
		set.add(new Customer("Mink",13));
		for(Customer i:set)
			System.out.println(i.getName()+""+i.getAge());
	}
}
class Customer implements Comparable<Object>
{
	private String name;
    private int age;
    public Customer(String name,int age)
    {
    	this.name=name;
    	this.age=age;
    	
    }
    public String getName()
    {
    	return this.name;
    }
    public void setName(String name)
    {
    	this.name=name;
    }
    public int getAge()
    {
    	return this.age;
    }
    public void setAge(int age)
    {
    	this.age=age;
    }
    public boolean equal(Object o)
    {
    	if(this==o)
    		return true;
    	final Customer other=(Customer)o;
    	if(this.name.equals(other.getName())&&this.age==other.getAge())
    		return true;
    	else
    		return false;
    }
    public int compareTo(Object o)
    {
    	Customer other=(Customer)o;
    	if(this.name.compareTo(other.getName())>0)
    		return 1;
    	if(this.name.compareTo(other.getName())<0)
    		return -1;
    	if(this.age>other.getAge())
    		return 1;
    	if(this.age<other.getAge())
    		return -1;
		return 0;
    	
    }
    public int hashCode()
    {
    	int result;
    	result=(name==null?0:name.hashCode());
    	result=29*result+age;
    	return result;
    }
}
	
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   