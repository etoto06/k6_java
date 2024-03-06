package homework;

import java.util.Scanner;

public class primeNumber3 {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("자리수를 입력하세요 :");
//		int digit = scan.nextInt();
//		
//		int number1 = (int) Math.pow(10, digit);
//		int number2 = (int) Math.pow(10, digit-1);
//		
//		for (int i = number2; i < number1; i++) {
//			boolean nb3 = true;
//			for (int j = 2; j < i; j++) {   //2 ~ i-1 의 숫자로 i를 나눠서 나누어 떨어지는지 확인하는식
//				if (i % j == 0) {     
//					nb3 = false;
//					break;
//				}
//			}
//			
//			if (nb3) {
//				System.out.println(i + "는 소수입니다.");
//				System.out.println(number3);
//				
//			} else {
//				System.out.println(i + "는 소수가 아닙니다.");
//			}
//		}
//	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("자리수를 입력하세요 :");
		int digit = scan.nextInt(); 
		// digit=2면 number1=10, number=100
		int number1 = (int) Math.pow(10, digit-1);
		int number2 = (int) Math.pow(10, digit);
		
		for (int i = number1; i <number2 ; i++) {
			String str = String.valueOf(i);
			boolean prime = true;
			
			for (int j=0; j < digit; j++) {
				int number3 = Integer.parseInt(str.substring(0,j+1));
				if (!primeNumber(number3)) {
					  prime = false;
	                    break;
	                }
	            }
	            if (prime) {
	                System.out.println(i);
	            }
	        }
	    }
								
	public static boolean primeNumber(int number) {
		if (number <2) {
			return false;
		}
		
		for (int i=2; i < Math.sqrt(number); i++ ) {
			if( number % i ==0 ) {
				return false;
			}
		}
		return true;
	}
			
} 
		


//1000 ~ 9999 
//
//예) 9973
//
//99 997 9973 