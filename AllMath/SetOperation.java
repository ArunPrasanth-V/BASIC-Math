package AllMath;

import java.util.HashSet;
import java.util.Set;

public class SetOperation {

	public static void main(String args[])
	{
		Set<Integer> store=new HashSet<>();
		Set<Integer> store1=new HashSet<>();
		int arr[]= {1,2,3,4,5,6};
		int arr1[]= {1,8,7,4,2};
		int len=arr.length>arr1.length?arr.length:arr1.length;
		for(int i=0;i<len;i++)
		{
		   if(i<arr.length)
			   store.add(arr[i]);
		   if(i<arr1.length)
		   {
			   int u=store.size();
			   store.add(arr1[i]);
			   if(u==store.size())
				   store1.add(arr1[i]);
		   }
		}
		System.out.println((store.size()-store1.size())+
				" are Element unique ");
	}
}
