import java.util.Scanner;
class ResultDeclaration {
	  public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) 
	  {
		  //String result="failed";
		  if (subject1Marks>60 && subject2Marks>60 && subject3Marks>60)
			  return "passed";
		  else if((subject1Marks>60 && subject2Marks>60) ||(subject1Marks>60&& subject3Marks>60)||(subject2Marks>60&& subject3Marks>60))
			  return "promoted";
		  else
			  return "failed";
		  
		  
	  }

}
public class Assignment1Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		ResultDeclaration r=new ResultDeclaration();
		int subject1Marks,subject2Marks,subject3Marks;
		subject1Marks=input.nextInt();
		subject2Marks=input.nextInt();
		subject3Marks=input.nextInt();
		System.out.println("marks are "+subject1Marks+subject2Marks+subject3Marks+"  "+r.declareResults(subject1Marks,subject2Marks,subject3Marks));
		

	}

}
