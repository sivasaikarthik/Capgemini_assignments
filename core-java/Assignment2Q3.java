import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
    	return totalDeposits-creditLimit;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
    	return totalDeposits+fixedDepositAmount;
    }
}
public class Assignment2Q3 {
    public int totalCashInBank(ArrayList<Integer> cash){
    	int sum;
    	sum=0;
    	for(int i:cash)
    	{
    		sum=sum+i;
    		
    	}
    	return sum;
    }
    public int getCash(){
    	return 0;
    }
    public static void main(String[] args) {
    	ArrayList<Integer> cash=new ArrayList();
    	SavingsAccount s=new SavingsAccount();
    	cash.add(s.getCash());
    	CurrentAccount c=new CurrentAccount();
    	cash.add(c.getCash());
    	Assignment2Q3 ass=new Assignment2Q3();
    	System.out.println(ass.totalCashInBank(cash));
    	
    }
}

