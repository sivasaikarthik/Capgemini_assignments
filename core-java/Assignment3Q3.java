import java.util.ArrayList;
import java.util.List;

public class Assignment3Q3 {
    public static List traverseReverse(List<String> a){
    	int mid,i,len=a.size();
    	List<String>b=new ArrayList();
    	len=len-1;
    	while(len>=0)
    	{
    		b.add(a.get(len));
    		len=len-1;
    	}
    	return b;
    }
    public static void main(String[] args) {
    	List<String>a=new ArrayList();
    	a.add("c");
    	a.add("a");
    	a.add("r");
    	Assignment3Q3 object=new Assignment3Q3();
    	System.out.println(a);
    	a=object.traverseReverse(a);
    	System.out.println("after transverse"+a);
    }
}