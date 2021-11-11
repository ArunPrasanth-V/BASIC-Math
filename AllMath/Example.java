package AllMath;

public class Example {

	public static void main(String args[])
	{
		int i=36;
		System.out.println(5%3);
	}
	
	 public static int mySqrt(int x) {
	        long start =0;
	        long end=x;
	        while(start+1<end)
	        {
	            long mid=start+(end-start)/2;
	            if(mid*mid==x)
	                return (int)mid;
	            else if(mid*mid>x)
	                end=mid;
	            else
	                start=mid;
	        }
	        if(end*end==x)
	            return (int)end;
	        return (int)start;
	    }
	 public String convertToTitle(int n) {
	        String s="";
	        while(n>=0)
	        {
	            char c=(char) ('A'+(n-1)%26);
	            s=c+s;
	            n=(n-1)%26;
	           
	        }
	        return s;
	    }
}
