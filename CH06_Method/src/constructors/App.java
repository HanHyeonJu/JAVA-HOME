package constructors;

public class App {

	public static void main(String[] args) {
		// ������ �޼ҵ�� ��ü�� ������ �� ���
		Person p1 = new Person();
		p1.setName("���");
		p1.setHeight(199.9);
		Person p2 = new Person();
		p2.setName("�浿");
		p2.setHeight(170.3);
		Person p3 = new Person();
		p3.setName("���̾�");
		p3.setHeight(30.15);
		
		System.out.println(p1.getName());
		System.out.println(p1.getHeight());
		System.out.println(p2.getName());
		System.out.println(p2.getHeight());
		System.out.println(p3.getName());
		System.out.println(p3.getHeight());
		
		// �״ϱ� ��ü�� �����ϸ� �ٸ� �޼ҵ���� ������ �͸�ŭ ������ �޼ҵ� Public Person(){}�� �����

	}

}
