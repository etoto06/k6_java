package NewHomework1.chap4;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Point2 {
    private int ix;
    private int iy;

    public Point2(int x, int y) {
        ix = x;
        iy = y;
    }

    @Override
    public String toString() {
        return "<" + ix + ", " + iy + ">";
    }

    public int getX() {
        return ix;
    }

    public int getY() {
        return iy;
    }

    public void setX(int x) {
        ix = x;
    }

    public void setY(int y) {
        iy = y;
    }

    @Override
    public boolean equals(Object p) {
        if ((this.ix == ((Point2)p).ix) && (this.iy == ((Point2)p).iy))
            return true;
        else return false;
    }
}

class ObjectStack {
    private List<Point2> data;           // 스택용 배열
    private int capacity; // 스택의 크기
    private int top; // 스택 포인터

    public ObjectStack(int capacity) {
        top = 0;
        this.capacity = capacity;
        data = new ArrayList<>(capacity);
    }

    public boolean push(Point2 x) {
        if (isFull()) {
            return false;
        }
        data.add(x);
        top++;
        return true;
    }

    public Point2 pop() {
        if (isEmpty()) {
            return null;
        }
        Point2 popped = data.remove(top - 1);
        top--;
        return popped;
    }

    public Point2 peek() {
        if (isEmpty()) {
            return null;
        }
        return data.get(top - 1);
    }

    public void clear() {
        data.clear();
        top = 0;
    }

    public int indexOf(Point2 x) {
        for (int i = top - 1; i >= 0; i--) { // 꼭대기 쪽부터 선형 검색
            if (data.get(i).equals(x)) {
                return i; // 검색 성공
            }
        }
        return -1; // 검색 실패
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public boolean isFull() {
        return top >= capacity;
    }
}

public class Test_실습4_2_1객체스택{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        ObjectStack s = new ObjectStack(8); // 최대 8 개를 push할 수 있는 stack
        Random random = new Random();
        int rndx = 0, rndy = 0;
        Point2 p = null;
        while (true) {
            System.out.println(); // 메뉴 구분을 위한 빈 행 추가
            System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1)push　(2)pop　(3)peek　(4)dump　(5)clear  (0)종료: ");

            int menu = stdIn.nextInt();
            if (menu == 0)
                break;

            switch (menu) {
                case 1: // 푸시
                    System.out.print("데이터: ");
                    rndx = random.nextInt(20);
                    rndy = random.nextInt(20);
                    p = new Point2(rndx,rndy);
                    boolean isPushed = s.push(p);
                    if (isPushed) {
                        System.out.println("데이터 " + p + "를 푸시했습니다.");
                    } else {
                        System.out.println("스택이 가득 차서 데이터를 푸시할 수 없습니다.");
                    }
                    break;

                case 2: // 팝
                    p = s.pop();
                    if (p != null) {
                        System.out.println("팝한 데이터는 " + p + "입니다.");
                    } else {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;

                case 3: // 피크
                    p = s.peek();
                    if (p != null) {
                        System.out.println("피크한 데이터는 " + p +"입니다");
                    }
            }	
        }
    }
}