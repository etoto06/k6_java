package NewHomework1.chapA10;

import java.util.Scanner;
//체인법에 의한 해시
//--- 해시를 구성하는 노드 ---//

//예시) h(21)=21%10 = 1 , 29%13=3 , 35%13=9 , 

//충돌예시) 18%13=5 인데 5자리가 차있으면 충돌(collision) , h1(5)=5, h(18)=5												    1
//충돌을 해결하는법)5는 그대로있고 해시값이 같은 요소를 연결리스트로 관리 여기 linkedlist 만들어서 																	    2
//																											        ..
//chain hash 방법은 연결리스트 -> close addressing (addressing은 주소지정{키가 주어졌을때} h(18)이랑 h(31)은 homeadress=5로 둘이같은데 5->18->31 이런식으로 저장
//-----------------------------------------------------------------------------------------------------------------------------------------------

//open addressing 방법은 충돌시 다음칸,다음칸 계속 하나씩 넘어가서(rehashing) 빈칸을 찾음  / rehashing(계산식)으로 collision값을 저장할 위치계산
//rehashing 하는법은 하나 건너뛸때마다 h(18+1)=19%13=6 이런식으로 

//삭제를 할거면 삭제표시를 한다. 코드구현은 412p , 각 버켓이 만들어질때마다 버켓의 상태를 기록

//h(key)이 같으면 ,home bucket이 같다는 말이고 h(18)과h(31)은 collision

class Node {
	
	private int key; // 키값
	Node next; // 뒤쪽 포인터(뒤쪽 노드에 대한 참조)

	public Node(int key) {
		this.key = key; //노드 키값 초기화 
		this.next = null; 
	} 
	int getKey() {
		return key;
	}
	int getvalue() {
		// TODO Auto-generated method stub
		return 1;
	}
}

class SimpleChainHash {
	private int size; // 해시 테이블의 크기
	private Node[] table; // 해시 테이블 398p

	// 생성자
	public SimpleChainHash(int capacity){
	 try {
		 table = new Node[capacity]; //해시테이블 초기화
		 this.size = capacity; //해시테이블 크기 설정
		 } 
	 catch(OutOfMemoryError e) {
    		this.size =0; }
     }

	public int hashvalue(Object key) { //데이터의 키를  테이블의 인덱스로 변환하는 역활 
		return key.hashCode() %size; //해시함수로 테이블 인덱스로 변환 
		//예)18%13=5
	}

	// --- 키값이 key인 요소를 검색(데이터를 반환) ---//399p
	
	//검색과정 1.해시함수로 키값->해시값으로 , 2.해시값을 인덱스로 하는 버킷 선텍, 3.선택한 버킷의 리스트 첨부터선형검색
	public int search(int key) {
		int hash = hashvalue(key); 
		Node p = table[hash];
		
		while(p!=null){
			if (p.getKey()==key) {
				return p.getvalue();
			}
			p = p.next;
		}
		return -1;
	}

	// --- 키값이 key인 데이터를 data의 요소로 추가 ---//
	public int add(int key) {
		int hash = hashvalue(key);
		Node newNode = new Node(key); // 새로운 노드 생성
		
		if (table[hash] == null) {
			table[hash] = newNode; //버킷이 비어있을 경우 새노드를 추가
		} 
		else {
			Node p = table[hash];
			while (p.next != null) {
				if (p.getKey() == key) {
					return -1; // 실패
				}
				p = p.next;
			}
			if (p.getKey() == key) {
				return -1; //실패
			}
			p.next = newNode; // 링크드 리스트 끝에 새노드 추가
		}
		return 0; // 추가 성공을 의미하는 값 반환
	}

	
	// --- 키값이 key인 요소를 삭제 ---//
	public int delete(int key) {
		int hash = hashvalue(key);
		Node p = table[hash];	
		Node pp = null;
		
		while (p!=null) {
			if (p.getKey()==key) {
				if (pp == null) {
					table[hash] = p.next;
				}
				else 
					pp.next = p.next;
				return 0;
			}
			pp=p;
			p = p.next; //다음 노드를 선택 
		}
		return 1;
	}

	// --- 해시 테이블을 덤프(dump) ---//
	public void dump() {
		for (int i=0; i<size ; i++) {
			Node p = table[i];
			System.out.printf("%02d ", i);
			while (p!=null) {
				System.out.printf("→ %d",p.getKey());
				p=p.next;
			}
			System.out.println();
		}
	}
}

public class Test_실습10_1정수체인해시 {

	enum Menu {
		Add("삽입"), Delete("삭제"), Search("검색"), Show("출력"), Exit("종료");

		private final String message; // 표시할 문자열

		static Menu MenuAt(int idx) { // 순서가 idx번째인 열거를 반환
			for (Menu m : Menu.values())
				if (m.ordinal() == idx)
					return m;
			return null;
		}

		Menu(String string) { // 생성자(constructor)
			message = string;
		}

		String getMessage() { // 표시할 문자열을 반환
			return message;
		}
	}

	// --- 메뉴 선택 ---//
	static Menu SelectMenu() {
		Scanner sc = new Scanner(System.in);
		int key;
		do {
			for (Menu m : Menu.values()) {
				System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
				if ((m.ordinal() % 3) == 2 && m.ordinal() != Menu.Exit.ordinal())
					System.out.println();
			}
			System.out.print(" : ");
			key = sc.nextInt();
		} while (key < Menu.Add.ordinal() || key > Menu.Exit.ordinal());
		return Menu.MenuAt(key);
	}

//체인법에 의한 해시 사용 예
	public static void main(String[] args) {
		Menu menu;
		SimpleChainHash hash = new SimpleChainHash(11);
		Scanner stdIn = new Scanner(System.in);
		int select = 0, result = 0, val = 0;
		final int count = 15;
		do {
			switch (menu = SelectMenu()) {
			case Add:

				int[] input = new int[count];
				for (int ix = 0; ix < count; ix++) {
					double d = Math.random();
					input[ix] = (int) (d * 20);
					System.out.print(" " + input[ix]);
				}
				for (int i = 0; i < count; i++) {
					if ((hash.add(input[i])) == 0)
						System.out.println("Insert Duplicated data");
				}
				break;
			case Delete:
				// Delete
				System.out.println("Search Value:: ");
				val = stdIn.nextInt();
				result = hash.delete(val);
				if (result == 1)
					System.out.println(" 검색 데이터가 존재한다");
				else
					System.out.println(" 검색 데이터가 없음");
				System.out.println();
				break;
			case Search:
				System.out.println("Search Value:: ");
				val = stdIn.nextInt();
				result = hash.search(val);
				if (result == 1)
					System.out.println(" 검색 데이터가 존재한다");
				else
					System.out.println(" 검색 데이터가 없음");
				System.out.println();
				break;

			case Show:
				hash.dump();
				break;
			}
		} while (menu != Menu.Exit);

	}
}
