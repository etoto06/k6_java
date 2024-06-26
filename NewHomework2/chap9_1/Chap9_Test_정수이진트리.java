package NewHomework2.chap9_1;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

class TreeNode5 {
	TreeNode5 LeftChild;
	int data;
	TreeNode5 RightChild;

	public TreeNode5() {
		LeftChild = RightChild = null;
	}
}

class ObjectStack5{
	//--- 실행시 예외: 스택이 비어있음 ---//
	// generic class는 Throwable을 상속받을 수 없다 - 지원하지 않는다
	public class EmptyGenericStackException extends Exception {
		private static final long serialVersionUID = 1L;
		public EmptyGenericStackException() {
			super();
		}
	}

	//--- 실행시 예외: 스택이 가득 참 ---//
	public class OverflowGenericStackException extends RuntimeException {
		public OverflowGenericStackException() {
		}
	}

    private List<TreeNode5> data;  // list를 사용: 배열은 크기를 2배로 늘리는 작업 필요 
	//private List<T> data;
	private int capacity; // 스택의 크기
	private int top; // 스택 포인터

//--- 생성자(constructor) ---//
	public ObjectStack5(int capacity) {
		top = 0;
		this.capacity = capacity;
		// this.data = new T[capacity]; // 스택 본체용 배열을 생성
		try {
		data = new ArrayList<>(capacity); //Arraylist생성(용량=capacity)
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}  

//--- 스택에 x를 푸시 ---//
	public boolean push(TreeNode5 x) throws OverflowGenericStackException {
		System.out.println("top = " + top +"capacity = " + capacity);
		if (top >= capacity)
			throw new OverflowGenericStackException();
		top++;
		return data.add(x);

	}

//--- 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄) ---//
	public TreeNode5 pop() throws EmptyGenericStackException  {
		if (top < 0)
			throw new EmptyGenericStackException();
		return data.remove(--top);
	}

//--- 스택에서 데이터를 피크(peek, 정상에 있는 데이터를 들여다봄) ---//
	public TreeNode5 peek() throws EmptyGenericStackException  { 
		if (top <= 0) //스택이 비어있다면 
			throw new EmptyGenericStackException();
		return data.get(top - 1);
	}

//--- 스택을 비움 ---//
	public void clear() {
		top = 0;
	}

//--- 스택에서 x를 찾아 인덱스(없으면 –1)를 반환 ---//
	public int indexOf(TreeNode5 x) {
		for (int i = top - 1; i >= 0; i--) // 꼭대기 쪽부터 선형 검색
			if (data.get(i).equals(x))
				return i; // 검색 성공
		return -1; // 검색 실패
	}

//--- 스택의 크기를 반환 ---//
	public int getCapacity() {
		return capacity;
	}

//--- 스택에 쌓여있는 데이터 갯수를 반환 ---//
	public int size() {
		return top;
	}

//--- 스택이 비어있는가? ---//
	public boolean isEmpty() {
		return top <= 0;
	}

//--- 스택이 가득 찼는가? ---//
	public boolean isFull() {
		return top >= capacity;
	}

//--- 스택 안의 모든 데이터를 바닥 → 꼭대기 순서로 출력 ---//
	public void dump() {
		if (top <= 0)
			System.out.println("stack이 비어있습니다.");
		else {
			for (int i = 0; i < top; i++)
				System.out.print(data.get(i)+ " ");
			System.out.println();
		}
	}
}
//정수를 저정하는 이진트리 만들기 실습
class ObjectQueue5 {
    private TreeNode5[] que;//큐는 배열로 구현
	//private List<Integer> que; // 수정본
	private int capacity; // 큐의 크기
	private int front; // 맨 처음 요소 커서
	private int rear; // 맨 끝 요소 커서
	private int num; // 현재 데이터 개수

//--- 실행시 예외: 큐가 비어있음 ---//
	public class EmptyQueueException extends RuntimeException {
		public EmptyQueueException(String msg) {
			super(msg);
		}
	}

//--- 실행시 예외: 큐가 가득 찼음 ---//
	public class OverflowQueueException extends RuntimeException {
		public OverflowQueueException(String msg) {
			super(msg); 
		}
	}

//--- 생성자(constructor) ---//
public ObjectQueue5(int maxlen) {
   num = front = rear = 0;
   capacity = maxlen;
   try {
	   que = new TreeNode5[maxlen];
   } catch (OutOfMemoryError e) {        // 생성할 수 없음
       capacity = 0;
   }
}

//--- 큐에 데이터를 인큐 ---//
	public int enque(TreeNode5 x) throws OverflowQueueException {
		if (num >= capacity)
			throw new OverflowQueueException("queue full"); // 큐가 가득 찼음
		que[rear++] = x; 
		num++;

		return 1;
	}

//--- 큐에서 데이터를 디큐 ---//
	public TreeNode5 deque() throws EmptyQueueException {
		if (num <= 0)
			throw new EmptyQueueException("queue empty"); // 큐가 비어있음
		TreeNode5 x = que[front++];
		num--;

		return x;
	}

//--- 큐에서 데이터를 피크(프런트 데이터를 들여다봄) ---//
	public TreeNode5 peek() throws EmptyQueueException {
		if (num <= 0)
			throw new EmptyQueueException("queue empty"); // 큐가 비어있음
		return que[front];
	}

//--- 큐를 비움 ---//
	public void clear() {
		num = front = rear = 0;
	}

//--- 큐에서 x를 검색하여 인덱스(찾지 못하면 –1)를 반환 ---//
	public int indexOf(TreeNode5 x) {
		for (int i = 0; i < num; i++) {    //num은 현제 데이터 개수 
			int idx = (i + front) % capacity; //원형큐에서 요소를 탐색하기 위한것 
			//i는 현제 탐색하는 인뎃스, front는 큐의 시작지점 
			// (i+front)는 가상의 인덱스,  %capacity는 배열의 크기로 나눈 나머지 
			if (que[idx].equals(x)) // 검색 성공 
				return idx;
		}
		return -1; // 검색 실패
	}	
	
//--- 큐의 크기를 반환 ---//
	public int getCapacity() {
		return capacity;
	}

//--- 큐에 쌓여 있는 데이터 개수를 반환 ---//
	public int size() {
		return num;
	}

//--- 큐가 비어있는가? ---//
	public boolean isEmpty() {
		return num <= 0;
	}

