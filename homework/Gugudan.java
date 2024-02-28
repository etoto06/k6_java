package homework;

public class Gugudan {

	public void print(int i) {
		System.out.println(i + "단");
		
	// 1단출력시작
		for( int j=1; j<10;j++) {
			if ( j == 4) System.out.println("\n");
			if ( j == 7) System.out.println("\n");	
			System.out.print(i+"*"+j+"=");
			System.out.print(i*j + " ");
		}
		
	//	2*1=2 처럼
		
//		for (int j =1; j<10 ; j++) {
//			for(int k=1;k<10 ;k++)
//				System.out.println(j*k);
//		}
		
	
		
		
	//1단 끝
	}
}
