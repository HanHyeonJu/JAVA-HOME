package application;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("사과의 개수는 ?");
		int apples = scanner.nextInt();
		System.out.println("바나나의 개수는 ?");
		int bananas = scanner.nextInt();
		scanner.close();
		
		if(apples > bananas) {
			System.out.println("사과가 바나나보다 많음");
		}
		else {
			System.out.println("바나나가 사과보다 많음");
		}
	}

}
