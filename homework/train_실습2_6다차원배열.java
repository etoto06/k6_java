package homework;

/*
 * 3번째 실습
 * 교재 83 - 배열 처리
 */

import java.util.Arrays;
import java.util.Random;

public class train_실습2_6다차원배열 {

	public static void main(String[] args) {
		int[][] A = new int[2][3];
		int[][] B = new int[3][4];
		int[][] C = new int[2][4];

		inputData(A);
		inputData(B);
		int[][] D = A.clone();// 교재83 - 배열 복제
		System.out.println("A[2][3] = ");
		showData(A);
		System.out.println("D[2][3] = ");
		showData(D);
		System.out.println();
		System.out.println("B[3][4] = ");
		showData(B);
		int[][] E = addMatrix(A, D);
		System.out.println("E[2][3] = ");
		showData(E);
		C = multiplyMatrix(A, B);
		System.out.println("C[2][4] = ");
		showData(C);

		int[][] F = transposeMatrix(A);
		System.out.println("F[3][2] = ");
		showData(F);
		boolean result = equals(A, D);
		System.out.println(" equals(A,D) = " + result);

		System.out.println("F = " + Arrays.deepToString(F));// 2차원 배열 처리
	}

	static void inputData(int[][] data) {
		Random rand = new Random();
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				data[i][j] = rand.nextInt(50);
			}
		}
	}

	static void showData(int[][] items) { // 이차원 배열의 내용 출력
//		for (int[] item : items) {}
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length; j++) {
				System.out.println(items[i][j]);
			}
		}
		System.out.println();
	}

	static boolean equals(int[][] a, int[][] b) {
		if (a.length != b.length || a[0].length != b[0].length)
			return false;
//두 2차원 배열이 같은지 검사, 크기비교는 이미 구현됨, 요소비교 해야함
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] == b[i][j]) {
					return true;
				} else {
					return false;
				}
			}
		}
		return true;
	}

	static int[][] addMatrix(int[][] X, int[][] Y) {// 두 차원 x y 더하기
		int rows = X.length;
		int cols = X[0].length;
		int[][] Z = new int[rows][cols];

		for (int i = 0; i < X.length; i++) {
			for (int j = 0; j < X[0].length; j++) {
				Z[i][j] = X[i][j] + Y[i][j];
			}
		}
		return Z;
	}

	static int[][] multiplyMatrix(int[][] X, int[][] Y) {
		int rows = X.length;
		int cols = Y[0].length;
		int[][] Z = new int[rows][cols];

		for (int i = 0; i < X.length; i++) {
			for (int j = 0; j < X[0].length; j++) {
				Z[i][j] = X[i][j] * Y[i][j];
			}
		}
		return Z;

	}

	static int[][] transposeMatrix(int[][] X) { // 이차원 배열 x의 전치행렬 구하기
		int rows = X.length;
		int cols = X[0].length;
		int[][] Z = new int[cols][rows];

		for (int i = 0; i < X.length; i++) {
			for (int j = 0; j < X[0].length; j++) {
				Z[j][i] = X[i][j];
			}
		}
		return Z;

	}
}
