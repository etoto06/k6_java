package J14;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.function.Consumer;

public class Test16 {

	public static void main(String[] args) {
		Consumer<Date> date = (d) -> {
			String s = new SimpleDateFormat("YY-MM-dd").format(d);
			System.out.println(s);
		};
		
		date.accept(new Date());// 현재 시간을 나타내는 java.util.Date 객체를 생성
	}
}

/*
package J14;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.function.Consumer;

public class Test16 {
	public static void main(String[] args) {
		Consumer<Date> date = (d) -> {
			String s = new SimpleDateFormat("yy-MM-dd").format(d);
			System.out.println(s);
		};
		
		date.accept(new Date()); 
	}
}*/
