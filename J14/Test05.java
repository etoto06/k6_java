package J14;

interface NumberFunc {
	int func(int n);
}

public class Test05 {
	public static void main(String[] args) {
//		NumberFunc sum = (n) ->{
//			int result =0;
//			for(int i =0; i<= n; i++) {
//				result +=i;
//			}
//			return result;
//		};

		NumberFunc esum = (n) -> {
			int result = 0;
			if (n % 2 == 1) {
				for (int i = 0; i <= n; i++) {
					result = i;
				}
			}
			return 0;
		};
		NumberFunc osum = (n) -> {
			int result = 0;
			if (n % 2 == 0) {
				for (int i = 0; i <= n; i++) {
					result = i;
				}
			}
			return 0;
		};
		System.out.println("1부터 10까지 짝수합: " + esum.func(10));
		System.out.println("1부터 10까지 홀수합: " + osum.func(10));
		System.out.println("1부터 100까지의 짝수합: " + esum.func(100));
		System.out.println("1부터 100까지의 홀수합: " + osum.func(100));

	}
}