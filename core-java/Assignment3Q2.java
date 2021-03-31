import java.util.*; 

public class Assignment3Q2 {
    public static void main(String[] args) { 
    	Assignment3Q2 a=new Assignment3Q2();
        LinkedHashSet<String> set=new LinkedHashSet();  
        HashSet<String> has=new HashSet<String>();
        set=a.ordered(set);
    	has=a.unordered(has);
    	System.out.println("ordered linked list:"+set);
    	System.out.println("unordered hashset:"+has);
    	
    }
    public static LinkedHashSet ordered(LinkedHashSet linkedHashSet){
    	linkedHashSet.add("Rangisetti");
    	linkedHashSet.add("siva");
    	linkedHashSet.add("sai");
    	linkedHashSet.add("karthik");
    	return linkedHashSet;
    	
    }
    public static HashSet unordered(HashSet hashSet){
    	hashSet.add("Rangisetti");
    	hashSet.add("siva");
    	hashSet.add("sai");
    	hashSet.add("karthik");
    	return hashSet;
    
    }
}