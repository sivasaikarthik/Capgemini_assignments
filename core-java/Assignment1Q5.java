import java.util.Scanner;
class TaxAmount {
	public double calculateTaxAmount(int ctc){
		if (ctc>=0 &&ctc<180000)
			return 0;
		else if (ctc>=180000 &&ctc<300000)
			return ctc*0.1;
		else if (ctc>=300000 &&ctc<500000)
			return ctc*0.20;
		else
			return ctc*0.3;
		
		
	}
	
}
public class Assignment1Q5 {

	public static void main(String[] args) {
		int salary;
		TaxAmount t=new TaxAmount();
		Scanner input=new Scanner(System.in);
		salary=input.nextInt();
		System.out.println(t.calculateTaxAmount(salary));

	}

}