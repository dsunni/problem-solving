package Array;

import java.io.*;
import java.util.StringTokenizer;

public class 가위바위보 {
	public static String solution(int n, int[] a, int[] b) {
		String answer ="";
		for (int i = 0; i < n; i++) {
			if (a[i] == b[i]) answer+="D";
			else if (a[i] == 1 && b[i] == 3) answer+="A";
			else if (a[i] == 2 && b[i] == 1) answer+="A";
			else if (a[i] == 3 && b[i] == 2) answer+="A";
			else answer+="B";
		}
		return answer;
	}

	public static void main(String[] args) {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	    try {
	      int num = Integer.parseInt(br.readLine());
	      int[] a = new int[num];
	      int[] b = new int[num];
	      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	      for (int i = 0; i < num; i++) {
	          a[i] = Integer.parseInt(st.nextToken());
	      }
	      st = new StringTokenizer(br.readLine(), " ");
	      for (int i = 0; i < num; i++) {
	          b[i] = Integer.parseInt(st.nextToken());
	      }
	      bw.write(solution(num, a, b));
	    } catch (IOException e) {
	      e.printStackTrace();
	    } finally {
	      try {
	        br.close();
	        bw.flush();
	        bw.close();
	      } catch (IOException e) {
	        e.printStackTrace();
	      }
	    }
	  }

}
