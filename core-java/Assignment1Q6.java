package delete;
import java.util.Scanner;

public class Assignment1Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login l=new Login();
		int noOfAttempts=3;
		String name=null,pass = null,res;
		Scanner input=new Scanner(System.in);
		
		res="false";
		while(noOfAttempts>0)
		{   name=input.nextLine();
		    pass=input.nextLine();
			res=l.loginUser(name, pass);
			if(res=="True")
   					break;
				
			noOfAttempts=noOfAttempts-1;
		}
		if(noOfAttempts==0)
			System.out.println("You have entered wrong credentials 3 times \nContact Admin");
		else
			System.out.println("Welcome "+name);
		

	}

}