	//delete를 할 때 오른쪽/왼쪽 자식의 유무 검사
	public boolean isLeft() {
		while()
		
		return false;
	}
	
	
//--- 큐가 가득 찼는가? ---//
	public boolean isFull() {
		return num >= capacity;
	}

//--- 큐 안의 모든 데이터를 프런트 → 리어 순으로 출력 ---//
	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비어있습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[((i + front) % capacity)] + " ");
			System.out.println();
		}
	}
}
class Tree5 {
	TreeNode5 root;

	Tree5() {
		root = null;
	}

	TreeNode5 inorderSucc(TreeNode5 current) {
		TreeNode5 temp = current.RightChild;
		if (current.RightChild != null)
			while (temp.LeftChild != null)
				temp = temp.LeftChild;
		System.out.println("inordersucc:: temp.data = "+temp.data);
		return temp;
	}

	boolean isLeafNode(TreeNode5 current) {
		if (current.LeftChild == null && current.RightChild == null)
			return true;
		else
			return false;
	}

	void inorder() {
		inorder(root);
	}

	void preorder() {
		preorder(root);
	}

	void postorder() {
		postorder(root);
	}

	void inorder(TreeNode5 CurrentNode) {
		if (CurrentNode != null) {
			inorder(CurrentNode.LeftChild);
			System.out.print(" " + CurrentNode.data);
			inorder(CurrentNode.RightChild);
		}
	}

	void preorder(TreeNode5 CurrentNode) {
		if (CurrentNode != null) {
			System.out.print(CurrentNode.data + " ");
			preorder(CurrentNode.LeftChild);
			preorder(CurrentNode.RightChild);
		}
	}

	void postorder(TreeNode5 CurrentNode) {
		if (CurrentNode != null) {
			postorder(CurrentNode.LeftChild);
			postorder(CurrentNode.RightChild);
			System.out.print(CurrentNode.data + " ");
		}
	}

