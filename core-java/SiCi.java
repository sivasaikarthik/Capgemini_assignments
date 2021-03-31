package org.three;
import java.lang.Math;
public class SiCi {
	public double simpleInterest(double principalAmount,int time,double interestRate){
			
		return (principalAmount*time*interestRate)/100;
		
	}
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	
    	return (principalAmount*(Math.pow(1+interestRate/100, time)))-principalAmount;
    }
}
