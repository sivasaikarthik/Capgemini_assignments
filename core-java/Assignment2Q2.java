
import java.util.ArrayList;
import java.util.Scanner;
class Manager extends Assignment2Q2 {
    public int getSalary(int salary) {
        int incentive = 5000;
      // int result=0;
System.out.println("incentive applied or not");
        boolean applied = input.nextBoolean();  
       if(applied)
       {
    	   return incentive+salary;
       }
       else
     return salary;
    }
}

class Labour extends Assignment2Q2 {
    
    public int getSalary(int salary) {
        int overtime = 500;
       int hour;
System.out.println("input no of overtime hours");
    hour=input.nextInt();
    return hour*overtime+salary;
        
    }
}

public class Assignment2Q2 {
    Scanner input= new Scanner(System.in);
    static int salary = 10000;
    public int getSalary(int salary){
 int result=0;
    return result;}
    public static int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
    	return employeeSalaries.get(0)+employeeSalaries.get(1);
    }
    public static void main(String[] args) {
    Labour l=new Labour();
    ArrayList<Integer> employeeSalaries=new ArrayList<Integer>(2);
   employeeSalaries.add(l.getSalary(salary));
    Manager m=new Manager();
    employeeSalaries.add(m.getSalary(salary));
    
   System.out.println("total salary is: "+totalEmployeesSalary(employeeSalaries));



}
}
