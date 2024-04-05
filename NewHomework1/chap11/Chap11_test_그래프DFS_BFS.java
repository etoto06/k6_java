package NewHomework1.chap11;

/*
 Graph Representation
 Adjacency Lists + BFS + DFS
*/

import java.util.Scanner;

class ListNode {
	int data;
	ListNode link;

	public ListNode(int data) {
		this.data = data;
		link = null;
	}
}

class List {
	public List() {
		first = null;
	}
	ListNode first;
	void Insert(int k) {//같은 값을 체크하지 않아 중복 입력됨
		// 구현할 부분
		ListNode temp = new ListNode(k);
		if(first == null)
			first = temp;
		return; 
	}
	void Delete(int k) {
		// 구현할 부분
	}
}

class ListIterator {

	private List list;
	private ListNode current; //현제 가리키고 있는 노드 

	public ListIterator(List l) { //생성자 
		list = l;
		current = list.first;
	}

	int First() {  //현제 노드의 데이터 반환 
		if (current != null)
			return current.data;
		else
			return 0;
	}

	int Next() { //next를 하면 현제 노드를 다음노드로 이동시긴후, 그 데이터 반환
		int data = current.data; 
		current = current.link;
		return data;
	}

	boolean NotNull() { //현제 노드(current)가 null인지 아닌지 
		if (current != null)
			return true;
		else
			return false;
	}

	boolean NextNotNull() { //현제 노드 다음이 null인지 아닌지 
		if (current.link != null)
			return true;
		else
			return false;
	}


}

class QueueNode {
	int data;
	QueueNode link;

	public QueueNode(int data, QueueNode link) {
		this.data = data;
		this.link = link;
		
	}
}

class Queue {  //선입선출 
	private QueueNode front, rear;

	void QueueEmpty() {  
		front = rear = null; //front 큐의 맨앞요소,rear큐의 맨뒤
	}

	public Queue() {
		QueueEmpty();
	}

	boolean IsEmpty() {
		if (front == null)
			return true;
		else
			return false;
	}

	void Insert(int y) {
		// 구현할 부분
		QueueNode newNode = new QueueNode(y, null); //y는 새로 삽입될 데이터 
		if(front == null) { //큐가 비었는지 판단 후 front와 rear를 초기화
			front = rear = newNode;
	}else {
		rear = rear.link = newNode;
	}

	int Delete() {
		if(front == 0) QueueEmpty(); return 0;
		QueueNode
		
	}
	// 구현할 부분
	}
}

class StackNode {
	ListNode data;
	StackNode link;

	StackNode(ListNode data, StackNode link) {
		this.data = data;
		this.link = link;
	}
}

class Stack {  //푸시 팝 구현 
	private StackNode top;

	void StackEmpty() {
		top = null;
	}

	public Stack() {
		StackEmpty();
	}

	boolean IsEmpty() {
		if (top == null)
			return true;
		else
			return false;
	}

	void Insert(ListNode y) {
		// 구현할 부분
	}

	ListNode Delete()
	// delete the top node in stack and return its data
	{
		// 구현할 부분
	}
}


class Graph {
	private List[] HeadNodes; //
	int n;
	boolean[] visited;

	public Graph(int vertices) {
		int [][]a = new int[3][];  //행은 3개
		for (int i =0; i<a.length;i++)
			a[i] = new int[4]; //각각의 행은 new int 4개 가지고 있음
				 
		n = vertices;
		HeadNodes = new List[n]; //
		visited = new boolean[n];
		for (int i = 0; i < n; i++) { // L→1→2→3 1
			HeadNodes[i] = new List();
			visited[i] = false;
		}
		
	}

	void displayAdjacencyLists() {
		for (int i = 0; i < n; i++) {
			System.out.print("\n"+i+"[ ]");
			ListNode p = HeadNodes[i].first; //왜 first를 사용하는지 
			while (p!=null) {
				System.out.println("->"+p.data);
			}
			// 구현할 부분
		}
	}

	void InsertVertex(int start, int end) { // 예)  (0,1)전달시
		if (start < 0 || start >= n || end < 0 || end >= n) {
			System.out.println("the start node number is out of bound.");
			return;
			
		}
		HeadNodes[start].(end);
		HeadNodes[end].Insert(start);
		// 구현할 부분
	}

	void BFS(int v) {
		boolean[] visited = new boolean[n]; // visited is declared as a Boolean 
		for (int i = 0; i < n; i++)
			visited[i] = false; // initially, no vertices have been visited
		// 구현할 부분
//		_BFS(v);
//		queue를 사용해서 구현해라 -> 뜻:
	}
	void ShowList(List l) {
		ListIterator li = new ListIterator(l);
		// 구현할 부분
	}

	// Driver
	void DFS(int v) {
		for (int i = 0; i < n; i++)
			visited[i] = false; // initially, no vertices have been visited

		_DFS(v); // start search at vertex 0
//		_NonRecursiveDFS(v);  //이거는 스택을 이용한 non-recurcive버전 

	}

	// Workhorse
	void _DFS(int v)
	// visit all previously unvisited vertices that are reachable from vertex v
	{
		visited[v] = true;
		System.out.println(v + ", ");
		ListIterator li = new ListIterator(HeadNodes[v]); // li <리스트인터레이터
		if (!li.NotNull())
			return;
		int w = li.First();
		while (true) {
			if (!visited[w])  //1번 방문안했으면 또 방문
				_DFS(w);
			if (li.NotNull()) //
				w = li.Next();
			else
				return;
		}
	}
	// Workhorse 2
		void _NonRecursiveDFS(int v)
		// visit all previously unvisited vertices that are reachable from vertex v
		{
			// 구현할 부분
			
		}
}
public class Chap11_test_그래프DFS_BFS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		// select는 메뉴 선택하는 변수, n은 노드갯수  
		int select = 10, n, startEdge = -1, endEdge = -1;
		int startBFSNode = 0;//BFS를 하기위한 시작노드

		System.out.println("vertex 숫자 입력: ");

		n = sc.nextInt();
		
		Graph g = new Graph(n);

		while (select != '0') {
			System.out.println("\n명령 선택 1: edge 추가, 2: Adjacency Lists 출력, 3: BFS, 4: DFS, 5: 종료 => ");
			select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("edge 추가: from vertext: ");
				startEdge = sc.nextInt();
				System.out.println("to vertex: ");
				endEdge = sc.nextInt();
				if (startEdge < 0 || startEdge >= n || endEdge < 0 || endEdge >= n) {
					System.out.println("the input node is out of bound.");
					break;
				}
				// get smallest start node.
				if (startEdge < startBFSNode)
					startBFSNode = startEdge;
				if (endEdge < startBFSNode)
					startBFSNode = endEdge;
				g.InsertVertex(startEdge, endEdge);
				break;
			case 2:
				// display
				g.displayAdjacencyLists();
				break;

			case 3:
				System.out.println("Start BFS from node: " + startBFSNode);
				g.BFS(startBFSNode);
				break;
			case 4:
				System.out.println("Start DFS from node: " + startBFSNode);
				g.DFS(startBFSNode); //0번으로 시작 
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("WRONG INPUT  " + "\n" + "Re-Enter");
				break;
			}
		}

		return;
	}
}
