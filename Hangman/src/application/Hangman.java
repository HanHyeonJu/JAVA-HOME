package application;

import java.util.Scanner;

public class Hangman {
	private boolean running = true; // ������ �����Ͻðڽ��ϱ�?
	private RandomWord word = new RandomWord(); // ���� Ŭ������ �������� ����
	private Scanner scanner = new Scanner(System.in); // ����ڰ� �ܾ ���߱� ���� �Է�
	private int remainTries = 7; // �õ�Ƚ��
	private char lastGuess; // �����Է¹���(?)
		
	// �޼ҵ� �Լ� run �����
	public void run() { // ���α׷� ���� => �ݺ�
		do {
			displayWord(); // ȭ�鿡 ǥ��
			getUserInput(); // �Է¹���
			checkUserInput(); // �´��� üũ => ������ running = false�� �Ǿ ��������
		}while(running); // ������ ������ ���� �ݺ��Ǵ� �ݺ���	
	}

	private void checkUserInput() {
		// ������ �ܾ �� ������� üũ�ؼ� ���� ����
		// ���� ���� Ȯ���� �ϴ� �޼ҵ� isComplete�� RandomWord Ŭ������ �����
		// ö�ڰ� �ϳ� Ʋ�� ������ �õ�Ƚ�� ���� ������ Ƚ��(7)��ŭ Ʋ���� ���ӿ���
		boolean isCorrect = word.addGuess(lastGuess);
		
		if(isCorrect) {
		if(word.isCompleted()) { 
			System.out.println("�� ������!");
			System.out.println("�õ�Ƚ�� : "+remainTries);
			System.out.println("������ : +word");
			running = false; // ���� ��쿡 running�� false�� ���� ��������
		}
		}
		else { 
			remainTries--; // �ܾ ���� ������ remainTries ����
			if(remainTries == 0) {
				System.out.println("Game Over");
				running = false; // ���� �� �ִ� Ƚ���� �ʰ��Ͽ� ����
			}
			
		}
		}

	private void getUserInput() {
		// �������� �� ���� �Է� �䱸
		// �Է¹��� ���ڿ����� �� ���ڸ� �̾Ƽ� RandomWord Ŭ������ ����(addGuess �޼ҵ� �̿�)
		System.out.print("�� ���� �Է� : ");
		String guess = scanner.nextLine();
		//word.addGuess(guess.charAt(0)); // ????????
		lastGuess = guess.charAt(0); // ??????
	}
	
	private void displayWord() {
		// ���� ���� ��ü�� ������ �������� �� �ܾ ���
		System.out.println(word.toString());		
	}
	
	public void close() {
		//���� ����, ��ĳ�� �ݱ�
		scanner.close();
	}
	
}
