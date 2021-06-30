package Array;
import java.io.*;
import java.util.StringTokenizer;

public class 봉우리 {
	public static int solution(int n, int[][] arr) {
		int answer = 0;
		int[][] arr2 = new int[n+2][n+2];
		for (int i = 1; i <= arr.length; i++) {
			for (int j = 1; j <= arr.length; j++) {
				arr2[i][j] = arr[i-1][j-1];
			}
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (arr2[i][j] > arr2[i-1][j] && arr2[i][j] > arr2[i][j-1]
						&& arr2[i][j] > arr2[i][j+1] && arr2[i][j] > arr2[i+1][j]) {
					answer++;
				}
			}
		}
		return answer;
	}
	
	public static int solution2(int n, int[][] arr) {
		int answer = 0;
		// 방향 배열
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				boolean flag = true;
				for (int k = 0; k < 4; k++) {
					int nx = i+dx[k];
					int ny = i+dy[k];
					// 경계선 확인
					if (nx >= 0 && nx < n && ny >= 0 && ny < n &&
							arr[nx][ny] >= arr[i][j]) {
						flag = false;
						break;
					}
				}
				if (flag) answer++;
			}
		}
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
