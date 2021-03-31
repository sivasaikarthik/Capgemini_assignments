import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

class Person{
    private String name;
    private int height;
    private double weight;
   // Person()
	public Person(String name, int height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
    
}

public class Assignment3Q1 {
    public static void main(String[] args) {
    	Person p1=new Person("karthik",6,75);
    	Person p2=new Person("siva",5,65);
    	
    	 TreeSet<Person> a=new TreeSet<Person>(); 
    	  a.add(p2);
    	  a.add(p1);
    	 System.out.println(a);
    	  
    }
}