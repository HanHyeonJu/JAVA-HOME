package arrayList;

import java.util.ArrayList;

public class Custom_Object {

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<>(); // PersonŬ���� Ÿ�� ArrayList
		
		Person p1 = new Person("���");
		Person p2 = new Person("�浿");
		people.add(p1);
		people.add(p2); // 1. Person�� ��ü ���� �� ��ü�� ArrayList people�� �Է��ϱ�
		people.add(new Person("���̾�"));
		people.add(new Person("�Ѹ�")); // 2. ��ü�� �����ϴ� ���ÿ� �Է��ϱ�
		
		people.forEach(System.out::println);
				
	}

}
