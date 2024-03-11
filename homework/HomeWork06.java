/* 클래스 메소드 구현 실습 목적*/
package homework;

import NewHomework1.Matrix;

class Matrix {
	int rows;
	int cols;
	int[] data;
// 012  012345
// 345
	public Matrix(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		data = new int[rows * cols];
	}

	void getData() {
			
	for (int i = 0; i < data.length; i++) {
		data[i]= (int) (Math.random() * 10);	// 난수로 입력
		}
	}

	

	Matrix addMatrix(Matrix b) {
		
		for( int i=0 ; i < b.rows; i++) { 	
			for(int j=0 ; j< b.cols; j++) {
				
			}
		}
		 
		Matrix m = new Matrix(this.rows, this.cols);
		return m;
	}

	Matrix multiplyMatrix(Matrix b) {
		Matrix m = new Matrix(this.rows, b.cols);
		return m;
		
	}

	Matrix transposeMatrix() {
		Matrix m = new Matrix(this.cols, this.rows);
		return m;
	}

	void showMatrix(String str) {
        System.out.println(str);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int X = i * cols + j;
                System.out.print(data[X] + " ");
            }
            System.out.println();
        }
    }    // 2차원 배열 모양으로 출력하는 코드 작성
}

public class HomeWork06 {

	public static void main(String[] args) {
		/*
		 * 난수 생성으로 초기화 A[3][4] = B[3][4] + C[3][4];
		 *  D[3][5] = B[3][4] * E[4][5];
		 *  F[4][3] = B[3][4]의 전치 행렬
		 */

	

		Matrix B = new Matrix(3, 4);
		Matrix C = new Matrix(3, 4);
		Matrix A, D, F;
		Matrix E = new Matrix(4, 5);

		System.out.println("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
		B.getData();
		C.getData();
		E.getData();

		A = B.addMatrix(C);
		B.showMatrix("B[3][4]");
		C.showMatrix("C[3][4]");
		A.showMatrix("A[3][4]");

		System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
		D = B.multiplyMatrix(E);
		B.showMatrix("B[3][4]");
		E.showMatrix("E[4][5]");
		D.showMatrix("D[3][5]");

		System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬d");
		F = B.transposeMatrix();
		B.showMatrix("B[3][4]");
		F.showMatrix("F[4][3]");
	}
}



