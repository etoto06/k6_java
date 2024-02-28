package J14;

//@FunctionalInterface
interface Multiply{ //람다식의 기본 형태 
	double getValue();
	//double setValue();
}

public class test02 {
	
	public static void main(String[] args) {
		
		Multiply m = () -> 3.12 *2;
		System.out.println(m.getValue());
		
		m = () -> 10*3;
		System.out.println(m.getValue());
	}

}
