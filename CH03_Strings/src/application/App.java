package application;

public class App {

	public static void main(String[] args) {
		// String ���ڿ��� �⺻�ڷ�Ÿ���� �ƴ϶� Ŭ�����̴�.
		int cats = 7;
		double height = 1.8;
		String name = "ȫ�浿";
		
		System.out.println(name);
		
		// ���ڿ� ���ϱ�(+) ���
		String text = "���� �̸��� : ";
		String endOfSentence = ".";
		
		String text2 = "����� �̸� : ";
	    String endOfSentence2 =".";
	    
	    String text3 = "���� Ű : ";
	    String endOfSentence3 =".";
		
		System.out.println(text + name + endOfSentence);
		System.out.println(text2 + cats + endOfSentence2);
		System.out.println(text3 + height + endOfSentence3);

	}

}
