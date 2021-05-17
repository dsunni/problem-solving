package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 문장속단어 {
	public String solution(String str) {
		String answer = "";
		StringTokenizer st = new StringTokenizer(str, " ");
		List<String> strList = new ArrayList<>();
		while (st.hasMoreElements()) {
			strList.add(st.nextToken());
		}
		int max = Integer.MIN_VALUE;
		for (String s : strList) {
			if (s.length() > max) { // >=를 하면 뒤쪽에서 같은 길이를 발견하면 갱신됨
				max = s.length();
				answer = s;
			}
		}
	
		return answer;
	}
	
	public String solution2(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE, pos;
		// indexOf -> 해당 값 발견하면 index, 못하면 -1 리턴
		while ((pos = str.indexOf(' ')) != -1) {
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if (len > m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos+1);
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		문장속단어 T = new 문장속단어();
		
		String str = br.readLine();
		System.out.println(T.solution(str));
	}

}
