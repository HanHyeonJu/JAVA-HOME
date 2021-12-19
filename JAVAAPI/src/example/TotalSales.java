package example;

import java.util.ArrayList;

class Menu{
	private String name; // 메뉴이름
	private int Price;  // 메뉴 가격
	private int count;  // 메뉴를 판 갯수
	
	public Menu(String name, int Price, int count){
		this.name = name;
		this.Price = Price;
		this.count = count;
	}

	//총 매출을 구하기 위해서 price와 count를 리턴할 get메소드 생성
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
			sum += p * c; // p*c의 값을 sum에 for반복문을 이용해 저장하면서 list i번까지 가격과 갯수를 곱한 값들이 더해짐 
		}
		return sum;
	}
}

public class TotalSales {

	public static void main(String[] args) {
		// 1. 메뉴 객체를 생성하세요
		Menu m1 = new Menu("김밥", 2000, 57);
		Menu m2 = new Menu("돈까스", 6000, 29);
		Menu m3 = new Menu("냉면", 5000, 34);
		
		// 2. 스토어 객체를 만든 후 위의 메뉴들을 추가하시오
		Store store = new Store();
		store.add(m1);
		store.add(m2);
		store.add(m3);
		
		// 3. 하루 총 매출을 계산하세요
		System.out.printf("총 매출 : %d원", store.TotalSale());

	}

}
