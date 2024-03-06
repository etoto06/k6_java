package homework;

import java.util.Scanner;

public class Ja_mo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		
		for(int i=0; i< arr.length ; i++) {
		
			int ja=0;
			int mo =0;
			if(arr[i] == 'a'|| arr[i] == 'e'||arr[i] =='i'||arr[i] =='o'||arr[i] =='u') {	
				ja++;
			}   
			
			else {
				mo++;
			}
			System.out.println("자음"+ja+"개");
			System.out.println("모음"+mo+"개");
		}
	}
}
