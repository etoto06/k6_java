package J11;

public class Test05_1 {
	
	int battery = 0;
	
	public void charge(int time) throws Exception {
		
		if (time <0 ) {
			time =0;
				throw new NagativeNumberException();
			} 
		battery += time;
		System.out.println("현제 배터리 : " + battery );
	}

	public static void main(String[] args) {
		
		Test05 test = new Test05();
		try {
		test.charge(30);
		test.charge(20);
		test.charge(10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
