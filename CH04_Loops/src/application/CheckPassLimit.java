package application;
import java.util.Scanner;
public class CheckPassLimit {

	public static void main(String[] args) {
		// �н����� 3��
		final String USER_PASSWORD ="hello";
		
		Scanner scanner = new Scanner(System.in);
		
		boolean accessOK = false;
		
		for(int i =1; i <=3; i++) {
			System.out.println("��ȣ�� �Է��ϼ��� > ");
			String password = scanner.nextLine();
			if(password.equals(USER_PASSWORD)) {
				System.out.println("���ӽ���.");
				accessOK = true;
				break;
			}
			else {
//				System.out.printf("��ȣ�� Ʋ�Ƚ��ϴ�.(%d)\n", i);
				System.out.printf("��ȣ�� %d�� Ʋ�Ƚ��ϴ�.\n", 1);
//				+1??????????????? �� �� ����?
			}
		}
		scanner.close();
		
		if(!accessOK) {
			System.out.println("���Ӱź�");
		}
	}

}
