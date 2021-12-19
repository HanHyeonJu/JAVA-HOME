package getterSetter;

public class Person {
	// 인스턴스 변수를 private 타입(?)으로 지정하면 변수에 직접적인 접근이 불가능함, 이 때 get set함수를 사용
	private String name;
	private int age;
	
	//get, set 메소드로 인스턴스 변수에 접근
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; //this는 인스턴스 변수를 나타낸다.
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
