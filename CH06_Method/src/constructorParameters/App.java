package constructorParameters;

public class App {

	public static void main(String[] args) {
		// ������ �޼ҵ�� ��ü�� ������ �� ���
		// �������� �Ű������� ���� �Է�
		Person p1 = new Person("���", 120.0);
		Person p2 = new Person("�浿", 172.5);
		Person p3 = new Person("���̾�", 165.3);
			
		System.out.println(p1.getName());
		System.out.println(p1.getHeight());
		System.out.println(p2.getName());
		System.out.println(p2.getHeight());
		System.out.println(p3.getName());
		System.out.println(p3.getHeight());
		
		// �״ϱ� ��ü�� �����ϸ� �ٸ� �޼ҵ���� ������ �͸�ŭ ������ �޼ҵ� Public Person(){}�� �����

		Person p4 = new Person();
		System.out.printf("%s�� Ű�� %.1f�̴�.", p4.getName(),p4.getHeight());
		
	}

}
