package J14;

import java.util.Arrays;
import java.util.EmptyStackException;

interface StringFunc2{
	String[] modify(String s) throws EmptyStackException;
}

class EmptyStringException extends Exception {
	EmptyStringException(){
		super("빈 문자열");
	}
}
public class Test08 {
	
	public static void main(String[] args)  throws EmptyStackException{
		
		String str = " korea, Austealia, China,Germany , Spain, turkey";
		
		StringFunc2 sf = (s) -> {
			if(s.length() == 0)
				throw new EmptyStackException();
			return s.split(",");
		};
		
		String result[] = sf.modify(str);
		System.out.println(Arrays.toString(result));
		
		String str2 ="s";
		String result2[] = sf.modify(str2);
		System.out.println(Arrays.toString(result2));
	}

}



