package question;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		System.out.println("�޴�");
		System.out.println("====\n");
		
		System.out.println("1. ����Ʈ '��ο�'");
		System.out.println("2. ����Ʈ '�ȳ� ?'");
		System.out.println("3. ����Ʈ '���α׷� ����'");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ɼ��� ���� > ");
		int a = scanner.nextInt();
		scanner.close();

//		if(a == 1) {
//			System.out.println("��ο�");
//		}
//		else if(a == 2) {
//			System.out.println("�ȳ� ?");
//		}
//		else if(a == 3) {
//			System.out.println("���α׷� ����");
//		}
//		else if(a == 10000) {
//			System.out.println("�̽��Ϳ��׸� �߰��߽��ϴ�.");
//		}
//		else{
//			System.out.println("�߸��� �ɼ��Դϴ�.");
//		}
		
		switch(a) {
		case 1:
			System.out.println("��ο�");
			break;
		case 2:
			System.out.println("�ȳ� ?");
			break;
		case 3:
			System.out.println("���α׷� ����");
			break;
		case 10000:
			System.out.println("�̽��Ϳ��׸� �߰��߽��ϴ�.");
			break;
		default:
			System.out.println("�߸��� �ɼ��Դϴ�.");
		}
		
	}

}
