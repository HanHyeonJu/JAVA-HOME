package returnValues;

public class App {

	public static void main(String[] args) {
		ReturnValue value = new ReturnValue();
		value.getAnimal();
		value.getAnimal();
		
		String cat = value.animal(); // value.animal()�� ���� ���� cat�� ������
		System.out.println("Ĺ ������ : "+cat);

	}

}
