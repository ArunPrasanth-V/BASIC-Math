package AllMath;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FindSubstring {
    public static void main(String args[])
    {
    	String s1="hello";
    	String s2="ll";
        Pattern p= Pattern.compile(s2);
        Matcher m=p.matcher(s1);
        if(m.find())
        	System.out.println(m.start());
      
    }
}
