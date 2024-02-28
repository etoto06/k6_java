package J11; // 패키지 선언. J11이라는 이름의 패키지를 사용함을 나타냅니다.

// Test01이라는 클래스를 정의합니다. java 파일의 이름도 Test01.java여야 합니다.
public class Test01주석버전 {
    // main 메서드는 자바 프로그램이 실행되는 시작점입니다.
    public static void main(String[] args) {
        test1(); // test1 메서드를 호출합니다.
        System.out.println("GOOD"); // "GOOD"을 출력합니다.
    }
    
    // test1 메서드를 정의합니다. 이 메서드는 private 접근 제한자를 가지므로 클래스 내부에서만 사용할 수 있습니다.
    private static void test1() {
        System.out.println("Test1 start"); // "Test1 start"를 출력합니다.
        test2(); // test2 메서드를 호출합니다.
        System.out.println("Test1 end"); // "Test1 end"를 출력합니다.
    }
    
    // test2 메서드를 정의합니다. 이 메서드 역시 private 접근 제한자를 가집니다.
    private static void test2() {
        System.out.println("Test2 start"); // "Test2 start"를 출력합니다.
        try {
            // try 블록 내부에서 예외가 발생할 수 있는 코드를 넣습니다.

            // String 객체를 생성하고 s 참조 변수에 할당합니다.
            String s = new String("java"); 
            // s 참조변수가 참조하는 String 객체의 길이를 얻어 len 변수에 할당합니다.
            int len = s.length();
            // s 참조 변수를 null로 만듭니다. 이제 s는 어떠한 객체도 참조하지 않습니다.
            s = null; 
            
            // 이 부분이 주석 처리되어 있으므로 코드가 실행되지 않습니다.
            // s.length(); 
            
            // 길이가 3인 int 배열을 생성합니다.
            int arr[] = new int[3];
            // 배열의 4번째 요소(인덱스는 0부터 시작하므로 3)에 30을 할당하려고 합니다.
            // 이 부분에서 ArrayIndexOutOfBoundsException이 발생하게 됩니다.
            arr[3] = 30; 
            System.out.println("ok");
            
        } catch (ArrayIndexOutOfBoundsException e1) {
            // 배열의 범위를 벗어난 접근을 시도하면 이 블록이 실행됩니다.
            // 예외 메시지를 출력합니다.
            System.out.println(e1.getMessage()); 

        } catch (NullPointerException e2) {
            // 참조변수가 null인 상태에서 객체의 메서드를 호출하려고 하면 이 블록이 실행됩니다.
            // 예외의 스택 트레이스를 출력합니다.
            e2.printStackTrace(); 

        } catch (Exception e) {
            // 그 외 모든 예외를 처리합니다. 가장 마지막에 위치하는 것이 좋습니다.
            System.out.println("오류발생 : " + e);

        }
        // 예외가 발생하든 하지 않든 실행됩니다.
        System.out.println("good"); // "good"을 출력합니다.
    }
}
