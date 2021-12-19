package application;

import java.util.Random; // ?

public class RandomWord {
	// �������� �ܾ �̾Ƴ� Ŭ����
	// �ܾ���� ������ ���ڿ��� ����
	private String books = "motivation waterfall conscious recognize constitutional transform assumption romantic established attachment hilarious omission plagiarize incident dictionary advocate question destruction productive rhetoric arrogant reconcile statement baseball nominate restless willpower premature negotiation commitment fisherman character determine intermediate marketing greeting fragrant requirement football influence chocolate sickness rotation announcement profession first-hand illusion settlement grandfather constituency";
	// ���ڿ��� split�� �̿��� �����̽� ��� �κ��� �������� �и����� String Ÿ���� words��� �迭�� ����
	private String[] words = books.split(" ");
	private String selectWord; // ������ �� �ϳ��� �ܾ�(�������� ����)

	private char[] characters; // ���� �迭(ö�ڸ� ���߸� �� ���� ����)
	private Random random = new Random(); // ?

	public RandomWord() {
		// selectWord = words[1]; //1. �̷��� �״�� ���θ� selectWord�� �⺻���� words�迭�� 1�� �ܾ �Ǵµ�
		// �׷��� ���߿� random���� ������ ������ ����
		selectWord = words[random.nextInt(words.length)]; // words�迭�� ũ�⸸ŭ random���� �ƹ� ��ȣ�� ������ �ؼ� words�� �ܾ�� �� ��������
															// selectWord�� �����ϰ� ��
		characters = new char[selectWord.length()]; // ������ ���� �ܾ ���� �� �ܾ��� ���̸� character�� �迭 ũ��� ������
	}

	public void getWords() {
		for (String word : words) {
			System.out.println(word);
		} // word��� ������ words�迭�� �ִ� �ܾ���� �ϳ��ϳ� ����ϰ� ��
	}

	public String toString() {
		// return selectWord; //1. �������� ���� �ܾ return �޾Ƽ� ���
		// 2. String text = ""; // 3. text�� �ϳ��� �ܾ�?�� ����ϱ� ���ؼ� ����
		StringBuilder sb = new StringBuilder(); // ������ ���ڸ� ������(?)
		for (char c : characters) {
			if (c == '\u0000') { // ��������u0000�� ������ �ʱⰪ(0 �Ǵ� null), ������ �ʱⰪ�̸� ���� �ܾ ������ ���ߴٴ� ��
				// text += '_';
				sb.append('_');
			} else {
				sb.append(c); // ���ڰ� ������ _ ���� �ܾ ���
			}
			sb.append(' '); // �ϳ��� �� ���̰� ��
			// if���� �� ���� ���׿����ڷ� �ٲ� �� ����
			// sb.append(c=='\u0000'? '_' : c); ���� c�� ������ �ʱⰪ�̸� _�� �ƴϸ� ���ڸ� ����϶�� ��
			// sb.append(' ');
		}
		// System.out.println(selectWord); // �� ���߸� SelectWord�� ���̰� ��
		// return text; // ����ڰ� �Է��� �ϳ��� ���� text�� return��
		return sb.toString(); // text�� StringBuilder�� sb�� �����ؼ� ���õ� ���� �ܾ ������
	}

	public void addGuess(char c) {
		for (int i = 0; i < selectWord.length(); i++) {
			if (c == selectWord.charAt(i)) {
				characters[i] = c;
			} // ö�ڰ� �¾Ƽ� c�� �Ѿ�� ���ڸ� �˻��� ���� �ܾ ������ characters �迭�� ������� ����, �ܾ��� ���̸�ŭ �ݺ�
		}
	}

	// ������ ��� running���� false���� üũ�� �ڵ�
	public boolean isCompleted() {
		for (char c : characters) {
			if (c == '\u0000') {
					return false; // c���� �ʱⰪ�� ���Դٴ� �� ���� ����� �� ���ڰ� ����
			}
		}
		return true; // �� ����
	}
}
		
	
	
