package arrayList;

public class Person implements Comparable<Person>{
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name); 
	}
}// Person 클래스는 문자열타입의 name변수를 return 하는 클래스인거(?)
