package parametter;

public class App {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int number = 5;
		int result = cal.square(number);
		System.out.printf("%d�� ������ %d�̴�.\n", number, result);
		
		result = cal.square(7);
		System.out.printf("7�� ������ %d�̴�.\n", result);
		
		int x = 6;
		int y = 10;
		int result2 = cal.plus(x, y);
		System.out.printf("%d�� %d�� ���� %d�̴�.\n", x, y, result2);
		
		result = cal.minus(90, 125);
		System.out.printf("�� ���� ���̴� %d�̴�.", result);

	}

}
