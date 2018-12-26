package onlytest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // 按指定模式在字符串查找
	      String line = "This order was placed for QT3000! OK?";
	      String pattern = "(\\D*)(\\d+)(.*)";
	      String test = "AirConditionImpl.cool()";
	      String pattern2="(\\D*)(\\.)(\\D*)(\\()";
	 
	      // 创建 Pattern 对象
	      Pattern r = Pattern.compile(pattern);
	      Pattern r2= Pattern.compile(pattern2) ;
	 
	      // 现在创建 matcher 对象
	      Matcher m = r.matcher(line);
	      if (m.find( )) {
	         System.out.println("Found value: " + m.group(0) );
	         System.out.println("Found value: " + m.group(1) );
	         System.out.println("Found value: " + m.group(2) );
	         System.out.println("Found value: " + m.group(3) ); 
	      } else {
	         System.out.println("NO MATCH");
	      }
	      
	      
	      Matcher m2 =r2.matcher(test);
	      if (m2.find( )) {
		         System.out.println("Found value: " + m2.group(0) );
		         System.out.println("Found value: " + m2.group(1) );
		         System.out.println("Found value: " + m2.group(2) );
		         System.out.println("Found value: " + m2.group(3) ); 
		      } else {
		         System.out.println("NO MATCH");
		      }
		      
	      
	}

}
