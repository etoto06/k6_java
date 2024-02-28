package J14;


interface MyInterface {
	public void print();
}

class MyClass1 implements MyInterface{
	@Override
	public void print() {
		System.out.println("MyClass1");
	}
}

class MyClass2 implements MyInterface {
	@Override
	public void print() {
		System.out.println("MyClass2");
	}
}

public class Test01 {
	public static void test(MyInterface mi) {
		mi.print();
	}
	
	public static MyInterface test2() {
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("test2()메서드에서 반환된 MyInterface");
			}
		};
		return mi;
	}

	
	public static void main(String[] args) {
		
		MyClass1 mc1 = new MyClass1();
		MyClass2 mc2 = new MyClass2();
		mc1.print(); //MyClass1
		mc2.print(); //MyClass2
		
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("익명클래스로 구현"); //두번이상 호출해야하면 이게 낫다 구현해랴할 코드에 따라 알아서 고르기 
			}
		};
		test(mc1);
		test(mi);
		
		mi.print();
		
		(new MyInterface() {
			@Override
			public void print() {
				System.out.println("선언,생성,호출을 한번에 처리");
			}
		}).print(); //선언 생성,호출을 한번에 처리 (한번만 호출하면 되서 쓰고 버리는 코드 ) 
		
		MyInterface mi2 = test2();
		mi2.print(); //test2() 메서드에서 반환된 MyInterface          27번째 줄에서 리턴받음           
	}
}
