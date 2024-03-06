package Chap2_기본자료구조;

/*
 * 3번째 실습
 * 교재 83 - 배열 처리
 */

import java.util.Arrays;
import java.util.Random;
public class train_실습2_6다차원배열 {

	public static void main(String[] args) {
		int [][]A = new int[2][3];
		int [][]B = new int[3][4];
		int [][]C = new int[2][4];

		inputData(A);inputData(B);
		int [][]D = A.clone();//교재83 - 배열 복제
		System.out.println("A[2][3] = ");
		showData(A);
		System.out.println("D[2][3] = ");
		showData(D);
		System.out.println();
		System.out.println("B[3][4] = ");
		showData(B);
		int [][]E = addMatrix(A,D);
		System.out.println("E[2][3] = ");
		showData(E);
		C = multiplyMatrix(A,B);
		System.out.println("C[2][4] = ");
		showData(C);

		int [][]F = transposeMatrix(A);
		System.out.println("F[3][2] = ");
		showData(F);
		boolean result = equals(A, D);
		System.out.println(" equals(A,D) = " + result);
		
		System.out.println("F = " + Arrays.deepToString(F));//2차원 배열 처리 
	}
	static void inputData(int [][]data) {
		Random rand = new Random();

	}
	static void showData(int[][]items) {
		for (int[] item : items) {

		}
		System.out.println();
	}
	static boolean equals(int[][]a, int[][]b) {
		if (a.length != b.length || a[0].length != b[0].length) 
			return false;

		return true;

	}
	static int[][] addMatrix(int [][]X, int[][]Y) {
		int rows = X.length;
		int cols = X[0].length;
		int [][]Z = new int[rows][cols];
		

		return Z;
	}
	static int[][] multiplyMatrix(int [][]X, int[][]Y) {
		int rows = X.length;
		int cols = Y[0].length;
		int [][]Z = new int[rows][cols];
		
		return Z;
		
	}
	static int[][] transposeMatrix(int [][]X) {
		int rows = X.length;
		int cols = X[0].length;
		int [][]Z = new int[cols][rows];

		return Z;
		
	}
}

/*
 * findMax() 함수: 이 함수는 배열에서 최댓값을 찾는 역할을 합니다. items 배열을 순회하면서
 *  가장 큰 값을 찾고, 그 값을 반환해야 합니다. 예를 들어, max 변수를 초기화하고 items 
 *  배열의 요소들과 비교하여 더 큰 값을 max에 저장할 수 있습니다.
 *  
findValue() 함수: 이 함수는 배열에서 특정 값이 존재하는지 여부를 확인하는 역할을 합니다.
 items 배열을 순회하면서 주어진 value와 동일한 값을 찾으면 true를 반환하고, 
 찾지 못하면 false를 반환해야 합니다. 예를 들어, for 루프를 사용하여 
items 배열의 요소들과 value를 비교하고, 일치하는 값이 있을 경우 true를 반환할 수 있습니다.
 */

