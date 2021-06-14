package Array;
import java.io.*;

public class ¼Ò¼ö {
	public static int solution(int num) {
		int answer = 0;
		int[] ch = new int[num+1];
		for (int i = 2; i <= num; i++) {
			if (ch[i] == 0) answer++;
			for (int j = i; j <= num; j = j+i) ch[j] = 1;
		}
		
		return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		bw.write(String.valueOf(solution(num)));
		
		br.close();
		bw.flush();
		bw.close();
	}

}