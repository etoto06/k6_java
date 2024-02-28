package J07;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		System.out.println("Person 생성자");
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
		}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return name + ":" +age;
	}
}

/*프라이빗은 자기 자식만 읽음 다른클래스불가 , 굳이 내 자식클래스도 읽게 하고싶다ㅕㄴ 디폴트,
다른패키지도 읽게하고싶다면 프로텍티드 , 다 읽게하고싶으면 퍼블릭*/