package application;
import java.util.Scanner;
public class CheckPassword {

	public static void main(String[] args) {
		// 유저가 입력한 패스워드를 설정한 패스워드와 비교
		final String USER_PASSWORE = "hello";
		
		System.out.print("Enter password > ");
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
		scanner.close();
		
		if(password.equals(USER_PASSWORE)) {
			System.out.println("접속 승인.");
		}
		else {
			System.out.println("접속 불가.");
		}
		
	}

}
