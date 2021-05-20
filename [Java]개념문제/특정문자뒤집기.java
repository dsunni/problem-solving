package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 특정문자뒤집기 {
	private String solution(String str) {
		char[] charArr = str.toCharArray();
		int leftIdx = 0;
		int rightIdx = charArr.length-1;
		while (rightIdx > leftIdx) {
			if ((charArr[leftIdx] >= 'a' && charArr[leftIdx] <= 'z') ||
				(charArr[leftIdx] >= 'A' && charArr[leftIdx] <= 'Z')) {
				char tmp = charArr[leftIdx];
				charArr[leftIdx] = charArr[rightIdx];
				charArr[rightIdx] = tmp;
			}
			leftIdx++;
			rightIdx--;
		}
		return String.valueOf(charArr);
	}
	
	private String solution2(String str) {
		String answer = "";
		char[] charArr = str.toCharArray();
		int lt = 0, rt = str.length()-1;
		while (lt < rt) {
			// 알파벳인지 확인
			if (!Character.isAlphabetic(charArr[lt])) lt++;
			else if (!Character.isAlphabetic(charArr[rt])) rt--;
			else {
				char tmp = charArr[lt];
				charArr[lt] = charArr[rt];
				charArr[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(charArr);
		
		return answer;
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		특정문자뒤집기 T = new 특정문자뒤집기();
		try {
			String line = br.readLine();
			bw.write(T.solution2(line));
		} catch (IOException e) {

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
