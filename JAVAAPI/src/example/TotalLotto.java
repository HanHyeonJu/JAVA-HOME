package example;

import java.util.Random;

class LottoMachine {
	private int[] LottoNumbers;

	public LottoMachine() {
		// �޼ҵ带 �̿��ؼ� �ζ� ��ȣ ����
		LottoNumbers = generate();
	}

	private int[] generate() {
		int[] pickedNumbers = new int[6];
		Random rand = new Random();

		// pickedNumbers�� 6���� ������ ���ڸ� �����
		for (int i = 0; i < 6; i++) {
			pickedNumbers[i] = rand.nextInt(45) + 1;
		} // Random rand�� �̿��ؿ� 45���� ������ random���� pickedNumbers�� 6���� ���ڸ� ����

		return pickedNumbers; // pickedNumbers�� for���� �̿��ؼ� ������ ���ڵ��� return
	}

	public int[] getLottoNumbers() {
		return LottoNumbers;
	} // LottoMachine ��ü�� LottoNumbers�� ������ ������ �� �ְ� get �޼ҵ� ����
}

public class TotalLotto {

	public static void main(String[] args) {
		// ��ü ����
		LottoMachine machine = new LottoMachine();

		// �ζ� ��ȣ ��������
		int[] numbers = machine.getLottoNumbers();

		// ��� ���
		System.out.println("���� ��ȣ : ");
		for (int i : numbers) {
			System.out.printf("%d ", i);
		} // for each���� �̿��ؼ� numbers�� �ִ� LottoNumbers�� ���� �ϳ��� �ϳ��� 6�� �ݺ��Ͽ� ���(?)

	}

}
