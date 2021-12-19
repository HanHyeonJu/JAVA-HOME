package toString;

public class App {

	public static void main(String[] args) {
		// 생성자 메소드는 객체를 생성할 때 사용
		// 생성자의 매개변수에 따라 입력
		Person p1 = new Person("펭수", 120.0);
		Person p2 = new Person("길동", 172.5);
		Person p3 = new Person("라이언", 165.3);
			
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		// 그니까 객체를 생성하면 다른 메소드들을 실행한 것만큼 생성자 메소드 Public Person(){}이 실행됨

		Person p4 = new Person();
		System.out.printf("%s의 키는 %.1f이다.\n", p4.getName(),p4.getHeight());
		System.out.println(p4.toString());
	}

}
