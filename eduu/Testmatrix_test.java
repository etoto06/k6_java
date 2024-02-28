package eduu;

public class Testmatrix_test {
 
		    public static void main(String[] args) {
		        // 덧셈을 수행할 두 개의 행렬
		        int[][] matrix1 = { {1, 2}, {3, 4} };
		        int[][] matrix2 = { {5, 6}, {7, 8} };

		        // 행렬의 크기
		        int rows = matrix1.length;
		        int columns = matrix1[0].length;

		        // 덧셈 결과를 저장할 새로운 행렬
		        int[][] result = new int[rows][columns];

		        // 행렬의 덧셈 수행
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < columns; j++) {
		                result[i][j] = matrix1[i][j] + matrix2[i][j];
		            }
		        }

		        // 덧셈 결과 출력
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < columns; j++) {
		                System.out.print(result[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
		

	}


