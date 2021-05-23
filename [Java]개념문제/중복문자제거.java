package String;

import java.io.*;

public class 중복문자제거 {
	public static String solution(String str) {
		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			// indexOf(char) -> char가 처음으로 등장하는 위치
			// System.out.println(i + " " + str.charAt(i) + " " + str.indexOf(str.charAt(i)));
			if (str.indexOf(str.charAt(i)) == i) answer.append(str.charAt(i));
			
		}
		
		return answer.toString();
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
