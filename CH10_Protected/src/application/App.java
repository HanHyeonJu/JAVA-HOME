package application;

import entities.Apple;
import entities.Banana;
import entities.Fruit;

public class App {

	public static void main(String[] args) {
		// �ٸ� ��Ű���� Ŭ�������� import�� �ҷ��´�.
		Fruit fruit1 = new Apple();
		//fruit1.id = 10; // protected �޼ҵ�� id�� �����߱� ������ �ٸ� ��Ű�������� ����, ��� �Ұ����ϴ�. 
		System.out.println(fruit1);
		
		Fruit fruit2 = new Banana();
		System.out.println(fruit2);

	}

}
