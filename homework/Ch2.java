package homework;

import java.util.Scanner;

public class Ch2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 좌표 받기
        System.out.print("입력 좌표: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        System.out.println("입력 각도:");
        int angle = scanner.nextInt();
        
        double rad = Math.toRadians(angle);
        double mathx = Math.cos(rad)*x -Math.sin(rad)*y;
        double mathy = Math.sin(rad)*x +Math.cos(rad)*y;
        
        System.out.println("출력각도"+mathx);
        System.out.println("출력각도"+mathy);
	}
}
''