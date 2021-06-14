package Array;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 뒤집은소수 {
	public static ArrayList<String> solution(int num, String str) {
		ArrayList<String> answer = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(str, " ");
		for (int i = 0; i < num; i++) {
			StringBuilder sb = new StringBuilder(st.nextToken());
			int reversedInt = Integer.parseInt(sb.reverse().toString());
			boolean isPrime = true;
			
			// 소수 판별
			if (reversedInt == 1) isPrime = false;
			else if (reversedInt > 2) {
				for (int j = 2; j < reversedInt-1; j++) {
					if (reversedInt % j == 0) {
						isPrime = false;
						break;
					}
				}
			}
			if (isPrime) answer.add(String.valueOf(reversedInt));
		}
		return answer;
	}
	public static boolean isPrime(int num) {
		// 소수판별
		if (num == 1) return false;
		for (int i = 2; i < num-1; i++) {
			if (num % i == 0) return false;
		}
		return true;
	}
	
	public static ArrayList<Integer> solution2(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int tmp = arr[i];
			int res = 0;
			while (tmp > 0) {
				// 어떤 숫자를 10으로 나눈 나머지는 항상 1의 자리수이다.
				int t = tmp % 10;
				res = res * 10 + t;
				tmp = tmp / 10;
			}
			// 뒤집힌 숫
			if (isPrime(res)) answer.add(res);
		}
		return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		for (String primeNum : solution(num, str)) {
			bw.write(primeNum + " ");
		}

		
		br.close();
		bw.flush();
		bw.close();
	}

}