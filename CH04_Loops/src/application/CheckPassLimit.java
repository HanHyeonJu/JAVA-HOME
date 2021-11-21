package application;
import java.util.Scanner;
public class CheckPassLimit {

	public static void main(String[] args) {
		// 패스워드 3번
		final String USER_PASSWORD ="hello";
		
		Scanner scanner = new Scanner(System.in);
		
		boolean accessOK = false;
		
		for(int i =1; i <=3; i++) {
			System.out.println("암호를 입력하세요 > ");
			String password = scanner.nextLine();
			if(password.equals(USER_PASSWORD)) {
				System.out.println("접속승인.");
				accessOK = true;
				break;
			}
			else {
//				System.out.printf("암호를 틀렸습니다.(%d)\n", i);
				System.out.printf("암호를 %d번 틀렸습니다.\n", 1);
//				+1??????????????? 잘 못 쓴듯?
			}
		}
		scanner.close();
		
		if(!accessOK) {
			System.out.println("접속거부");
		}
	}

}
