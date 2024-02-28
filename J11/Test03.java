package J11;

import java.io.FileInputStream;
import java.io.IOException;

public class Test03 {

	public static void main(String[] args) {

		try (FileInputStream fi = new FileInputStream("a.txt")) {
			int c;
			while((c = fi.read()) != -1) { //c에다가 fi.read를 이용해 한글자를 읽음 , H의 아스키코드값을 읽는다 , 그건 -1이 아니르모 계속 반복 
				System.out.print(c);  //아스키코드값 출력
				System.out.print(",");
				System.out.println((char) c);  // 아스키코드를 char타입으로 변환한 값을 출력 
		} 
		}catch (IOException e) { //파일이 없는경우 에러가 발생해 이쪽으로 온다 
			e.printStackTrace();
		}
	}
}
