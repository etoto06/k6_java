package J06;

public class Member {
	private String name;
	private int age;

	public Member() {
		this.name = "guest";
		this.age = 0;
		//System.out.println("Member 생성사 실행");
	}
	
	public Member(String name) {
		this.name = "name";
		this.age = 0;
		/*System.out.println("Member(String) 생성사 실행");
		System.out.println("name");
		System.out.println("Member(String) 생성사 실행");*/
		
	}
	
	public Member(String name, int age) {
		this.name = "name";
		this.age = age;
		/*System.out.println("Member(String,int )생성자 실행 :");
		System.out.println(name + " : " + age);*/
		
	}
	
	public static void main(String[] args) {
		//System.out.println("main 메서드 실행");
		new Member();
		new Member("amy");
		new Member("amy",23);
	}
	
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
}
