package J14;

interface Calculator {
	int func();
}

public class Test09 {

	static int num1 = 10;
	int num2 = 20;
	
	public static void main(String[] args) {
		Test09  test = new Test09();
		int num3 = 30;
		
		
		//여기부터 람다식 구현된 메서드 
		Calculator calc = () ->{
			int num4 = 40; //람다식 안에서 선언
			Test09.num1++; //넘1넘2도 필드값이라 수정가능 
			test.num2++;   //
		//	num3++; //오류발생, test 는 수정이 안되는데 테스트에 있는 필드는 수정이 가능하다 
			//지역변수는 참조하고 읽을순있는데  수정은 할 수 없다 
			//test = new Test09();
			// 테스트라는 변수자체가 파이널처럼 사용되기때문에 변경이안됨 하지만 그 안에 값은 변경가능
			num4++;
			return num4;
		};
	}
}
