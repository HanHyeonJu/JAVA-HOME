package example;

import java.util.ArrayList;

class Chicken{
	private String name;
	private int Price;
	
	public Chicken(String name, int Price) {
		this.name = name;
		this.Price = Price;
	}

	public int getPrice() {
		return Price;
	}
	
	
}

public class TotalChickenPrice {

	public static void main(String[] args) {
		// ArrayList ����
		ArrayList<Chicken> order = new ArrayList<Chicken>();
		
		// 1. �ֹ��� ġŲ�� ArrayList�� �߰��Ͻÿ�
		order.add(new Chicken("�ν�Ʈ ġŲ", 9900));
		order.add(new Chicken("�Ĵ� ġŲ", 12900));
		order.add(new Chicken("���þ� ġŲ", 13900));
		
		//2. ArrayList�� ��ȸ�Ͽ� �� ���� ���Ͻÿ�
		int sum = 0;
		for(int i = 0; i < order.size(); i++) {
			int p = order.get(i).getPrice();
			sum += p;
		}// order.get(i) ���� �ϸ� order list�� i��° ������ �������� ���̰� .getPrice()���� ����ϸ� return���� i��° Price���� ������ �� �ִ�.
	    
		// ��� ���
		System.out.printf("���� : %d��\n", sum);
	}

}
