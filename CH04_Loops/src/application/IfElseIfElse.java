package application;
import java.util.Scanner;
public class IfElseIfElse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("����Ĩ�� ������ ? ");
		int choco = scanner.nextInt();
		System.out.println("������ ������ ? ");
		int donut = scanner.nextInt();
		scanner.close();
		
		if(choco > donut) {
			System.out.println("����Ĩ�� ���Ӻ��� ����");
		}
		else if(choco < donut) {
			System.out.println("������ ����Ĩ���� ����");
		}
		else {
			System.out.println("����Ĩ�� ������ ������ ����");
		}

	}

}
