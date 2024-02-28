package J13;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
	String str() default "guest";
	int val() default 1004;
}

public class J648p {

	@MyAnno 
public static void test() {
		J648p obj = new J648p();
		try {
			Class<?> c = obj.getClass();
			Method m = c.getMethod("test");
			MyAnno anno = m.getAnnotation(MyAnno.class);
			System.out.println(anno.str()+":"+anno.val());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
