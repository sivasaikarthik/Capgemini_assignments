class BubbleSort{

    public int[] bubbleSort(int arr[]) {
    	int a,i,j,temp;
    	a=arr.length;
    	i=0;
    	while(i<a)
    	{
    		j=i+1;
    		while(j<a)
    		{
    			if(arr[i]>arr[j])
    			{
    				temp=arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
    			}
    			j=j+1;
    		}
    		i=i+1;   		
    		
    	}
    	return arr;
    }
}



public class Assignment1Q8{
    public static void main(String args[]) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
       BubbleSort b=new BubbleSort();
      b.bubbleSort(arr);
      for (int i=0; i<arr.length; i++) 
{ 
	System.out.println(arr[i]+"\t");

}
    }
}