
package com.ruby.java.ch09;

import java.util.Arrays;

public class Test12 {
	static void showData(String[]arr) {
		System.out.println();
		for (String st: arr)
			System.out.print(st + " -> ");
	}
	static void sortData(String[]arr, int[]arrInt) {
		for (int i = 0; i< arr.length;i++)
		{
			arrInt[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(arrInt);//참조변수 arrInt[] 변경이 되면 MAIN()에서도 변경된값을 접근 사용한다
	}
	static void showNumber(int[]arr) {
		System.out.println();
		for (int n: arr)
			System.out.print(n + " -> ");
	}
	public static void main(String[] args) {
		// string 정렬의 문제 
		//메인함수에는 포문 화일문 등등 안쓰기 되도록이면 
		String arr[] = {"12", "291", "134", "25"};
		showData(arr);
		Arrays.sort(arr);
		showData(arr);
		
		int n1 = 10;
		Integer obj1 = n1; // Integer.valueOf(n1)
		//obj1.* - methods를 사용하기 위해
		
		Integer obj2 = Integer.parseInt("20");// "9", "12" 정렬시에는 12,9가 온다 이때 필요
		int n2 = obj2; // obj2.intValue()
		//obj2.hashCode();
		
		Integer obj3 = 30; // new Integer(30)

		int n3 = obj3 + 40;

		System.out.println("\n" + n1 + " : " + obj1);
		System.out.println(obj2 + " : " + n2);
		System.out.println(n3);
		//정수로 배열로 변환후 정렬 
		int []arrInt = new int[arr.length];
		sortData(arr, arrInt);
		showNumber(arrInt);

	}
}