package J06;

public class Armor {
	
	private String name;
	private int height;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public static void main(String[] args) {
		{	int a = 10;
	}
		{
			int a = 5; //괄호 나오면 a선언한것 사라짐 
			//222쪽 중요************************
			System.out.println(a);
		}
	}
}
