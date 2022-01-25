package application;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// ���� Ŭ����
public class Bank {
	private String bankname; //���� ������ �̸�
	private Account account[] = new Account[50]; // ������ ������ ���� �迭����
	private Member member[] = new Member[10]; // ȸ���� ������ ���� �迭 ����
	private int accountcount = 0; // ������ ������ ������ ���� 
	private int membercount = 0; // ȸ���� ������ ������ ����
	private int out = -1; // �α��ΰ� �α׾ƿ��� Ȯ���ϱ� ���� ����, -1�� �⺻������ ����
	private Scanner scanner = new Scanner(System.in);

	public Bank() {

	}

	public Bank(String bankname) {
		this.bankname = bankname;
	}

	// ȸ�������� ���� �޼ҵ�(������ ���̵�, ��й�ȣ �������� ����)
	public void members() { 
		System.out.println("������ ������ �Է����ּ���");
		String name = scanner.nextLine();
		System.out.println("������ ���Ͻô� ���̵� �Է����ּ���");
		System.out.println("ID ���� : �����ڿ� ���� �������� ���̵� �������ּ���(6~20�ڸ� ���)");
		String id = scanner.nextLine();
		
		// ���̵� �����ڿ� ���� �������� ����� ���� ����ǥ���� Pattern�� Matcher ���
		Pattern idPattern = Pattern.compile("^[a-zA-Z]\\w{5,19}$"); 
		Matcher idMatcher = idPattern.matcher(id);
		
		if (!idMatcher.matches()) {
			System.out.println("�߸��� �Է��Դϴ�.");
			menu();
		} else if (ID(id)) {
			System.out.println("�̹� �����ϴ� ���̵��Դϴ�");
			menu();
		} else if (id.length() < 6) {
			System.out.println("�߸��� �Է��Դϴ�");
			menu();
		} else {
			System.out.println("���������� ���̵� �����Ǿ����ϴ�");
		}

		System.out.println("������ ���Ͻô� ��й�ȣ�� �Է����ּ���");
		System.out.println("PASSWORD ���� : ������, ����, Ư������ �������� ��й�ȣ�� �������ּ���(10~20�ڸ� ���)");
		String password = scanner.nextLine();
		
		// ���̵�� ���������� ��й�ȣ�� �����ڿ� ���� �׸��� Ư������ �������� ����� ���� ����ǥ���� Pattern�� Matcher ���
		Pattern pwPattern = Pattern.compile("(?=.*[a-zA-ZS])(?=.*?[#?!@$%^&*-]).{9,19}");
		Matcher pwMatcher = pwPattern.matcher(password);

		if (!pwMatcher.matches()) {
			System.out.println("�߸��� �Է��Դϴ�.");
		} else if (password.length() < 10) {
			System.out.println("�߸��� �Է��Դϴ�");
		}else {
			System.out.println("ȯ���մϴ� " + name + " ����");
		}
		member[membercount++] = new Member(name, id, password); // ȸ�������� �����ϴ� �迭�� ���ǿ� �°� ������ �̸�, ���̵�, ��й�ȣ�� ����
	
	}

	public boolean ID(String id) { // ���̵� ������ �� ������ �ִ� ���̵����� �ƴ��� �����ϴ� �޼ҵ� �ʿ�
		boolean same = false;
		for (int i = 0; i < membercount; i++) {
			if (member[i].getId().equals(id)) {
				same = true;
			}
		}
		return same;
	}
	
	// ���� ������ ���� �޼ҵ�
	public void accounts() { 
		System.out.println("������ ���Ͻô� ���¹�ȣ�� �Է����ּ���");
		System.out.println("���¹�ȣ ���� : 111 - @@@@");
		System.out.print("111 - ");
		String anum = "111 -" + scanner.nextLine(); // ����ڰ� ���� �� �ֵ��� �⺻������ ��������
		if (ANUM(anum)) {
			System.out.println("�̹� �����ϴ� ���¹�ȣ�Դϴ�");
			menu();
		}else {
			System.out.println("���������� ���¹�ȣ�� �����Ǿ����ϴ�");
		}
		System.out.println("������ ���Ͻô� ��й�ȣ�� �Է����ּ���(4�ڸ� ����)");
		String apassword = scanner.nextLine();
		
		if (apassword.length() > 4) {
			System.out.println("�߸��� �Է��Դϴ�");
		} else if (apassword.length() < 4) {
			System.out.println("�߸��� �Է��Դϴ�");
		} else {
			
			account[accountcount++] = new Account(anum, apassword); // ������ ������ �����ϴ� �迭�� ���ǿ� �°� ������ ���¹�ȣ�� ���º�й�ȣ�� ����
			System.out.println("������ ���°� ���������� �����Ǿ����ϴ�");
		}
	}

	public boolean ANUM(String anum) { // ���¹�ȣ�� ���̵�� ���������� ������ �����ϴ� ���� �� ���� ���¹�ȣ�� �ִ��� Ȯ���ϴ� �޼ҵ� �ʿ�
		boolean same2 = false;
		for (int i = 0; i < accountcount; i++) {
			if (account[i].getAnum().equals(anum)) {
				same2 = true;
			}
		}
		return same2;
	}

	// �α׾ƿ� �޼ҵ�
	public void logout() {
		out = -1;
		System.out.println("�α׾ƿ� �Ǿ����ϴ�");
	}

	// �α��� �޼ҵ�
	public boolean login(String id, String password) {
		boolean accvalue = false;
		for (int i = 0; i < membercount; i++) {
			if (member[i].success(id, password)) {
				accvalue = true;
				out = i;
				break; // for���� ���� break��
			}
		}
		return accvalue;
	} // ���� out�� ���� -1�� ��� �α׾ƿ� �ƴ� ���� �α��� �ȴ�

