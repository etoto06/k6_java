package homework;

import java.util.Random;

public class Hw1 {

	public static void main(String[] args) {
        Random rand = new Random();
        int[][] a = new int[3][4];
        int[][] b = new int[4][3];

        // a 배열과 b 배열 초기화
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = rand.nextInt(100);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = rand.nextInt(100);
            }
        }

        // 행렬 곱셈을 위한 결과 행렬 c 초기화
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

/*
 * int al = a.length; int bl = b.length; a[3][4] = rnd.nextInt[3][4]; b[4][3] =
 * rnd.nextInt(20); new int[3][4]; new int[4][3];
 * 
 * 	int a [][] = {{1,2,3,4,},{5,6,7,8},{9,10,11,12}}; 
		
		int b [][] = {{1,2,3},{4,5,6,},{7,8,9},{10,11,12}};
	
 */