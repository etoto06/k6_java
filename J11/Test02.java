package J11;

public class Test02 {

	public static void main(String[] args) {
		test1();
		System.out.println("GOOD");
		test2();
	}

	private static void test1() {
		try {
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
		} catch (Exception e) {
			System.out.println("오류발생");
			return;
		} finally {
			System.out.println("ok");
		}
		System.out.println("4");
	}

	private static void test2() {
		try {
			System.out.println("1");
			String s = null;
			s.length();
			System.out.println("2");
			System.out.println("3");
		} catch (Exception e) {
			System.out.println("오류발생");
			return;
		} finally {
			System.out.println("ok");
		}
		System.out.println("4");
	}
}
