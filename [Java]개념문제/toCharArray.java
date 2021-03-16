package String;

public class toCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a)b(c)d";
		String s1 = "))((";
		String s2 = "(a(b(c)d)";
		System.out.println(solution(s));
		System.out.println(solution(s1));
		System.out.println(solution(s2));
	}
	
	public static String solution(String s) {
		StringBuilder sb = new StringBuilder();
		StringBuilder result = new StringBuilder();
		int openBrace = 0; // "("
		
		for (char c : s.toCharArray()) {
			if (c == '(') {
				openBrace++;
			} else if (c == ')') {
				if (openBrace == 0) continue;	// openBrace가 0이면 버린다
				openBrace--;
			}
			sb.append(c);
		}
		
		for (int i = sb.length()-1; i >= 0; i--) {
			if (sb.charAt(i) == '(' && openBrace-- > 0) continue;
			result.append(sb.charAt(i));
		}
		return result.reverse().toString();
	}

}
