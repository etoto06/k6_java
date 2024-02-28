package J10;
import java.util.LinkedList;


public class Main {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		// 요소 추가
		list.add("A");
		list.add("B");
		list.add("C");

		System.out.println(list); // 출력: [A, B, C]

		// 요소 제거
		list.remove(1);

		System.out.println(list); // 출력: [A, C]

		// 요소 접근
		String element = list.get(0);

		System.out.println(element); // 출력: A

		// 요소 변경
		list.set(0, "D");

		System.out.println(list); // 출력: [D, C]

		// 리스트 크기
		int size = list.size();

		System.out.println(size); // 출력: 2
	}
}
