package String;

public class subString {

	public static void main(String[] args) {
		String str[] = {"mano", "manon", "manooo"};
		System.out.println(solve(str));

	}
	public static String solve(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		
		// test
		String firstStr = strs[0];
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i].indexOf(firstStr));
			
			while(strs[i].indexOf(firstStr) != 0) {
				// test를 줄여나감
				firstStr = firstStr.substring(0, firstStr.length() - 1); // test, test, te
			}
		}
		return firstStr;
	}

}
