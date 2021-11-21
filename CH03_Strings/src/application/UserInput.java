package application;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("온도를 입력해주세요 : ");
		double celius = scanner.nextDouble();
		double fahrenheit = (celius * 9/5)+32;
		scanner.close();
		
		System.out.println("섭씨 "+celius+"는 화씨 "+fahrenheit+"이다." );

	}

}
