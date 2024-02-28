package homework;

public class gugudan2Test {

	
	public static void main(String[] args) {
		gugudan2 ggd = new gugudan2();
		ggd.printColumn(3);
	}
	
	public void print(int i) {
		System.out.println( "" );//i + "단");
		
	// 1단출력시작
		for( int j=2; j<10;j++) {
			System.out.print(i+"*"+j+"=");
			if( i*j < 10) {
			System.out.print(i*j + "  " + "|");}
			if(i*j >= 10 ) {
				System.out.print(i*j + " " + "|");}
		}


		// 1*1 2*1 3*1 4*1 5*1
		// 1*2 2*2 3*2 4*2 5*2
		// ...
		
		
		
	//	2*1=2 처럼
		
//		for (int j =1; j<10 ; j++) {
//			for(int k=1;k<10 ;k++)
//				System.out.println(j*k);
//		}
		
	
		
		
	//1단 끝
	}
}