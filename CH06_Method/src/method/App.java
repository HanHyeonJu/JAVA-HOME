package method;

public class App {

	public static void main(String[] args) {
		// 같은 패키지에 있는 Person 클래스는 바로 사용 가능
		// 세상의 모든 사물은 객체, new 클래스()로 메모리에 새로운 객체 생성
		Person p1 = new Person();
		
		System.out.println(p1.name); // String(참조자료형) null 초기화
		System.out.println(p1.age); // int(기본자료형) 0 초기화
		p1.sayHello();
		
		p1.name = "펭수";
		p1.age = 7;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		Person p2 = new Person();
		p2.name = "길동";
		p2.sayHello();
		
		Person p3 = new Person();
		p3.name = "라이언";
		p3.sayHello();

	}

}
