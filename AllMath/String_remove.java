package AllMath;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_remove {
 public static void main(String args[])
 {
	 String str="arunEFrg7tu";
	 System.out.println(check(str));
 }
 public static String check(String str)
 {
     StringBuffer s=new StringBuffer();
//	 Pattern p=Pattern.compile("EF|G|7|56");
//	 Matcher m=p.matcher(str);
	  String []arr=str.split("EF|G|7|56");
	  for(String ss:arr)
	    s.append(ss);
	  //return s.toString();
	  for(int i=0;i<str.length();i++)
	  {
		  if(str[i].equals('j'))
			  return "hello";
	  }
 }

}
