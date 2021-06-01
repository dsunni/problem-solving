package String;
import java.io.*;

public class 유효한팰린드롬 {
	public static String solution(String str){
		String answer = "YES";
		int left = 0;
		int right = str.length() - 1;
		str = str.toUpperCase();
		
		while (left < right) {
			if (!Character.isAlphabetic(str.charAt(left))) left++;
			else if (!Character.isAlphabetic(str.charAt(right))) right--;
			else if (str.charAt(left) != str.charAt(right)) {
				return "NO";
			}
			else {
				left++;
				right--;
			}
		}
		
		
		return answer;
	}
	
	public static String solution2(String str) {
		String answer = "NO";
		// ^[A-Z] : A~Z가 아니면
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String reversedStr = new StringBuilder(str).reverse().toString();
		if (str.equals(reversedStr)) answer="YES";		
		return answer;
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String line = br.readLine();
			bw.write(solution2(line));
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