package homework;

import java.util.Scanner;

public class year {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력해주세요 :");
		int year = sc.nextInt();
		
		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400==0) {
					System.out.println("윤년입니다");
				}
				System.out.println("평년입니다");
			}
			else {
				System.out.println("윤년입니다");
			}
		}
		else {
			System.out.println("평년입니다");
		}
	}
	
}
