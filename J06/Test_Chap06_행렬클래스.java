package J06;

import java.util.Random;

/*
 * 클래스 메소드 구현 실습 목적
 */
class Matrix {
	int rows;
	int cols;
	int[]data;
	public Matrix(int rows, int cols) {
		this.rows = rows; this.cols = cols;
		data = new int[rows * cols];
	}
	void getData() {
		Random random = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random() * 10); // 난수로 입력
		}
	}
	
	Matrix addMatrix(Matrix b) {
		Matrix m = new Matrix(this.rows, this.cols);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				m.data[i * cols + j] = this.data[i * cols + j] + b.data[i * cols + j]; 
				//예) m.data [1열 j행] = this.data[1열 j행]+ b.data[1열 j행] 반복
			}
		}
		return m;
	}
	//3 4   4 5 = 3 5
	Matrix multiplyMatrix(Matrix b) { // D[3][5] = B[3][4] * E[4][5];
		Matrix m = new Matrix(this.rows, b.cols);// 결과 행렬 m 생성 
		for (int i = 0; i < this.rows; i++) { // 행렬 A의 행 반복
			for (int j = 0; j < b.cols; j++) {// 행렬 B의 열 반복
				for(int l=0; l< this.cols ; l++) {// 내부 반복 (행렬 A의 열 또는 행렬 B의 행)
					m.data[i * m.cols + j] += this.data[i * this.cols + l] * b.data[l * b.cols + j]; 
					// 행렬 m (i, j)에 행렬 A(i, l) 원소와 행렬 B의 (l, j) 원소를 곱한 값을 더함
				}
			}		
		}
		return m;	
	}

	Matrix transposeMatrix() {
        Matrix m = new Matrix(this.cols, this.rows);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                m.data[j * m.cols + i] = this.data[i * this.cols + j]; // 행렬 전치 연산
            }
        }
        return m;
    }
	
	void showMatrix(String str) {
		System.out.println(str);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(data[i * cols + j] + " "); // 2차원 배열 모양으로 출력
			}
			System.out.println();
		}
		System.out.println();
	}
}
public class Test_Chap06_행렬클래스 {

	public static void main(String[] args) {
		/*
		 * 난수 생성으로 초기화
		 * A[3][4] = B[3][4] + C[3][4]; 
		 * D[3][5] = B[3][4] * E[4][5];
		 * F[4][3] = B[3][4]의 전치 행렬
		 */
		Matrix B = new Matrix(3,4);
		Matrix C = new Matrix(3,4);
		Matrix A, D, F;
		Matrix E = new Matrix(4,5);

		System.out.println("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
		B.getData();C.getData();E.getData();
		
		A = B.addMatrix(C);
		B.showMatrix("B[3][4]");C.showMatrix("C[3][4]");A.showMatrix("A[3][4]");
		
		System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
		D = B.multiplyMatrix(E);
		B.showMatrix("B[3][4]");E.showMatrix("E[4][5]");D.showMatrix("D[3][5]");
		
		System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬");
		F = B.transposeMatrix();
		B.showMatrix("B[3][4]"); 
		F.showMatrix("F[4][3]");

		
	}

}


