package homework;

import java.util.Arrays;
import java.util.Random;

public class Depositlnterest {
	public static void main(String[] args) {
		Random random = new Random();

		int[] numbers = new int[7];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(46);
		}

		System.out.println("정렬되기전 7가지 수");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println("\n");
		
		System.out.println("정렬된 후 7가지 수");
		Arrays.sort(numbers);
		for (int i=0 ; i< numbers.length; i++ ) {
			System.out.print(numbers[i]+" ");
		}
	}
}