
public class Assignment4Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     add my=(a, b)-> a+b;
     System.out.println(my.add(10, 20));
     substract s=(a,b)->a-b;
     System.out.println(s.sub(10, 20));
     multiply m=(a,b)->a*b;
     System.out.println(m.mul(10, 20));
     divide r=(a,b)->a/b;
     System.out.println(r.div(200, 20));
     
	}

}
interface add
{
	int add(int a,int b);
}

 interface substract {
    int sub(int a,int b);
}

 interface multiply {
    int mul(int a,int b);
}

 interface divide {
	int div(int a,int b);

}
