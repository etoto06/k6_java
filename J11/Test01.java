package J11;

public class Test01 {
	public static void main(String[] args) {
		test1();
		System.out.println("GOOD");
		test2();
	}
	
	private static void test1() {
		System.out.println("Tesdet1 start");
		test2();
		System.out.println("Test1 end");
	}
	
	private static void test2() {
		System.out.println("Test2 start");
		try {
			//int temp = 10/0; // 산술오류 발생시키는법
			
			String s= new String ("java");
			int len = s.length();
			s=null;
			//s.length();
			
			
			int arr[] = new int[3];
			arr[3] = 30;
			System.out.println("ok");
			
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1.getMessage());
		}catch(NullPointerException e2) {
			e2.printStackTrace();
		}catch(Exception e) { // switch 문에서 default처험  처리할게 없으면 익셉션으로 온다. 모든 예외의 최상위 
			System.out.println("오류발생 : " +e);
		}
		System.out.println("good");

	}
}
