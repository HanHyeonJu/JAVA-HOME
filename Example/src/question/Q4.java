package question;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// ���� �迭�� new�� 3�� ����, ��ĳ�� �̿��� ���� �Է�, �Է��� ���� ���ؼ� ���� ���
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[3];
		
		int total = 0;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("���ڸ� �Է�: ");
			numbers[i] = scanner.nextInt();
			total = total + numbers[i];
		}
		scanner.close();
		
		System.out.println(total);
				
	}

}
