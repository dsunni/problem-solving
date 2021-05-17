package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 대소문자변환 {
	public String solution(String str) {
		String answer = "";
		// Character 사용
		for (char x : str.toCharArray()) {
			if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			else answer += Character.toLowerCase(x);
		}
		return answer;
	}
	
	public String solution2(String str) {
		String answer = "";
		// 아스키넘버 사용 : 대문자(65~90), 소문자(97~122) -> 대소문자 차이 32
		for (char x : str.toCharArray()) {
			if (x >= 97 && x <= 122) answer += (char)(x-32);
			else answer += (char)(x+32);
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		대소문자변환 T = new 대소문자변환();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(T.solution(str));
	}

}
