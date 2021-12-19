package application;

import java.util.Scanner;

public class Hangman {
	private boolean running = true; // 게임을 진행하시겠습니까?
	private RandomWord word = new RandomWord(); // 랜덤 클래스를 가져오기 위함
	private Scanner scanner = new Scanner(System.in); // 사용자가 단어를 맞추기 위해 입력
	private int remainTries = 7; // 시도횟수
	private char lastGuess; // 유저입력문자(?)
		
	// 메소드 함수 run 만들기
	public void run() { // 프로그램 시작 => 반복
		do {
			displayWord(); // 화면에 표시
			getUserInput(); // 입력받음
			checkUserInput(); // 맞는지 체크 => 맞으면 running = false가 되어서 게임종료
		}while(running); // 게임을 진행할 동안 반복되는 반복문	
	}

	private void checkUserInput() {
		// 유저가 단어를 다 맞췄는지 체크해서 게임 종료
		// 게임 종료 확인을 하는 메소드 isComplete를 RandomWord 클래스에 만들기
		// 철자가 하나 틀릴 때마다 시도횟수 차감 정해진 횟수(7)만큼 틀리면 게임오버
		boolean isCorrect = word.addGuess(lastGuess);
		
		if(isCorrect) {
		if(word.isCompleted()) { 
			System.out.println("잘 맞췄어요!");
			System.out.println("시도횟수 : "+remainTries);
			System.out.println("정답은 : +word");
			running = false; // 맞춘 경우에 running을 false로 만들어서 게임종료
		}
		}
		else { 
			remainTries--; // 단어가 맞지 않으면 remainTries 감소
			if(remainTries == 0) {
				System.out.println("Game Over");
				running = false; // 맞힐 수 있는 횟수를 초과하여 종료
			}
			
		}
		}

	private void getUserInput() {
		// 유저에게 한 문자 입력 요구
		// 입력받은 문자열에서 한 문자를 뽑아서 RandomWord 클래스에 전달(addGuess 메소드 이용)
		System.out.print("한 문자 입력 : ");
		String guess = scanner.nextLine();
		//word.addGuess(guess.charAt(0)); // ????????
		lastGuess = guess.charAt(0); // ??????
	}
	
	private void displayWord() {
		// 랜덤 워드 객체를 생성해 랜덤으로 한 단어를 출력
		System.out.println(word.toString());		
	}
	
	public void close() {
		//게임 종료, 스캐너 닫기
		scanner.close();
	}
	
}
