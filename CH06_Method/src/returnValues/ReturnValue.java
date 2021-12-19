package returnValues;

public class ReturnValue {
	// 메소드 리턴
	void getAnimal() {
		System.out.println("고양이를 리턴합니다.");
	}
	
	String animal() {
		System.out.println("고양이를 리턴합니다.");
		return "고양이";
	}
}
