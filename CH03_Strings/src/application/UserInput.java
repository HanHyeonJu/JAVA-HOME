package application;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�µ��� �Է����ּ��� : ");
		double celius = scanner.nextDouble();
		double fahrenheit = (celius * 9/5)+32;
		scanner.close();
		
		System.out.println("���� "+celius+"�� ȭ�� "+fahrenheit+"�̴�." );

	}

}
