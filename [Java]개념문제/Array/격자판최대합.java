package Array;
import java.io.*;
import java.util.StringTokenizer;

public class 격자판최대합 {
	public static int solution(int num, int[][] arr) {
		int answer = Integer.MIN_VALUE;
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 0; i < num; i++) {
			sum1=sum2=0;
			for (int j = 0; j < num; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		
		sum1=sum2=0;
		for (int i = 0; i < num; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][num-i-1];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		
		return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.valueOf(br.readLine());
		int[][] arr = new int[num][num];
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < num; j++) {
				arr[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		System.out.println(solution(num, arr));
	}

}
