package Array;
import java.io.*;
import java.util.ArrayList;

public class 피보나치수열 {
	public static int[] solution(int num) {
		int[] arr = new int[num];
		arr[0] = 1;
		arr[1] = 1; 
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr;
	}
	
	// 배열 없이 변수로만
	public static void solution2(int num) {
		int a = 1, b = 1, c;
		System.out.println(a + " " + b + " ");
		
		for (int i = 2; i < num; i++) {
			c = a+b;
			System.out.println(c + " ");
			a = b;
			b = c;
		}
		
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int num = Integer.parseInt(br.readLine());
			for (int i : solution(num)) {
				bw.write(String.valueOf(i) + " ");
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.flush();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
