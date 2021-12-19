package example;

import java.util.ArrayList;

class Menu{
	private String name; // �޴��̸�
	private int Price;  // �޴� ����
	private int count;  // �޴��� �� ����
	
	public Menu(String name, int Price, int count){
		this.name = name;
		this.Price = Price;
		this.count = count;
	}

	//�� ������ ���ϱ� ���ؼ� price�� count�� ������ get�޼ҵ� ����
	public int getPrice() {
		return Price;
	}

	public int getCount() {
		return count;
	}
	
	
}

class Store{
	private ArrayList<Menu> list;
	
	public Store() {
		this.list = new ArrayList<>();
	}
	
	public void add(Menu menu) {
		list.add(menu);
	}
	
	public int TotalSale(){
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			int p = list.get(i).getPrice();
			int c = list.get(i).getCount();
			sum += p * c; // p*c�� ���� sum�� for�ݺ����� �̿��� �����ϸ鼭 list i������ ���ݰ� ������ ���� ������ ������ 
		}
		return sum;
	}
}

public class TotalSales {

	public static void main(String[] args) {
		// 1. �޴� ��ü�� �����ϼ���
		Menu m1 = new Menu("���", 2000, 57);
		Menu m2 = new Menu("���", 6000, 29);
		Menu m3 = new Menu("�ø�", 5000, 34);
		
		// 2. ����� ��ü�� ���� �� ���� �޴����� �߰��Ͻÿ�
		Store store = new Store();
		store.add(m1);
		store.add(m2);
		store.add(m3);
		
		// 3. �Ϸ� �� ������ ����ϼ���
		System.out.printf("�� ���� : %d��", store.TotalSale());

	}

}
