package inheritance;

public class App {

	public static void main(String[] args) {
		// ���� ������ ��ӹ���
		Animal animal = new Animal();
		animal.eat();
		
		Bird bird1 = new Bird();
		bird1.eat(); // ����Ŭ�������� ��ӹ���, �׷��� bird��ü�ε� ��°���
		bird1.fly();

	}

}
