package toString;

public class App {

	public static void main(String[] args) {
		// ������ �޼ҵ�� ��ü�� ������ �� ���
		// �������� �Ű������� ���� �Է�
		Person p1 = new Person("���", 120.0);
		Person p2 = new Person("�浿", 172.5);
		Person p3 = new Person("���̾�", 165.3);
			
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		// �״ϱ� ��ü�� �����ϸ� �ٸ� �޼ҵ���� ������ �͸�ŭ ������ �޼ҵ� Public Person(){}�� �����

		Person p4 = new Person();
		System.out.printf("%s�� Ű�� %.1f�̴�.\n", p4.getName(),p4.getHeight());
		System.out.println(p4.toString());
	}

}
