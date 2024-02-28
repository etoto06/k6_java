package J08;

class OuterClass {
	
	class InstanceClass{
		int a;
		void method2() {
			System.out.println("instance Class : " +a );
		}
	}
}



public class OuterClassTest {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InstanceClass inner01 = outer.new InstanceClass();/*외부클래스*/ /*내부클래스*/
		Outerclass.InstanceClass inner02 = outer.new InstanceClass();
	
		
		inner01.a = 123;
		inner01.method2();
	}

}
