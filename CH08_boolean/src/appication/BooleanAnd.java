package appication;

public class BooleanAnd {

	public static void main(String[] args) {
		// ==, !=, !, &&, ||
		
		boolean isRaining = false; // �� ���°�?
		boolean haveUmbrella = true; // ����� ������ �ִ°�?
		
		boolean takeUmbrella = false;// ����� ����?
		
		//1
		if(isRaining) { // false
			if(haveUmbrella) { // true 
				takeUmbrella = true;
			}//??????????
		}
		System.out.println("ù��° : "+takeUmbrella); // &&
		
		//2
		if(isRaining && haveUmbrella) {
			takeUmbrella = true;
		} 
		System.out.println("�ι�° : "+takeUmbrella);
		
		//3
		takeUmbrella = isRaining && haveUmbrella ? true : false;
		System.out.println("����° : "+takeUmbrella);

	}

}
