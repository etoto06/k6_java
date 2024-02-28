package J11;

import java.io.FileInputStream;
import java.io.IOException;

public class Test04 {

	public static void test() throws Exception {

		FileInputStream fi = new FileInputStream("a.txt");
		int c = fi.read(); // c에다가 fi.read를 이용해 한글자를 읽음 , H의 아스키코드값을 읽는다 , 그건 -1이 아니르모 계속 반복
		System.out.print(c); // 아스키코드값 출력
		System.out.print(",");
		System.out.println((char) c); // 아스키코드를 char타입으로 변환한 값을 출력
	}

	public static void main(String[] args) {
		System.out.println("start");
		try {
			test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} // 예외를 던질래? 아니면 트라이캐치로 싸줄래 라고 묻는다
		System.out.println("end");
	}
}
