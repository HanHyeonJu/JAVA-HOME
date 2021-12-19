package arrayList;

import java.util.ArrayList;

public class Custom_Object {

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<>(); // Person클래스 타입 ArrayList
		
		Person p1 = new Person("펭수");
		Person p2 = new Person("길동");
		people.add(p1);
		people.add(p2); // 1. Person의 객체 생성 후 객체를 ArrayList people에 입력하기
		people.add(new Person("라이언"));
		people.add(new Person("둘리")); // 2. 객체를 생성하는 동시에 입력하기
		
		people.forEach(System.out::println);
				
	}

}
