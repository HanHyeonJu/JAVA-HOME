package inheritance;

public class App {

	public static void main(String[] args) {
		// 새는 동물을 상속받음
		Animal animal = new Animal();
		animal.eat();
		
		Bird bird1 = new Bird();
		bird1.eat(); // 동물클래스에서 상속받음, 그래서 bird객체로도 출력가능
		bird1.fly();

	}

}
