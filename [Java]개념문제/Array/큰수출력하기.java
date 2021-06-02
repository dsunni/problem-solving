package Array;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 큰수출력하기 {

  public static String solution(int num, int[] intArr) {
    StringBuilder sb = new StringBuilder();
    int before = -1;
    int i = 0;
    for (int now : intArr) {
      if (now > before) {
        sb.append(now);
        if (i != num - 1) {
          sb.append(" ");
        }
      }
      before = now;
      i++;
    }
    return sb.toString();
  }
  public static ArrayList<Integer> solution2(int n, int[] arr) {
    ArrayList<Integer> answer = new ArrayList<>();
    answer.add(arr[0]);
    for (int i = 1; i < n; i++) {
      if (arr[i] > arr[i-1]) answer.add(arr[i]);
    }
    return answer;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int num = Integer.parseInt(br.readLine());
    String str = br.readLine();
    StringTokenizer st = new StringTokenizer(str, " ");
    int[] intArr = new int[num];
    for (int i = 0; i < num; i++) {
      intArr[i] = Integer.parseInt(st.nextToken());
    }
    bw.write(solution(num, intArr));

    br.close();
    bw.flush();
    bw.close();
  }
}