	void NonrecInorder()//void Tree5::inorder(TreeNode5 *CurrentNode)와 비교
	//stack을 사용한 inorder 출력
	{
		ObjectStack5 s = new ObjectStack5(20);
		TreeNode5 CurrentNode = root;
		while (true) {
			while (CurrentNode != null) {
				s.push(CurrentNode);
				CurrentNode = CurrentNode.LeftChild;
			}
			if (!s.isEmpty()) {
				try {
					CurrentNode = s.pop();
				} catch (Chap9_Tree.ObjectStack5.EmptyGenericStackException e) {
					e.printStackTrace();
				}
				System.out.println(" " + CurrentNode.data);
				CurrentNode = CurrentNode.RightChild;
			}
			else break;  
		}
	}
	void levelOrder() //level 별로 출력한다. level이 증가하면 다음줄에 출력한다 
	//난이도: 최상급 구현 
	{
		ObjectQueue5 q = new ObjectQueue5(20);
		Queue<Integer> que = new LinkedList<>();
		int oldLevel = 0,  newLevel=0;
		que.add(oldLevel+1);
		TreeNode5 CurrentNode = root;
		newLevel = que.remove();
		
	}
	
//insert - > inorder print (case문)

	boolean insert(int x) {
	// binary search tree를 만드는 입력 : left subtree < 노드 x < right subtree
		//inorder traversal시에 정렬된 결과가 나와야 한다
		TreeNode5 p = root; //이진탐색트리에서 현재 노드를 가르키는것 
		TreeNode5 q = null; //삽입할 부모노드 위치 기억용 
		
		while(p != null) {  //p가 NULL이 아닌동안 루프실행, P가 NULL이 되면 루프종료
			q=p; //새 노드 삽입전 삽입할 위치를 찾기위함, 이동한 위치 기억
			if (x==p.data) { //새로 삽입하려는 데이터x가 이미 트리에 존재하는지 확인
				//즉, 현재 탐색중인 노드p의 데이터와 새 데이터 x를 비교해 이미 존재하면 false반환
				return false; }
			if(x < p.data) p = p.LeftChild;
			//새 데이터 x가 노드p보다 작으면 왼쪽, 크면 오른쪽
			else p = p.RightChild;
		}
		 // 새로운 노드를 생성하여 데이터 x를 저장하고, 적절한 위치에 연결함
	    TreeNode5 newNode = new TreeNode5();
	    newNode.data = x;
	    newNode.LeftChild = null;
	    newNode.RightChild = null;

	    if (root == null) {
	        root = newNode;
	    } else if (x < q.data) {
	        q.LeftChild = newNode;
	    } else {
	        q.RightChild = newNode;
	    }
	    return true;
	}
//		p = new TreeNode5(); //새로운 노드를 생성하여 p에 할당 
//		p.LeftChild = p.RightChild = null; //왼쪽 오른쪽 자식 초기화
//		p.data =x; //새로운 노드에 데이터 x를 저장
//		
//		if(root==null) root=p; //교재 375페이지  
//		else if ( x< p.data) q.LeftChild =p; //x가 노드p보다 작으면 부모노드의 왼쪽자식으로p
//		else q.RightChild =p;	//만약 x 가 부모노드 q의 데이터보다 크거나 같으면 q의 오른쪽 자식으로 p연결 
//		return true;
//	}

	
	boolean delete(int num) {//binary search tree에서 임의 값을 갖는 노드를 찾아 삭제한다.
		//삭제 대상이 leaf node인 경우, non-leaf node로 구분하여 구현한다 
		
		TreeNode5 p = root, q = null, parent = null;
		//        현제노드                 부모노드 
		int branchMode = 0; // 1은 left, 2는 right
		
		
		if (root == null) 
			return false; //빈트리면 삭제 실패 
		
		//삭제할 노드 찾기
		while(p != null && p.data !=num) {
			parent = p;
			if(num < p.data) {
				p = p.LeftChild;
				branchMode =1;
			}else {
				p=p.RightChild;
				branchMode =2;
			}
		}
		
		if(p==null)
			return false;
		
		while(p.LeftChild ==null && p.RightChild==null) { //리프노드(맨아래)일 경우 
			if(parent == null)
				root = null;
			else if(branchMode == 1)   //p가 parent의 왼쪽인지 오른쪽인지 
				parent.LeftChild =null;
			else parent.RightChild = null;
		}
	
		while(p.LeftChild !=null || p.RightChild !=null) { //왼쪽자식이 있거나 오른쪽자식이 있거나 양쪽자식이 있는경우
			if(p.LeftChild !=null && p.RightChild == null) { //왼쪽자식만 있는경우
				if(parent.LeftChild == p) parent.LeftChild = p.LeftChild ;
				else if(parent.RightChild == p) parent.RightChild = p.LeftChild;
			}
			
			else if ( p.LeftChild ==null && p.RightChild !=null) { //오른쪽 자식만 있는경우
				if(parent.LeftChild ==p) parent.LeftChild = p.RightChild;
				else if(parent.RightChild == p) parent.RightChild = p.RightChild;
			}
			
			else { //p의 양쪽 자식이 있는 경우 
				q =p.LeftChild ;
				 if(q.data < q.LeftChild.data) p = q.LeftChild;
				 if(q.data < q.RightChild.data) p = q.RightChild;
				 else q=p;				 
			}
		}
	return true;
	}

	
	
