package J14;

import java.util.function.Function;

//최상위 추상 클래스 geomatry 생성 ==> 추상메서드로 면적 구하는 메서드 선언

//자식 클래스를 생성 => 3개
abstract class Geomatry{
	abstract double getArea();
}

class circle extends Geomatry{
	
	int radius;
	
	public circle(int radius) {
		this.radius = radius;
	}	
	
	double getArea() {
		return 0;
	}

//class{
	int h;
	int w;
	public Triangle(int h, int w) {
		
	}

public class GeomatryTest {
	
	public static void main(String[] args) {
		
		Function<Geomatry, Double > func = (g) -> {
			return g.getArea();
		};
		
		System.out.println("원면적 " + func.apply(new circle(5)));
	}
}
