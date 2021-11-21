package question;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// 정수 배열을 new로 3개 만듬, 스캐너 이용해 정수 입력, 입력한 값을 더해서 총합 출력
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[3];
		
		int total = 0;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("숫자를 입력: ");
			numbers[i] = scanner.nextInt();
			total = total + numbers[i];
		}
		scanner.close();
		
		System.out.println(total);
				
	}

}
