package String;

public class charAt {

	public static void main(String[] args) {
		String num1 = "123";
		String num2 = "888";
		System.out.println(solve(num1, num2));

	}
	
	public static String solve(String num1, String num2) {
		// 1. ´ãÀ» ±×¸©
		int carry = 0;
		StringBuilder sb = new StringBuilder();
		int num1Length = num1.length()-1;
		int num2Length = num2.length()-1;
		
		// 2. 
		while (num1Length >= 0 || num2Length >= 0) {
			int n1 = 0, n2 = 0;
			// String -> Integer
			n1 = num1.charAt(num1Length)-'0';
			// String -> Integer
			n2 = num2.charAt(num2Length)-'0';

			int sum = n1+n2+carry;	// 11
			carry = sum/10;			// 1
			sb.append(sum%10);		// °ª
			
			num1Length--;
			num2Length--;
		}
		if (carry != 0) sb.append(carry);
		return sb.reverse().toString();
	}
}
