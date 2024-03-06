package J14;
//람다식에 기존에 만들어진 메소드도 사용을 할 수 있다는것 
interface StringFunc{
	String modify(String s);
}

public class Test10 {
	
	static String func(String s) {
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
		
		StringFunc sf = Test10::func; // 같은 타입의 파라메타나 리턴타입을 가져야 할 수 있다 
		
		String str = "korea,Australia,china,Germany";
		String result = sf.modify(str);
		System.out.println(result);
		
		String str2 = "한국,서울,북경,뉴욕";
		result = sf.modify(str2);
		System.out.println(result);
	}
}
