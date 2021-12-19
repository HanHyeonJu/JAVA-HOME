package application;

import java.util.Scanner;

public class Hangman {
	// 행맨게임 요소들(?)
	private boolean running = true; // 게임을 계속 진행할 것인가 아닌가를 boolean타입으로 선언
	//RndomWord클래스를 사용하기 위한 객체 생성
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in); // 사용자가 문자를 입력할 수 있게 Scanner 사용
	

	// 프로그램을 실행시킬 메소드
	public void run() { // 프로그램 시작 => 반복
		do {
			displayWord(); // 화면에 단어 표시
			getUserInput(); // 입력받을 단어
			checkUserInput(); // 단어가 맞는지 체크 => 맞으면 running이 false가 되면서 게임 종료
		} while (running); // running이 false가 되면 반복 종료
	}
	
	public void displayWord() {
		//System.out.println("단어보이기");
		// 랜덤워드 객체를 생성해 랜덤으로 한 단어 출력
		System.out.println(word.toString());
	}

	public void getUserInput() {
		/*유저에게 한 문자 입력 요구, 입력받은 문자열에서 한 문자를 뽑아
		 * RandomWord 클래스에 전달??
		 */
		System.out.println("한 문자 입력 : ");
		String guess = scanner.nextLine(); // 입력받은 문자 guess에 저장
		word.addGuess(guess.charAt(0)); // 첫번째 문자 입력
	}
	
	public void checkUserInput() {
		// System.out.println("맞는지 체크");
		// 유저가 단어를 다 맞췄는지 체크해서 게임 종료
		if(word.isCompleted()) {
			System.out.println("잘 맞췄어요!");
			System.out.println("정답은 : "+word.toString());
			running = false; //do while 반복문 빠져나오게 함
		}
	}
	public void close() {
		scanner.close();
	}

} // 순서 중요 display -> getUSer -> checkUSer
