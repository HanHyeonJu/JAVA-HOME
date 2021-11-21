package application;
import java.util.Scanner;
public class IfElseIfElse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("초코칩의 개수는 ? ");
		int choco = scanner.nextInt();
		System.out.println("도넛의 개수는 ? ");
		int donut = scanner.nextInt();
		scanner.close();
		
		if(choco > donut) {
			System.out.println("초코칩이 도넛보다 많음");
		}
		else if(choco < donut) {
			System.out.println("도넛이 초코칩보다 많음");
		}
		else {
			System.out.println("초코칩과 도넛의 개수가 같음");
		}

	}

}
