package example;

import java.util.ArrayList;

class Cart{
	private ArrayList<Item> list; // ItemŸ���� ArrayList list�� ����
	
	public Cart() {
		this.list = new ArrayList<Item>(); // �����ڷ� ArrayList ��ü ����
	}
	
	public void add(Item item) { // Item ��ü�� ���� item
		list.add(item);
	} // list�� private�� �����Ǿ��� ������ public �����ڷ� ��ü�� ����� public void add�Լ��� �̿��� ������ �߰��� �� �ְ� �������.
	
	// 3. ��ٱ��� ���� �޼ҵ带 �ϼ��Ͻÿ�
	public int totalPrice() {
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			int p = list.get(i).getPrice();
			sum += p;
		}
		return sum;
	} // Item ��ü�� Cart���� �޾ұ� ������ ���� �޼ҵ带 Cart���� ����(?)
}

class Item{
	private String name;
	private int Price;
	
	public Item(String name, int Price) {
		this.name = name;
		this.Price = Price;
	}

	public int getPrice() {
		return Price;
	} // private Price�� �Է��ϸ� public���� ���� �� �ְ� ��
}

public class TotalPrice {

	public static void main(String[] args) {
		// 1. ���� ��ǰ ��ü�� ����
		Item p1 = new Item("��Ʈ������ ����", 49900);
		Item p2 = new Item("���� �����", 58900);
		Item p3 = new Item("����Ŀ��", 46900);
		
		// 2. ��ٱ��Ͽ� ��ǰ�� ��������
		Cart myCart = new Cart();
		myCart.add(p1);
		myCart.add(p2);
		myCart.add(p3);
		
		// ���� ���
		System.out.printf("����: %d��", myCart.totalPrice());
		// myCart�� totalPrice�� �����	
	
	}

}
