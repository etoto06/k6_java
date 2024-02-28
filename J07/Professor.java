package J07;

public class Professor extends Person {
	private String subject;

	public Professor() {
		super();//kx
		System.out.println("Professor 생성자");
		// TODO Auto-generated constructor stub
	}	                                                                                                           
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void setDept(String string) {
		// TODO Auto-generated method stub
		
	}
}
