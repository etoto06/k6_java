package J08;

public class MyLinkedList2 {
	private Node head;//링크리스트는 노드를 가지고있고,
	class Node {
		private String data;
		private Node link;
		public Node(String data) {
			//생성자는 필드가 2개이므로 heap에 필드공간 2개를 할당
			this.data = data; link = null;//이게 없으면 값은 안들어가고 위에꺼떄매 공간만 할당됨
		}
	}

	//Mylinkedlist m = new Mylinkedlist();
	//my add("hong");
		
	public void add(String data) {
		Node newNode = new Node(data);
		if(head == null)
			head =newNode;
		else {
			Node next = head;
			while(next.link !=null) {
				next=next.link;
			}
			next.link = newNode;
		}
	}
		public void print() {
		
		}
	public MyLinkedList2(Node head) {
		this.head = null;
	}
}
