package returnValues;

public class App {

	public static void main(String[] args) {
		ReturnValue value = new ReturnValue();
		value.getAnimal();
		value.getAnimal();
		
		String cat = value.animal(); // value.animal()의 리턴 값을 cat에 대입함
		System.out.println("캣 변수는 : "+cat);

	}

}
