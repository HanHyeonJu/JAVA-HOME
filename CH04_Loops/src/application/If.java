package application;
import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		int apples = 10;
		int bananas = 5;
		
		if(apples > bananas) {
			System.out.println("����� �ٳ������� ����");
		}
		System.out.println("���α׷� ����.");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("����� ������? ");
		int apple = scanner.nextInt();
		System.out.println("�ٳ����� ������? ");
		int banana = scanner.nextInt();
		scanner.close();
		
		if(apple > banana) {
			System.out.println("����� �ٳ������� ����");
		}
		if(apple < banana) {
			System.out.println("�ٳ����� ������� ����");
		}
		
	}

}
