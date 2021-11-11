package binary_TO_something;

public class Binary_TO_octal {
   public static void main(String args[])
   {
	   String binary="1011101";
	   //System.out.println(convert(binary));
	   System.out.println(convertit(500));
	   
	   
	   forLoop(500);
   }
   public static int convert(String str)
   {
	   String s="";
	   int n=1;
	   int temp=0;
	   for(int i=str.length()-1;i>=0;i--)
	   {
		 if(str.charAt(i)=='1') temp+=n;
         if(n==1) n=2;
		 else 
		 {
			n=n*2;
			if(n>4)n=1;
		 }
	   }
	   return temp;
   }
   
   public static int convertit(int n)
   {
	   return (n*(n+1))/2;
   }
   
   public static void forLoop(int n)
   {
	   int a=0;
	   for(int i=1;i<=n;i++)
		   a+=i;
	   System.out.println(a);
   }
}
