package school;

public class App {

	public static void main(String[] args) {
		// 1. ���� 2. ������ 3. ���ͼ��� 4. toString
		Student s1 = new Student("���", 7);
		Student s2 = new Student("����", 7);
		Student s3 = new Student("����", 7);
		Student s4 = new Student("��ġ", 7);
		
		s1.setIsVisible(false); // ����� ����
		s2.setTemperature(36.2); // ���� �� üũ�ߴ��� �µ� 36.2
		s3.setTemperature(35.6);
		s4.setIsVisible(false);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		
		
		
		

	}

}
