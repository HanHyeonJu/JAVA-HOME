package application;

public class For {

	public static void main(String[] args) {
		// for 반복문 for(초기값;조건;증감){명령문;}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("i: "+i);
		}
		
		int sum = 0;
		for(int p = 1; p <= 100; p++) {
			sum = sum + p;
		}
		System.out.println(sum);
	}

}
