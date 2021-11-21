package application;

public class StringArray2 {

	public static void main(String[] args) {
		// String은 기본 자료형이 아닌 참조 자료형, 참조 변수는 기본적으로 주소값을 가짐	
		String text = null; // 널은 참조변수에 주소값이 없음
		text = "헬로우!";
		System.out.println(text);
		
		String[] texts = null;
		System.out.println(texts);
		texts = new String[3];
		System.out.println(texts); // 값이 아닌 주소가 출력
		
		System.out.println();
		
		// new 키워드로 배열을 생성해줬기 때문에 배열 안의 값을 넣을 수 있었음
		texts[0] = "하이!"; // text[0] = new String("하이!")라고 해도 되지만 앞에 new 키워드로 만들어 놓은 것이 있기 때문에 안 해도 되늗듯함
		texts[1] = "안 녕?";
		texts[2] = "굿 바이!";
		
		// for each문		
		for(String word : texts) {
			System.out.println(word);
		}
	}

}
