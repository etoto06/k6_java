package J05;

import java.util.Random;

public class ddddd {
	public static void main(String[] args) {
		Random rand = new Random();

		int B[][] = new int[3][4];
		int E[][] = new int[4][5];
		int D[][] = new int[3][5];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				B[i][j] = rand.nextInt(10);
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				E[i][j] = rand.nextInt(10);
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < 4; k++) {
					D[i][j] += B[i][k] * E[k][j];
				}
			}

			for (int a = 0; a < 3; a++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(D[a][j] + " ");
				}
				System.out.println();
			}
		}

	}
}
