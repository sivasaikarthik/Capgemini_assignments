import java.util.Scanner;

class ArmstrongOrNot {
    public boolean armstrongCheck(int n) {
int dup,sum,num;
num=n;
sum=0;
    while(num>0)
{
  dup=num%10;
  num=num/10;
  sum=sum+(dup*dup*dup);
   
}
   if(sum==n)
   return true;
  else
    return false;    
    }

}

public class Assignment1Q1 {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int a=input.nextInt();
    ArmstrongOrNot ko=new ArmstrongOrNot();
    if (ko.armstrongCheck(a))
    {
    	System.out.println("Armstrong");
    }
else
System.out.println("not Armstrong");

    
    
    
    
    }
}
