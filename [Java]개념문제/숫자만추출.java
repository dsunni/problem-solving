package String;
import java.io.*;

public class 숫자만추출 {
	public static int solution(String str) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c)) sb.append(c);
		}
		
		return Integer.parseInt(sb.toString());
	}
	
	public static int solution2(String str) {
		int answer = 0;
		for (char x : str.toCharArray()) {
			if (x >= 48 && x <= 57) answer = answer*10 + (x-48);
		}
		return answer;
	}
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String line = br.readLine();
			System.out.println(solution2(line));
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