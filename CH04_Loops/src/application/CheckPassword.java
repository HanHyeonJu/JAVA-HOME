package application;
import java.util.Scanner;
public class CheckPassword {

	public static void main(String[] args) {
		// ������ �Է��� �н����带 ������ �н������ ��
		final String USER_PASSWORE = "hello";
		
		System.out.print("Enter password > ");
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
		scanner.close();
		
		if(password.equals(USER_PASSWORE)) {
			System.out.println("���� ����.");
		}
		else {
			System.out.println("���� �Ұ�.");
		}
		
	}

}
