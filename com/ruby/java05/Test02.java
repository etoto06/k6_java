package com.ruby.java05;

public class Test02 {
	static void test(String name, int... v) {
		System.out.print(name + " : ");
		for ( int x : v)
			System.out.print(x + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		test("아아아",98,85,88);	
		test("바바바",90,95,88);
		test("사사사",78,45,68);
		
		
	}

}
