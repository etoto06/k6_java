package eduu;
import java.util.Random;
public class Test38 {

	public static void main(String[] args) {
		int[][] arr =  new int[5][5];
		Random rand = new Random();
		for (int i=0; i<arr.length ; i++)
			for(int j =0 ; j < arr[0].length ; j++)
				arr[i][j] = rand.nextInt(100);
		
		for (int i=0; i<arr.length ; i++) {
			for(int j =0 ; j < arr[0].length ; j++) {
				if (i==j)
				System.out.print(arr[i][j]+" ");
					System.out.print("\t");
			}
		}
			
		
		/*
		int arr[][] = new int [3][4];
		arr[0][1] = 1;
		
		int arr2[][] = {{1,2},{3,4,9,8},{5,6}};//ragged array -코딩 주의 필요
		
		System.out.println("행수:" +arr.length); //행의 길이
		System.out.println("열의 수:" + arr2[0].length); //열의 길이
		*/
	}

}
