package J13;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME) //오버라이드는 부모로부터 상속받는 메소드면 거의 무조건써주는게 좋다 
@interface check {
	String name();
	int val();
}


public class J643p {
	
	@check(name="first", val = 123) //런타임까지 이 어노테이션이 유지되어야 한다 
	public static void test() {
		J643p obj = new J643p();
		try {
			Class<?> c = obj.getClass();
			Method m = c.getMethod("test");
			
			check check = m.getAnnotation(check.class);
			System.out.println(check.name() + " : " + check.val());
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		test();
	}

}
