
public class StringConcat {

	public static void main(String[] args) {
		
		//method1
		String str1 = "Hello ";
		str1 += "world";
		
		System.out.println(str1);
		

		//method2
		StringBuffer str2 = new StringBuffer("Hello ");
		str2.append("world ");
		
		System.out.println(str2);
	
		/*Using string buffer for concatenation (method2) is faster than
		 * using + sign to concatenate (method1) when dealing with big loops	
		 */

	}
}
