package Array;
import java.io.*;
import java.util.StringTokenizer;

public class 등수구하기 {
	public static int[] solution(int num, int[] arr) {
		StringBuilder sb = new StringBuilder();
		int[] answer = new int[num];
		for (int i = 0; i < num; i++) {
			int cnt = 1;
			for (int j = 0; j < num; j++) {
				if (arr[j] > arr[i]) cnt++;
			}
			answer[i] = cnt;
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
		
		for (int n : solution(num, intArr)) {
			bw.write(String.valueOf(n + " "));
		}

		br.close();
		bw.flush();
		bw.close();

	}

}
