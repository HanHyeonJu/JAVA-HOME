package application;

import game.Game; // 다른 패키지에 있는 클래스도 import해서 이 클래스를 실행시킬 다른 패키지에 있는 클래스에 객체 생성 가능 

public class App {

	public static void main(String[] args) {
//		Game game = new Game();
//		game.run();
		new Game().run(); // 간략하게 수정
	}

}
