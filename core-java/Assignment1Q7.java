class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue){
    	int i,a;
    	a=arr.length;
    	i=0;
    	while(i<a)
    	{
    		if(arr[i]==toCheckValue)
    		{
    			return false;
    		}
    		i=i+1;
    	}
    	return true;
    
    }
}
public class Assignment1Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchArray s=new SearchArray();
		 int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	        int valueToCheck = 19;
           if(s.searchArray(arr,valueToCheck))
        	   
           {
        	   System.out.println("Present in the list");
           }
           else
           {
        	   System.out.println("Not present in the list");
           }
	}

}
