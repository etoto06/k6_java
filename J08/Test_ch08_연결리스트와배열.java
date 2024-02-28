package J08;

class Node3 {
	int data; // 노드가 저장하는 정수 데이터를 나타내는 변수
	Node3 link; // 다음 노드를 가리키는 링크(포인터) 변수

	public Node3(int data) {
		this.data = data;
		link = null;
	}
}

class LinkedList3 {
	Node3 first; // int first 대신에 Node3 first

	void append(int data) {
		Node3 p = first, q = null;
		// 추가 코딩
		Node3 newNode = new Node3(data);
		if (p == null) {
			first = newNode;
			return;
		} else {
			while (p != null) {
				q = p;
				p = p.link;
			}
			q.link = newNode;
		}

	}

	public LinkedList3() {
		first = null; //
	}

	// 연결 리스트의 모든 노드를 순회하며 각 노드의 데이터를 출력
	// p를 사용하여 각 노드를 순회하고, p.data를 출력하여 각 노드의 데이터를 확인
	void showList() {
		System.out.println();
		Node3 p = first;
		while (p != null) {
			System.out.println(p.data + "");
			p = p.link;
		}
		System.out.println();
	}

	// 연결 리스트에 새 노드를 삽입
	// 새 노드를 적절한 위치에 삽입,만약 q가 null이면 리스트의 맨 앞에 삽입,아니라면 q와 p 사이에 삽입

	void insert(int data) {
		Node3 newNode = new Node3(data);
		Node3 p = first, q = null;
		while (p != null && p.data < data) {
			q = p;
			p = p.link;
		}
		if (q == null) {
			newNode.link = p;
			first = newNode;
		} else {
			newNode.link = p;
			q.link = newNode;
		}
	}
}

//===========================================
public class Test_ch08_연결리스트와배열 {
	static int getList(int[] data) {
		int count = 0;
		int mid = data.length / 2; // 배열의 절반에만 데이터 할당
		for (int i = 0; i <= mid; i++) {
			data[i] = i * 5;
			count++; // 각 데이터는 인덱스에 5를 곱한값
		}
		return count;
	}

	static void showList(int[] data) {
		System.out.println();
		for (int i = 0; i < data.length; i++)
			System.out.print(" " + i + " ");
		System.out.println();
		for (int i = 0; i < data.length; i++) {
			if (data[i] < 10)
				System.out.print(" ");
			System.out.print(data[i] + " ");
		}
	}

	static int insertList(int[] data, int count, int x) {
		int indx = 0;
		while (indx < count) { // 3이 들어갈 자리를 찾는다
			if (x < data[indx]) {
				while (indx < count) {
					int temp = data[indx];
					data[indx] = x;
					x = data[++indx];
				}
				break;
			} else
				indx++;
		}

		count++;
		return count;
	}

	public static void main(String[] args) {
		int[] list = new int[10];
		int count = 0;
		System.out.println("배열로 리스트::");
		count = getList(list);
		showList(list);
		count = insertList(list, count, 3);
		showList(list);
		count = insertList(list, count, 7);
		showList(list);
		// ***************************
		LinkedList3 ll = new LinkedList3();
		// new 라는 함수가 메모리 heap에 할당된 주소를 반환한다
		// new라는 함수가 하는것 1. heap에 공간 할당 2.할당된 공단의 주소를 반환 , 그 주소를 ll한테 줌
		ll.append(5);
		ll.append(10);
		ll.append(15);
		ll.append(20);
		ll.append(25);
		ll.showList();
		ll.insert(3);
		ll.showList();
		ll.insert(7);
		ll.showList();
	}
}