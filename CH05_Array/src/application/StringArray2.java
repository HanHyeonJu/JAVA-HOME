package application;

public class StringArray2 {

	public static void main(String[] args) {
		// String�� �⺻ �ڷ����� �ƴ� ���� �ڷ���, ���� ������ �⺻������ �ּҰ��� ����	
		String text = null; // ���� ���������� �ּҰ��� ����
		text = "��ο�!";
		System.out.println(text);
		
		String[] texts = null;
		System.out.println(texts);
		texts = new String[3];
		System.out.println(texts); // ���� �ƴ� �ּҰ� ���
		
		System.out.println();
		
		// new Ű����� �迭�� ��������� ������ �迭 ���� ���� ���� �� �־���
		texts[0] = "����!"; // text[0] = new String("����!")��� �ص� ������ �տ� new Ű����� ����� ���� ���� �ֱ� ������ �� �ص� �ǈf����
		texts[1] = "�� ��?";
		texts[2] = "�� ����!";
		
		// for each��		
		for(String word : texts) {
			System.out.println(word);
		}
	}

}
