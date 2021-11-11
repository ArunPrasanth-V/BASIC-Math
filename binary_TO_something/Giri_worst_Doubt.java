package binary_TO_something;

public class Giri_worst_Doubt {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		myBinarySearch(arr,10);
	}
	public static void myBinarySearch(int []arr,int target)
	{
		int len=arr.length;
	    int start=0;
	    int end=arr.length-1;
	    int i=0;
	    while(start<=end)
	    {
	    	System.out.println("starting --"+start);
	    	System.out.println("ending   --"+end);
	     int mid=start +(end-start)/2;
	      if(arr[mid]==target)	
	      {
	    	  System.out.println(arr[mid]);
	    	  System.out.println("we fount it!!' "+i+" ' only these time");
	            break;
	      }
	      else if(arr[mid]>target)
	      {
	    	end=mid-1;  
	      }
	      else
	      {
	    	  start=mid+1;
	      }
	      i++;
	    }
	}
	
   public static void theseone(int arr[],int t)
   {
	   
   }

}
