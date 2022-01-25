package example;

import java.util.Random;

class LottoMachine {
	private int[] LottoNumbers;

	public LottoMachine() {
		// 메소드를 이용해서 로또 번호 생성
		LottoNumbers = generate();
	}

	private int[] generate() {
		int[] pickedNumbers = new int[6];
		Random rand = new Random();

		// pickedNumbers에 6개의 임의의 숫자를 만든다
		for (int i = 0; i < 6; i++) {
			pickedNumbers[i] = rand.nextInt(45) + 1;
		} // Random rand를 이용해여 45개의 숫자중 random으로 pickedNumbers에 6개의 숫자를 저장

		return pickedNumbers; // pickedNumbers에 for문을 이용해서 생성된 숫자들을 return
	}

	public int[] getLottoNumbers() {
		return LottoNumbers;
	} // LottoMachine 객체에 LottoNumbers의 내용을 가져올 수 있게 get 메소드 생성
}

public class TotalLotto {

	public static void main(String[] args) {
		// 객체 생성
		LottoMachine machine = new LottoMachine();

		// 로또 번호 가져오기
		int[] numbers = machine.getLottoNumbers();

		// 결과 출력
		System.out.println("생성 번호 : ");
		for (int i : numbers) {
			System.out.printf("%d ", i);
		} // for each문을 이용해서 numbers에 있는 LottoNumbers에 값을 하나씩 하나씩 6번 반복하여 출력(?)

	}

}
