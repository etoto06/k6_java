package NewHomework1.chap6_MY;

import java.util.Random;
import java.util.Scanner;

interface MaxHeap {
	public void Insert(int x);
	public int DeleteMax();
}

class Heap implements MaxHeap {
	final int heapSize = 100;
	private int[] heap;  
	private int n; // 현재 max힙의 크기 
	private int MaxSize; // Maximum allowable size of MaxHeap
	
	//생성자 
	public Heap(int sz) {
		heap = new int[heapSize];
		n=0; //초기값 0
		MaxSize=sz;
	}

	public void display() {
		for (int i=0; i<n; i++) {
			System.out.println(heap[i]);
		}
	}
	@Override
	public void Insert(int x) {
		if (n==MaxSize) {    //힙이 가득 찬경우 
			HeapFull();
			return;
		}
		int i = n++; 
		for (int a=0; a<1; a--) {
			if (i == 1) break; 
		if (x <= heap[i / 2]) break;
		// move from parent to i
		heap[i] = heap[i / 2];
		i /= 2;
	}
	heap[i] = x;
}

	@Override
	public int DeleteMax() {
		if(n==0) { 
			HeapEmpty();
			return -1;
		}
		int max = heap[0];
		
		return max;
	}

	private void HeapEmpty() {
		System.out.println("Heap Empty");
	}

	private void HeapFull() {
		System.out.println("Heap Full");
	}
}
public class Chap6_Test_HeapSort {
	 static void showData(int[] d) {
	     for (int i = 0; i < d.length; i++)
	         System.out.print(d[i] + " ");
	     System.out.println();
	 }
	public static void main(String[] args) {
		Random rnd = new Random();
		int select = 0;
		Scanner stdIn = new Scanner(System.in);
		Heap heap = new Heap(20);
	    final int count = 10;
	    int[] x = new int[count+1];
	    int []sorted = new int[count];

		do {
			System.out.println("Max Tree. Select: 1 insert, 2 display, 3 sort, 4 exit => ");
			select = stdIn.nextInt();
			switch (select) {
			case 1:
	
				break;
			case 2:
				heap.display();
				break;
			case 3:

				break;

			case 4:
				return;

			}
		} while (select < 5);

		return;
	}
}

//MaxHeap 인터페이스: 최대 힙의 기본 동작을 정의하는 인터페이스로, Insert과 DeleteMax 메소드를 선언하고 있습니다.
//Heap 클래스: MaxHeap 인터페이스를 구현하는 클래스로, 최대 힙을 구현하고 있습니다. Insert 메소드는 최대 힙에 원소를 삽입하고,
//DeleteMax 메소드는 최대 값을 삭제합니다. 또한, display, HeapEmpty, HeapFull 메소드가 구현되어 있습니다.
//Chap6_Test_HeapSort 클래스: 힙 정렬을 테스트하는 메인 클래스로, 사용자로부터 입력을 받아 최대 힙에 값을 삽입하거나
// 힙을 출력하거나, 힙 정렬을 수행하도록 구성되어 있습니다
