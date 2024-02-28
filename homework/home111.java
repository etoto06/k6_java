package homework;

import java.util.Random;

public class home111 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[][] a = new int[3][4];
		int[][] b = new int[4][3];

		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j] = rand.nextInt(10);
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = rand.nextInt(10);
			}
		}

		int[][] c = new int[3][3];

		// 행렬 곱셈 수행
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 4; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		// 결과 행렬 c 출력
		System.out.println("행렬 곱셈 결과:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}