package application;

import java.util.Scanner;

public class Hangman {
	// ��ǰ��� ��ҵ�(?)
	private boolean running = true; // ������ ��� ������ ���ΰ� �ƴѰ��� booleanŸ������ ����
	//RndomWordŬ������ ����ϱ� ���� ��ü ����
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in); // ����ڰ� ���ڸ� �Է��� �� �ְ� Scanner ���
	

	// ���α׷��� �����ų �޼ҵ�
	public void run() { // ���α׷� ���� => �ݺ�
		do {
			displayWord(); // ȭ�鿡 �ܾ� ǥ��
			getUserInput(); // �Է¹��� �ܾ�
			checkUserInput(); // �ܾ �´��� üũ => ������ running�� false�� �Ǹ鼭 ���� ����
		} while (running); // running�� false�� �Ǹ� �ݺ� ����
	}
	
	public void displayWord() {
		//System.out.println("�ܾ�̱�");
		// �������� ��ü�� ������ �������� �� �ܾ� ���
		System.out.println(word.toString());
	}

	public void getUserInput() {
		/*�������� �� ���� �Է� �䱸, �Է¹��� ���ڿ����� �� ���ڸ� �̾�
		 * RandomWord Ŭ������ ����??
		 */
		System.out.println("�� ���� �Է� : ");
		String guess = scanner.nextLine(); // �Է¹��� ���� guess�� ����
		word.addGuess(guess.charAt(0)); // ù��° ���� �Է�
	}
	
	public void checkUserInput() {
		// System.out.println("�´��� üũ");
		// ������ �ܾ �� ������� üũ�ؼ� ���� ����
		if(word.isCompleted()) {
			System.out.println("�� ������!");
			System.out.println("������ : "+word.toString());
			running = false; //do while �ݺ��� ���������� ��
		}
	}
	public void close() {
		scanner.close();
	}

} // ���� �߿� display -> getUSer -> checkUSer
