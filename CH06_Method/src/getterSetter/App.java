package getterSetter;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("펭수");
		p1.setAge(7);
		
		//p1.name = "펭수" - 이렇게 직접적으로 접근하지 못함 오류남
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		Person p2 = new Person();
		p2.setName("밤톨");
		p2.setAge(12);
		
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		
			
	}

}
