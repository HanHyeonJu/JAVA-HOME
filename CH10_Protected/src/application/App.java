package application;

import entities.Apple;
import entities.Banana;
import entities.Fruit;

public class App {

	public static void main(String[] args) {
		// 다름 패키지의 클래스들을 import로 불러온다.
		Fruit fruit1 = new Apple();
		//fruit1.id = 10; // protected 메소드로 id를 생성했기 때문에 다른 패키지에서는 수정, 사용 불가능하다. 
		System.out.println(fruit1);
		
		Fruit fruit2 = new Banana();
		System.out.println(fruit2);

	}

}
