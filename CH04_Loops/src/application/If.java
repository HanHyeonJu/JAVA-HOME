package application;
import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		int apples = 10;
		int bananas = 5;
		
		if(apples > bananas) {
			System.out.println("사과가 바나나보다 많음");
		}
		System.out.println("프로그램 종료.");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("사과의 개수는? ");
		int apple = scanner.nextInt();
		System.out.println("바나나의 개수는? ");
		int banana = scanner.nextInt();
		scanner.close();
		
		if(apple > banana) {
			System.out.println("사과가 바나나보다 많음");
		}
		if(apple < banana) {
			System.out.println("바나나가 사과보다 많음");
		}
		
	}

}
