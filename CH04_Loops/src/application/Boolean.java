package application;

public class Boolean {

	public static void main(String[] args) {
		// 불린 타입은 참, 거짓(true, false)
		boolean condition1 = false;
		
		System.out.println("조건1: "+condition1);
		
		boolean condition2 = 4 > 5;
		System.out.println("조건2: "+condition2);
		
		boolean condition3 = 2 < 10;
		System.out.println("조건3 :"+condition3);
		
		boolean condition = 9 == 10;
		System.out.println("조건4: "+condition);
		System.out.printf("조건4: %b", condition);
		
	}

}
