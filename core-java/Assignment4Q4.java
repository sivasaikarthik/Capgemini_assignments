import java.util.ArrayList;



public class Assignment4Q4 {
    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
    	employeeList.removeIf(n->n.length()%2!=0);
    	return employeeList;
    }
    public static void main(String[] args) { 
    	
    	ArrayList<String>s=new ArrayList<String>();
    	s.add("karthik");
    	s.add("siva");
    	s.add("sai");
    	Assignment4Q4 a=new Assignment4Q4();
    	s=a.removeOddLength(s);
    	System.out.println(s);
    }
}

