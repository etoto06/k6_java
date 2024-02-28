package J05;

public class TestChap5 {

    static void showMatrix(int[][] X) {
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                System.out.print(X[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] addMatrix(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    static int[][] multiplyMatrix(int[][] A, int[][] B) {
        int[][] result = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    static int[][] transposeMatrix(int[][] A) {
        int[][] result = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                result[j][i] = A[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] A, B, C, D, E, F;

        // 난수 생성으로 초기화
        B = new int[3][4];
        C = new int[3][4];
        E = new int[4][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                B[i][j] = (int) (Math.random() * 10);
                C[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                E[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
        A = addMatrix(B, C);
        showMatrix(B);
        showMatrix(C);
        showMatrix(A);

        System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
        D = multiplyMatrix(B, E);
        showMatrix(B);
        showMatrix(E);
        showMatrix(D);

        System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬");
        F = transposeMatrix(B);
        showMatrix(B);
        showMatrix(F);
    }
}
