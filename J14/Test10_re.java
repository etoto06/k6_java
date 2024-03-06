package J14;
//람다식에 기존에 만들어진 메소드도 사용을 할 수 있다는것 
interface StringFunc{
	String modify(String s);
}

public class Test10_re {
	
	String func(String s) { //static 제어자 삭제 
		String result = "";
		char c;
		for( int i = 0 ; i < s.length(); i++) {
			c = s.charAt(i);
			if (c == ',')
				result += " ";
			else
				result += c;
		}
		return result;
}
	
	public static void main(String[] args) {
		
		Test10_re obj = new Test10_re();
		StringFunc sf = obj::func;
		
		String str = "korea,Australia,china,Germany";
		String result = sf.modify(str);
		System.out.println(result);
		
	}
}
