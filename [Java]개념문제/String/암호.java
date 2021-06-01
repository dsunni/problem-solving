package String;
import java.io.*;

public class 암호 {
	public static String solution(int num, String str) {
		StringBuilder sb = new StringBuilder();
		int limit = 7;
		for (int i = 0; i < num; i++) {
			// 7로 자른 문자열 추출
			String tmp = str.substring(i*limit, (i+1)*limit);
			
			// 이진수로 변환
			tmp = tmp.replaceAll("#", "1");
			tmp = tmp.replaceAll("\\*", "0"); // 정규식에서 특수문자는 앞에 '\\'를 붙여줘야함
			
			// 십진수로 변환
			int tenDig = 0;
			for (int j = tmp.length()-1; j >= 0; j--) {
				tenDig += (tmp.charAt(j)-'0')*Math.pow(2, tmp.length()-(j+1));
			}
			
			// 문자로 변환
			sb.append((char)tenDig);
		}
		return sb.toString();
	}
	
	public static String solution2(int n, String s) {
		String answer ="";
		for (int i = 0; i < n; i++) {
			String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
			
			// Integer.parseInt : 이진수 -> 십진수화
			int num = Integer.parseInt(tmp, 2);
			
			// 문자열로 변환
			answer += (char)num;
			
			s = s.substring(7);
		}
		return answer;
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int num = Integer.parseInt(br.readLine());
			String str = br.readLine();
			bw.write(solution2(num, str));
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
