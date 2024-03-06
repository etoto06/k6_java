package homework;

import java.util.Scanner;

public class GcdLcm {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("두개의 정수를 입력해주세요 (띄워쓰기로 구분)");
		int max = scan.nextInt();
		int min = scan.nextInt();
		
		int change=0;
		
		if (max < min ) {  //큰수와 작은수를 구분하는식
			change = min;
			min = max;
			max = change;
		}
		
		int rem = max%min;
		
		if (rem == 0) {
			System.out.println("최대공약수:"+min);
			System.out.println("최소공배수:"+((max*min)/min));
		}
		else {
			max = min;
			min = rem;
			max = min;
			min = rem;
			System.out.println("최대공약수:"+min);
			System.out.println("최소공배수:"+((max*min)/min));
		}
	}
}
