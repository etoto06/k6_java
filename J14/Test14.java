package J14;

import java.util.function.Function;

//인터페이스는 사용하는데 선언이 없다, 왜냐하면 자바가 기본적으로 제공하는것이기 떄문이다 
public class Test14 {
	public static void main(String[] args) {
		Function<String,Integer> func = (s) -> {
			int cnt =0;
			String[] word = s.split("");
			cnt = word.length;
			return cnt;
		};
		
		int wordCnt = func.apply("고개를 들어 별들을 보라 당신 발만 내다 보지말고");
		System.out.println("단어 수 : " + wordCnt);
	}
}
  //              Geometry
  //    cincle 			rectangle			triangle	
      					
  //    int radius		int width			int height
  //  					int height			int width
      										
           
             