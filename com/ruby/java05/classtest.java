package com.ruby.java05;

public class classtest {
	public static void main(String[] args) {
		
		System.out.println("1");
		System.out.println("2");
		
		String num = takeoff(6,7); //takeoff 라는 
		System.out.println(num);
		
		System.out.println("3");
		System.out.println("4");
	}
	
	//int , String,long , boolean, char 로도 해보기 
	//Main main = new main();
	
	static String takeoff(int num1, int num2) {
		System.out.println("takeoff1");
		System.out.println("takeoff2");
		System.out.println("takeoff3");
		
		return num1 + " ===> " + num2;
	}
}



/*
package com.ruby.java05;

public class classtest {
    public static void main(String[] args) {
        
        System.out.println("1");
        System.out.println("2");
        
        boolean result = takeoff();
        System.out.println(result);
        
        System.out.println("3");
        System.out.println("4");
    }
    
    static boolean takeoff() {
        System.out.println("takeoff1");
        System.out.println("takeoff2");
        System.out.println("takeoff3");
        
        return true;
    }
}
*/
