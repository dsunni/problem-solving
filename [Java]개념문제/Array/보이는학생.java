package Array;

import java.io.*;
import java.util.StringTokenizer;

public class 보이는학생 {

  public static int solution(int[] intArr) {
    int cnt = 0;
    int max = Integer.MIN_VALUE;
    for (int i : intArr) {
      if (i > max) {
        max = i;
        cnt++;
      }
    }
    return cnt;
  }
  
  public static int solution2(int n, int[] arr) {
	  int answer = 1, max = arr[0];
	  for (int i = 1; i < n; i++) {
		  if (arr[i] > max) {
			  answer++;
			  max = arr[i];
		  }
	  }
	  return answer;
  }

  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    try {
      int num = Integer.parseInt(br.readLine());
      int[] intArr = new int[num];
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      for (int i = 0; i < num; i++) {
          intArr[i] = Integer.parseInt(st.nextToken());
      }
      bw.write(solution(intArr));
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