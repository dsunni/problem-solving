package String;
import java.io.*;
import java.util.*;

public class 가장짧은문자거리 {
	public static String solution(String s, String t) {
		StringBuilder sb = new StringBuilder();
		char flag = t.charAt(0);
		List<Integer> idxList = new ArrayList<>();
		int i = 0;
		for (char c : s.toCharArray()) {
			if (c == flag) idxList.add(i);
			i++;
		}
		
		for (int j = 0; j < s.length(); j++) {
			int min = Integer.MAX_VALUE;
			for (int k : idxList) {
				int sub = Math.abs(k-j);
				if (sub < min) min = sub;
			}
			sb.append(min);
			if (j != s.length()-1) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}
	
	public static String solution2(String s, String t) {
		int[] answer = new int[s.length()];
		int p = 1000;
		char target = t.charAt(0);
		// 왼쪽으로부터 떨어진 거리 구하기
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == target) {
				p=0;
				answer[i] = p;
			} else {
				p++;
				answer[i] = p;
			}
		}
		
		// 오른쪽으로부터 떨어진 거리와 비교 후 작은 값으로 교체
		p = 1000;
		for (int i = s.length()-1; i >= 0; i--) {
			if (s.charAt(i) == target) p=0;
			else {
				p++;
				// 기존보다 작은 값으로 교체
				answer[i] = Math.min(answer[i], p);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i : answer) {
			sb.append(String.valueOf(i));
			sb.append(" ");
		}
		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String s = st.nextToken();
		String t = st.nextToken();
		bw.write(solution(s, t));
		
		br.close();
		bw.flush();
		bw.close();
	}

}