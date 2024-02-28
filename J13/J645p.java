package J13;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.AnnotatedArrayType;
import java.text.Annotation;

@Retention(RetentionPolicy.RUNTIME)
@interface Mapping {
	String mode();
	int value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Comment {
	String msg();
}

@Mapping(mode = "class", value = 100)
@Comment(msg = "Annotation2 클래스")
public class J645p {
	
	@Mapping(mode = "method", value =200)
	@Comment(msg = "test() 메서드")
	public static void test() {
		J645p obj = new J645p();
	
		try {
			Class<?>c=obj.getClass();
			Annotation annoList[] = c.getAnnotations();
			System.out.println("클래스의 annotation목록");
			for(Aonntation item : annoList)
				System.err.println(item );
			
			Method m = c.getMethod("test");
			annolist= m.getSnnotations();
			System.out.println();
			System.out.println("test()메서드의 어노테이션 목록");
			for(Annotation item : annotation);
			System.out.println(iteam;);
	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		test();
	}
}


