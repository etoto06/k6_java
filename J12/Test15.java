package J12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test15 {

	public static void main(String[] args) {

		UserBean user = new UserBean("purum", "오정임", "010-123-4567", "서울");

		try (ObjectOutputStream out =
				new ObjectOutputStream(new FileOutputStream("uset.txt"))) {
			out.writeObject(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
