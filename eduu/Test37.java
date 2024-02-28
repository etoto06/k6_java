package eduu;

import java.util.Random;

public class Test37 {

	public static void main(String[] args) {
		//난수 생성하기
		Random rnd = new Random();
		int [] score = new int[20];
		for ( int i = 0; i <score.length; i++) {
			score[i] = rnd.nextInt(20);
		}
		int max=0; int min=99; int sum=0; double avg=0.0;
		
		for(int i =0 ; i < score.length ; i++ ) {
			if ( i % 4 == 0)
				System.out.print("\n ");
			if ( score[i] < 10 )
				System.out.print(" ");
			
			System.out.print(score[i] + " ");
		}
		
		for(int i =0 ; i < score.length ; i++ ) {
			sum += score[i];
			if (max < score[i]) {
				max= score[i];
			}
			if ( min > score[i]) {
				min = score[i];
			}
		}
		avg = sum/ score.length;
			System.out.println("\n");
			System.out.println(max);
			System.out.println(min);
			System.out.println(avg);
			System.out.println(sum);
	}
	
}

