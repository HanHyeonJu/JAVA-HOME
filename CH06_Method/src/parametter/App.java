package parametter;

public class App {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int number = 5;
		int result = cal.square(number);
		System.out.printf("%d의 제곱은 %d이다.\n", number, result);
		
		result = cal.square(7);
		System.out.printf("7의 제곱은 %d이다.\n", result);
		
		int x = 6;
		int y = 10;
		int result2 = cal.plus(x, y);
		System.out.printf("%d와 %d의 합은 %d이다.\n", x, y, result2);
		
		result = cal.minus(90, 125);
		System.out.printf("두 수의 차이는 %d이다.", result);

	}

}
