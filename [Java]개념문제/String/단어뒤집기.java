package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 단어뒤집기 {
   public ArrayList<String> solution(int n, String[] str) {
      ArrayList<String> strList = new ArrayList<>();
      // StringBuilder
      // String은 String끼리 더하거나 수정할 때마다 새로운 객체가 생성됨
      // 반면 StringBuilder는 수정하거나 더해도 처음 만든 객체를 사용
      // 따라서 메모리 낭비가 없고 무겁지 않음 -> String연산이 많을 때는 StringBuilder를 사용
      for (String x : str) {
    	  String tmp = new StringBuilder(x).reverse().toString();
    	  strList.add(tmp);
      }
      return strList;
   }
   
   public ArrayList<String> solution2(int n, String[] str) {
	   ArrayList<String> strList = new ArrayList<>();
	      for (String x : str) {
	    	  char[] s = x.toCharArray();
	    	  int lt = 0, rt = x.length()-1;
	    	  while (lt < rt) {
	    		  char tmp = s[lt];
	    		  s[lt] = s[rt];
	    		  s[rt] =  tmp;
	    		  lt++;
	    		  rt--;
	    	  }
	    	  String tmp = String.valueOf(s);
	    	  strList.add(tmp);
	      }
	      return strList;
   }

   public static void main(String[] args) throws NumberFormatException, IOException {
      단어뒤집기 T = new 단어뒤집기();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int size = Integer.parseInt(br.readLine());
      String[] strArr = new String[size];
      for (int i = 0; i < size; i++) {
         strArr[i] = br.readLine();
      }
      for (String x : T.solution(size, strArr)) {
         System.out.println(x);
      }
   }

}