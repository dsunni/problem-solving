package String;
import java.io.*;

public class 회문문자열 {
	public static String solution(String str) {
		char[] charArr = str.toCharArray();
		
		int lIdx = 0;
		int rIdx = str.length()-1;
		
		while (rIdx > lIdx) {
			if ((charArr[lIdx] == charArr[rIdx]) || 
					(charArr[lIdx] - charArr[rIdx] == ('a' - 'A') || 
							(charArr[lIdx] - charArr[rIdx] == ('A' - 'a')))) {
				lIdx++;
				rIdx--;
			} else {
				return "NO";
			}
		}
		
		return "YES";
	}
	
	public static String solution2(String str) {
		String answer = "YES";
		str = str.toUpperCase();
		int len = str.length();
		for (int i = 0; i < len/2; i++) {
			if (str.charAt(i) != str.charAt(len-i-1)) return "NO";
		}
		return answer;
	}
	
	public static String solution3(String str) {
		String answer = "NO";
		String reversedStr = new StringBuilder(str).reverse().toString();
		if (str.equalsIgnoreCase(reversedStr)) answer = "YES";
		return answer;
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String str = br.readLine();
			bw.write(solution(str));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.flush();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
