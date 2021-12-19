package application;

public class App {

	public static void main(String[] args) {
		// 행맨 게임의 객체 생성, 게임 run
		Hangman game = new Hangman(); // 행맨클래스에 대한 객체생성
		game.run();
		game.close();
	}

}
