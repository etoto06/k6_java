package com.ruby.java.cha08.enu;
/*
 * enum 클래스에 대하여 아래 코드를 학습하는 것이 중요하다
 * 자료구조 코딩을 위해 사전 학습으로 꼭 필요
 * enum 클래스의 생성자는 언제 호출되는가? 이해가 필요 
 */
import java.util.Scanner;

//자료구조시에 사용
enum Mandarin {
	금귤(600), 한라봉(500), 레드향(300), 천혜향(400), 황금향(800);

	private int price;
	//enum의 생성자: enum 상수마다 생성자를 호출하여 초기화한다 - enum 객체가 처음 만들어질 때 호출된다 필수
	//enum은 새로운 객체를 나오는게 아니라 금귤부터 황금향까지 5개를 넘버링하는게 끝
	Mandarin(int p) {
		price = p;
		System.out.println("enum 생성자 실행:: price = " + price);
	}

	int getPrice() {
		return price;
	}

	static Mandarin MandarinAt (int idx) {  //
		for (Mandarin m : Mandarin.values())
			if (m.ordinal() == idx)
				return m;
		return null;
	}
}


public class EnumTest02 {
	static Scanner stdIn = new Scanner(System.in);
	static Mandarin selectMenu() {   //여기부터
		int key;
		do {
		for (Mandarin m : Mandarin.values()) {//Mandarin m[] = Mandarin.values();와 의미가 같다 
			System.out.print(m.ordinal()+ "."); //
			System.out.println(" " + m + "(" + m.getPrice()+ ")");
		}
		System.out.println("선택: ");
		key = stdIn.nextInt();
		} while(key < Mandarin.금귤.ordinal() || key > Mandarin.황금향.ordinal());
		
		return Mandarin.MandarinAt(key);
	} //여기까지 중요하게 씀   37~49번째 줄 

	public static void main(String[] args) {
		Mandarin m;//생성자를 호출하지 않는다
		//Mandarin m2 = new Mandarin(100);//생성자를 호출할 수 없다 - 주의점 
		//*String st - 참조변수(그냥 선언일뿐 아무것도안함)
		//String st = new String();
		Mandarin m4[] = Mandarin.values();//m4 참조변수인데 배열을 준다. //Mandarin의 생성자를 호출하고 각 값을 생성자 함수에 전달한다.
		//values()는 static 함수로 열거된 모든 원소를 배열로 리턴
		//values()는 하나씩 읽는다 
		
		
		Mandarin m5 = Mandarin.황금향;
		
		//자바의 enum의 특이점
		//하나의 값만 넣었는데도 
		
		//for (Mandarin mnd: m4) {
			System.out.println("price = " +m5.getPrice());
		//}
		
		Mandarin ma = Mandarin.한라봉;//enum 클래스 생성자가 호출된다 
		System.out.println("enum 객체 생성전");
		System.out.println("황금향과 비교: "+ ma.compareTo(Mandarin.레드향)); //컴페어 투 도 이넘클래스에있다 
		Mandarin m2	= Mandarin.금귤;
		Mandarin ma2 = Mandarin.valueOf("레드향");
		System.out.println(ma2);

		Mandarin list[] = Mandarin.values();
		System.out.println("== 귤의 종류 ==");
		for (Mandarin m3 : list)
			System.out.println(m3 + ":" + m3.getPrice());
			
			//*/
		Mandarin mSelected = selectMenu();
		System.out.println(mSelected + ":selectedMenu:" + mSelected.getPrice());
	}
}