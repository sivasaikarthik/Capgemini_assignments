
import java.util.Scanner;

abstract class DesertItem {

    abstract public int getCost();
}
class Candy extends DesertItem {
    int cost=60;
    public int addCandies(int candies){
    	return getCost()*candies;

}
	@Override
	public int getCost() {
		System.out.println("cost of the candy in $");
		return cost;
	}
}
class Cookie extends DesertItem {
	int cost=70;
	
    public int addCookies(int cookies){
    	return getCost()*cookies;
    }

	@Override
	public int getCost() {
	System.out.println("cost of the cookies in euros");
	return cost;
	}
}
class IceCream extends DesertItem {
	int cost=1;
    public int addIceCreams(int ice){
    	return ice*getCost();
    }

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		System.out.println("cost in rupees");
		return cost;
	}
}
public class Assignment2Q7 {
	Scanner input=new Scanner(System.in);
	int[] a = {0,0,0,0};
    public static void main(String[] args) {
    	 Assignment2Q7 seve=new Assignment2Q7();
    	seve.selectRoles();
    }
    private void selectRoles(){
    	int a;
    	
    	System.out.println("1. for owner /n 2.customer");
    	a=input.nextInt();
    	if(a==1)
    	{
    		roles("owner");
    	}
       if(a==2)    
        {
    	   roles("customer");
    		
    	}
    	
    }
    private void roles(String role){
    	if(role=="customer"	) 
    	{
    		placeOrder();
    	}
    	else
    	{
    		addItems();
    	}
    }
    private void addItems() {
    	System.out.println("how many item u want to add");
    	int i,item;
    	i=input.nextInt();
    	while(i>0)
    	{System.out.println("1.Candy 2.Cookie 3. Ice Cream");
    		item=input.nextInt();
    	addItemsOperation(item);
    	i=i-1;
    }
    }
    private void addItemsOperation(int choice) {
    a[choice]=a[choice]+1;
    }
    private void placeOrder() {
    	System.out.println("1.Candy 2.Cookie 3. Ice Cream");
    	int item;
    	item=input.nextInt();
    	placeOrderOperation(item);
    }
    private void placeOrderOperation(int choice) {
    	if (choice==1)
    	if(a[choice]>0)
    	{
    		Candy c=new Candy();
    		System.out.println(c.addCandies(1));
    		a[choice]=a[choice]-1;
    	}
    	if (choice==2)
        	if(a[choice]>0)
        	{
        		Cookie co=new Cookie();
        		System.out.println(co.addCookies(1));
        		a[choice]=a[choice]-1;
        	}
    	if (choice==3)
        	if(a[choice]>0)
        	{
        		IceCream i=new IceCream();
        		System.out.println(i.addIceCreams(1));
        		a[choice]=a[choice]-1;
        	}
    	
    }
    
}

