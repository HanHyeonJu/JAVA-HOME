package application;

public class ForEachArray {

	public static void main(String[] args) {
		// �ε��� ��ȣ�� �ʿ���� ������ �迭�� �ݺ����� for each�� ���
		String[] fruits = {"�ٳ���", "���", "����"};
		int[] n = {1,2,3};
		boolean[] bool = {true, false, true};
		double[] d = {1.1, 2.2, 3.3, 4.4};
		
		for(String x : fruits) {
			System.out.println(x + "");
		}
		System.out.println();
		for(int x : n) {
			System.out.println(x +"");
		}
		System.out.println();
		for(boolean x :bool) {
			System.out.println(x +"");
		}
		System.out.println();
		for(double x : d) {
			System.out.println(x +"");
		}

	}

}
