package application;

public class App {

	public static void main(String[] args) {
		// ����ܾ ������ ����
		// ��� ��ü�� ������ ���� run
		Hangman game = new Hangman();
		game.run();
		game.close(); // �� ���� close��ü�� ������ �ϴ���? �׳� scanner���� ��Ű�� �� �Ǵ���?

	}

}
