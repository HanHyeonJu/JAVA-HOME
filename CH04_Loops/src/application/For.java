package application;

public class For {

	public static void main(String[] args) {
		// for �ݺ��� for(�ʱⰪ;����;����){��ɹ�;}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("i: "+i);
		}
		
		int sum = 0;
		for(int p = 1; p <= 100; p++) {
			sum = sum + p;
		}
		System.out.println(sum);
	}

}
