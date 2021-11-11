package AllMath;

public class Unique_element_in_2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr1[]= {1,3,5,6};
     int target=7;
   
     System.out.println(doSomething(arr1,target));
	}
	public static int doSomething(int arr[],int target)
	{
	  int max=Integer.MIN_VALUE;
	  int curr=0;
	  for(int i:arr)
	  {
		  curr+=i;
		  max=max>curr?max:curr;
		  if(curr<0)
			  curr=0;
	  }
	  return max;
	}
	

}
