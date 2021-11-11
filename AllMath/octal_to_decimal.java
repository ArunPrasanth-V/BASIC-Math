package AllMath;

public class octal_to_decimal {
	public static void main(String[] args) 
	{
		int octal=54;
        System.out.println(convert_binary(octal));
	}
	public static int convert_Decimal(int octal)
	{
		int decimal=0,i=0;
		while(octal>0)
		{
			decimal+=(octal%10)*Math.pow(8,i);
			octal/=10;
			i++;
		}
		return decimal;
	}
	
	public static long convert_binary(int octal)
	{
		int decimal=convert_Decimal(octal);
		int i=1;
		long binary=0;
		while(decimal>0)
		{
			binary+=(decimal%2)*i;
			decimal/=2;
			i*=10;
		}
		return binary;
	}
	public static int convert_decimal(String binary)
	{
		if(binary=="0")
			return 0;
		int decimal=0;
		int len=binary.length()-2;
		int i=2;
		while(len>=0)
		{
		 int b=Integer.parseInt(binary.charAt(len));
		}
		return 8;
	}
}
