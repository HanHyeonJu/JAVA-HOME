package application;

public class App {

	public static void main(String[] args) {
		// String 문자열을 기본자료타입이 아니라 클래스이다.
		int cats = 7;
		double height = 1.8;
		String name = "홍길동";
		
		System.out.println(name);
		
		// 문자열 더하기(+) 출력
		String text = "나의 이름은 : ";
		String endOfSentence = ".";
		
		String text2 = "고양이 이름 : ";
	    String endOfSentence2 =".";
	    
	    String text3 = "나의 키 : ";
	    String endOfSentence3 =".";
		
		System.out.println(text + name + endOfSentence);
		System.out.println(text2 + cats + endOfSentence2);
		System.out.println(text3 + height + endOfSentence3);

	}

}