	boolean search(int num) {//num 값을 binary search tree에서 검색
		TreeNode5 p = root;
		
	while(p != null) {
		if (p.data == num)
			return true;	
		else if(num <p.data) 
			p=p.LeftChild;
		else if(num >p.data) 
			p=p.RightChild;
	}
	return false;
	}
//		if(p==null) return false; 
//		if(p.data==num) return true;
//		
//		else if (num < p.data) {
//			p = p.LeftChild;
//			return false;
//		}
//		else if (num > p.data) {
//			p = p.RightChild;
//			return false;
//		}
//	return false;
}

public class Chap9_Test_정수이진트리{
	enum Menu {
		Add("삽입"), Delete("삭제"), Search("검색"), InorderPrint("정렬출력"), 
		LevelorderPrint("레벨별출력"), StackInorderPrint("스택정렬출력"), 
		PreorderPrint("prefix출력"), PostorderPrint("postfix출력"), Exit("종료");

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
		Scanner stdIn = new Scanner(System.in);
		int key;
		do {
			for (Menu m : Menu.values())
				System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
			System.out.print(" : ");
			key = stdIn.nextInt();
		} while (key < Menu.Add.ordinal() || key > Menu.Exit.ordinal());

		return Menu.MenuAt(key);
	}

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		Tree5 t = new Tree5();
		Menu menu; // 메뉴
		int count = 20;
		int num;
		boolean result;
		do {
			switch (menu = SelectMenu()) {
			case Add: // 
				int[] input = new int[count];
				for (int ix = 0; ix < count; ix++) {
					input[ix] = rand.nextInt(50);
				}
				for (int n: input)
					System.out.print(n + " ");
				for (int i = 0; i < count; i++) {
					if (!t.insert(input[i]))
						System.out.println("Insert Duplicated data");
				}
				break;

			case Delete: //임의 정수 삭제
				System.out.println("삭제할 데이터:: ");
				num = stdIn.nextInt();
				if (t.delete(num))
					System.out.println("삭제 데이터 = " + num + " 성공");
				else
					System.out.println("삭제 실패");
				;
				break;

			case Search: // 노드 검색
				System.out.println("검색할 데이터:: ");

				num = stdIn.nextInt();
				result = t.search(num);
				if (result)
					System.out.println(" 데이터 = " + num + "존재합니다.");
				else
					System.out.println("해당 데이터가 없습니다.");
				break;

			case InorderPrint: // 전체 노드를 키값의 오름차순으로 표시
				t.inorder();
				System.out.println();
				//t.NonrecInorder();
				break;
			case LevelorderPrint: // 
				t.levelOrder();
				System.out.println();
				//t.NonrecInorder();
				break;
			case StackInorderPrint: // 전체 노드를 키값의 오름차순으로 표시
				t.NonrecInorder();
				break;
			case PreorderPrint://prefix 출력
				t.preorder();
				System.out.println();
				break;
			case PostorderPrint://postfix로 출력
				t.postorder();
				System.out.println();
				break;
			}
		} while (menu != Menu.Exit);
	}
}
