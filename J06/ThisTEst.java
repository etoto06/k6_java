package J06;

public class ThisTEst {
	int i = 1;
	
	public void first() {
		int i = 2;
		int j = 3;
		this.i = i+j;
		
		second(4);
	}
	
	public void second(int i) {
		int j = 5;
		this.i = i +j;
	}
	
	public static void main(String[] args) {
		ThisTEst exam = new ThisTEst();
		exam.first();
	}

}
