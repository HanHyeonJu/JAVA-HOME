package constructors;

public class App {

	public static void main(String[] args) {
		// 생성자 메소드는 객체를 생성할 때 사용
		Person p1 = new Person();
		p1.setName("펭수");
		p1.setHeight(199.9);
		Person p2 = new Person();
		p2.setName("길동");
		p2.setHeight(170.3);
		Person p3 = new Person();
		p3.setName("라이언");
		p3.setHeight(30.15);
		
		System.out.println(p1.getName());
		System.out.println(p1.getHeight());
		System.out.println(p2.getName());
		System.out.println(p2.getHeight());
		System.out.println(p3.getName());
		System.out.println(p3.getHeight());
		
		// 그니까 객체를 생성하면 다른 메소드들을 실행한 것만큼 생성자 메소드 Public Person(){}이 실행됨

	}

}
