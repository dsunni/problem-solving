package Array;
import java.io.*;
import java.util.StringTokenizer;

public class 점수계산 {
	public static int solution(int num, int[] intArr) {
		int answer = 0;
		int cnt = 0;
		for (int a : intArr) {
			if (a == 1) {
				cnt++;
				answer += cnt;
			} else {
				cnt = 0;
			}

		}
		return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] intArr = new int[num];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = Integer.parseInt(st.nextToken());
		}
		
		bw.write(String.valueOf(solution(num, intArr)));
		br.close();
		bw.flush();
		bw.close();
	}

}
