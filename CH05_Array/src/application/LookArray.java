package application;

public class LookArray {

	public static void main(String[] args) {
		// for �ݺ����� ���ڿ��� �ε��� i�� �̿��� ���ڿ��� ù��°���� ������ ���
		String[] animals = {"��","�����","��","����","��","��"};
		for(int i = 0; i < 3; i++) {
			System.out.println(animals[i]);
		}
		
		
		
		for(int i = 0; i < animals.length; i++) {
//			System.out.println(animals[i]);
			System.out.printf("�ε��� %d : %s \n", i, animals[i]);
		}
// �ڹٽ�ũ��Ʈó�� �ڹٴ� �� �� �� �� �ε����� �߰��� �� ���� ó�� ������ �迭 ������(?)
// �ʱ� ������ �ٲٴ� ��� ����� new �Լ��� ����ؼ� �迭ĭ�� �߰��Ѵ�.
	}

}
