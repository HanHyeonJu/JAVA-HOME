package application;

public class App {

	public static void main(String[] args) {
		// 영어단어를 맞히는 게임
		// 행맨 객체를 생성할 게임 run
		Hangman game = new Hangman();
		game.run();
		game.close(); // 왜 굳이 close객체를 만들어야 하는지? 그냥 scanner종료 시키면 안 되는지?

	}

}
