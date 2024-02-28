package homework;

import java.util.Scanner;

public class gugudan2 {

	public void printColumn(int col) {

	}

	public static void main(String[] args) {
		
		gugudan2Test ggd = new gugudan2Test();
		Scanner sc = new Scanner(System.in);
		System.out.println("dan? :");
		int dan = sc.nextInt();
		
		for(int k=1;k<10;k++) {
		 if(k == dan+1) {
				System.out.println("");
			}
		 else if (k == dan+4){
			 System.out.println("");
		 }
		ggd.print(k);
		//System.out.println("-".repeat(15));
		} 
		System.out.print("end");
	}

}
