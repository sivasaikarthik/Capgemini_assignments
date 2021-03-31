import java.util.ArrayList;
import java.util.function.Predicate;

public class Assignment4Q2 {

    private int totalPrice;
    private String status;
    
    public Assignment4Q2(int totalPrice, String status) {
		super();
		this.totalPrice = totalPrice;
		this.status = status;
	}
	//public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders) {}
    public static void main(String[] args) {
    	ArrayList<Assignment4Q2> a=new ArrayList();
    	Assignment4Q2 p1=new Assignment4Q2(20000, "failed");
    	Assignment4Q2 p2=new Assignment4Q2(20000, "ACCEPTED");
    	a.add(p2);
    	a.add(p1);
    	Predicate<Assignment4Q2> pr=e->(e.totalPrice>10000 && (e.status.contentEquals("ACCEPTED") || e.status.contentEquals("Completed")));
    	for (Assignment4Q2 i:a)
		{
			if(pr.test(i))
			{
				System.out.println("price:"+i.totalPrice+ " Status:"+i.status);
			}
		}
    }
}

