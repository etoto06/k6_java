package eduu;

import java.util.Scanner;

public class homework2 {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 5 };
		int total = 0, i = 0, y = 0;
		y = arr[i];
		Scanner sc = new Scanner(System.in);

		System.out.println("[문제 : 경우의 수]");
		do {
			System.out.print("1~100 사이의 정수를 입력하세요: ");
			y = sc.nextInt();
			if (y < 1 || y > 100) {
				System.out.println("숫자는 1~100 사이의 숫자만 입력가능합니다.");
				continue;
			}
			
			for (int a = 1; a <= 10; a++) {
				for (int b = 1; b <= 10; b++) {
					for (int c = 1; c <= 10; c++) {
						total = (a * 5) + (b * 3) + (c * 2);
						if (total == y) {
							System.out.println(
									"5g:" + a + "개, " + "3g:" + b + "개, " + "2g:" + c + "개 " + ",total" + total);
						}
					}
				}
			}
		} while (y > 0);
	}
}
