package method;

public class App {

	public static void main(String[] args) {
		// ���� ��Ű���� �ִ� Person Ŭ������ �ٷ� ��� ����
		// ������ ��� �繰�� ��ü, new Ŭ����()�� �޸𸮿� ���ο� ��ü ����
		Person p1 = new Person();
		
		System.out.println(p1.name); // String(�����ڷ���) null �ʱ�ȭ
		System.out.println(p1.age); // int(�⺻�ڷ���) 0 �ʱ�ȭ
		p1.sayHello();
		
		p1.name = "���";
		p1.age = 7;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		Person p2 = new Person();
		p2.name = "�浿";
		p2.sayHello();
		
		Person p3 = new Person();
		p3.name = "���̾�";
		p3.sayHello();

	}

}
