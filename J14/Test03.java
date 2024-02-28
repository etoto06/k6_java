package J14;

interface Verify {
	boolean check(int n); 
}

public class Test03 {
	public static void main (String[] args) {
		Verify isEven = (n) -> (n%2) == 0;
		System.out.println(isEven.check(10));
		
		Verify isPositive = (n) ->n >=0; //n이 0보다 크거나 같으면 
		System.out.println(isPositive.check(-5));
	}
}
