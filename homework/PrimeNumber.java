package homework;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("자릿수를 입력하세요: ");
		int digit = scanner.nextInt();

		int number = (int) Math.pow(10, digit);
		int number2 = (int) Math.pow(10, digit - 1);

		System.out.println(digit + "자릿수:");
		System.out.println(number2 + "부터" + (number - 1) + " 에 속하는 소수는 ");

		for (int i = number2; i < number; i++) {
			boolean nb3 = true;
			for (int j = 2; j < i; j++) {   //2 ~ i-1 의 숫자로 i를 나눠서 나누어 떨어지는지 확인하는식
				if (i % j == 0) {     

					nb3 = false;
					break;
				}
			}
			if (nb3) {
				System.out.println(i + "는 소수입니다.");
			} else {
				System.out.println(i + "는 소수가 아닙니다.");
			}
		}
	}
}
/*
 * for (int i = number2; i < number; i++) { if (number % i == 0) { // number % i
 * == 0 이라고 하면 안됨 System.out.println(i + "소수"); // return; }
 * System.out.println(i + "소수가아님"); } } }
 * 
 * /
 */