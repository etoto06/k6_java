/*package J08;

import J07.Employee;

public class HRSTest {

	public static void calcTax(Employee e) {
		if( e instanceof Salesman) {
		System.out.println("Salesman");//연산자 우선순위떄매 에러 .이 먼저임
		}else if(e instanceof Manager) {
			System.out.println("manager입니다");}
		else if (e instanceof Consultant) {
			System.out.println("Consultant 입니다");}
		else {System.out.println("Employee입니다");
		}
	}
	
	public static void main(String[] args) {
		Salesman s = new salesman();
		Manager m = new Manager();
		Consultant c =new Consultant();
		
		calcTax(s);
		calcTax(m);
		calcTax(c);
		
	}

}
*/