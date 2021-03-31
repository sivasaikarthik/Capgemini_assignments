package delete;

public class Login {
	  String userId = "Ajay",password = "password";
	    public String loginUser(String user, String pass) {
	    	if(user==this.userId && pass==this.password)
	    	return "true";
	    	System.out.println("You have entered wrong credentials ,please enter the right credentials");
			return "false";
	    }
}