	public Account Access(String anum, String apassword) {
		
		for (int i = 0; i < accountcount; i++) {
			if (account[i].correct(anum, apassword)) {
				return account[i];
			}
		}
		return null;
	}
	
	// ������ ������ ����ڿ��� �����ֱ� ���� �޼ҵ�
	public void Bdisplay() {
		System.out.println(bankname);
		System.out.println("���� ���Ե� ���� �� : " + membercount);
	}
	
	// �α����� ȸ���� ���� ������ �����ִ� �޼ҵ�
	public void Mdisplay() {
		System.out.println("ȸ������");

		for (int i = 0; i < membercount; i++) {
			member[i].memberdisplay();
		}

		System.out.println("�����ϰ� �ִ� ������ ���� : " + accountcount);

		for (int i = 0; i < accountcount; i++) {
			account[i].accountdisplay();
		}	
	}
	
	// ����� ������ ����ڿ��� �����ֱ� ���� �޼ҵ�
	public void Adisplay() {
		System.out.println("����� ����");

		for (int i = 0; i < accountcount; i++) {
			account[i].accountdisplay();
		}
	}

	// �޴� �޼ҵ�
	public void menu() {
		boolean running = true; // while���� ���� �� �ֵ��� �ϱ� ���� ������ booleanŸ�� ����
		String choice = null; // �޴������� �� �� �ֵ��� �ϱ� ���� ������ ����

		while (running) { // while���� ����Ͽ� ����ؼ� �޴��� ����� �� �ֵ��� ��
			System.out.println("�ݰ����ϴ� ���� ���Ͻô� �޴��� �������ּ���");
			System.out.println("1. ȸ������ 2.�������� 3.�α���(ȸ��������ȸ) 4.�α׾ƿ� 5.���°��� 6.�Ա� 7.��� 8.ȸ��Ż�� 9.����");
			choice = scanner.nextLine();
			switch (choice) { // �޴��� �����Ͽ��� ��쿡 �޴����� �ٸ� �޼ҵ���� ����� �� �ֵ��� switch case�� ���
			case "1":
				members();
				break;
			case "2":
				Bdisplay();
				break;
			case "3":
				System.out.println("ID > ");
				String id = scanner.nextLine();
				System.out.println("PASSWORD > ");
				String password = scanner.nextLine();
				
				if (login(id, password)) {
					System.out.println("�α��� �Ǿ����ϴ�");
					Mdisplay();
				} else {
					System.out.println("�߸��� ���̵� ��й�ȣ�� �Է��ϼ̽��ϴ�");
				}
				
				break;
			case "4":
				logout();
				break;
			case "5":
				accounts();
				break;
			case "6":
				System.out.println("�Ա� �� ���¹�ȣ > ");
				System.out.print("111 - ");
				String anum = "111 -" + scanner.nextLine();
				System.out.println("���� ��й�ȣ > ");
				String apassword = scanner.nextLine();
				Account account = Access(anum,apassword);
				
				if(account != null) { // ���¹�ȣ�� ���º�й�ȣ�� �´ٸ� �Ա��� �� �ֵ��� ��
					System.out.println("�Ա��� �ݾ��� �Է��ϼ��� > ");
					int Pmoney = Integer.parseInt(scanner.nextLine());  
					account.plus(Pmoney);
				}else {
					System.out.println("�߸��� �Է��Դϴ�");
				}
				
				Adisplay();
				break;
			case "7":
				System.out.println("��� �� ���¹�ȣ > ");
				System.out.print("111 - ");
				anum = "111 -" + scanner.nextLine();
				System.out.println("���� ��й�ȣ > ");
				apassword = scanner.nextLine();
				account = Access(anum,apassword);
				
				if(account != null) {
					System.out.println("����� �ݾ��� �Է��ϼ��� > ");
					int Mmoney = Integer.parseInt(scanner.nextLine());
					int Rmoney = 0;
					Rmoney = account.getMoney();
					
					if(Mmoney > Rmoney) { // �ܾ��� ������ ��� ����� ���� �ʰ� "�ܾ��� �����մϴ�"��� ������ �� �� �ֵ��� ��
						System.out.println("�ܾ��� �����մϴ�");
					}else {
						account.minus(Mmoney);
					}
				}else {
					System.out.println("�߸��� �Է��Դϴ�");
				}
				
				Adisplay();
				break;
			case "8":
				if(out != -1) {
					System.out.println("��й�ȣ�� �Է��ϼ���");
					password = scanner.nextLine();
					delete(password);
				}else {
					System.out.println("�α��� �ϼ���");
				}
				break;
			case "9":
				System.out.println("�̿����ּż� �����մϴ�");
				running = false;  
				break;
			}

		}

	}
	
	// �������� �޼ҵ�
	private void delete(String password) { // �α����� �� ������ �� ��й�ȣ�� Ȯ���ϰ� ������ �� �ְ� ��
		delete(member[out].getId(),password);		
	}
	
	private void delete(String id, String password) { // �α����� ���� ���� ��� ���̵�� ��й�ȣ�� ���� Ȯ���ϰ� ������ �� �ְ� ��
		boolean del = false;
		for(int i = 0; i < membercount; i++) {
		if(member[i].success(id, password)) {
			out = i;
			del = true;
			break;
		   }
	   }
		if(del = true) { // ���̵�� ��й�ȣ�� ������ ����
			for(int i = out; i + 1 < membercount; i++) {
				member[i] = member[i+1]; 
			}
				membercount--; 
				out = -1; // ������ �����ϸ� ���������� �α׾ƿ��� �ž� �ϱ� ������ out = -1�� �̿�
				System.out.println("������ �����Ǿ����ϴ�");
			}
			else {
				System.out.println("�������� �� �߽��ϴ�");
			}
		}	
}