package getterSetter;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("���");
		p1.setAge(7);
		
		//p1.name = "���" - �̷��� ���������� �������� ���� ������
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		Person p2 = new Person();
		p2.setName("����");
		p2.setAge(12);
		
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		
			
	}

}
