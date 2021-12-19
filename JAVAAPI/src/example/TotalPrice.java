package example;

import java.util.ArrayList;

class Cart{
	private ArrayList<Item> list; // Item타입의 ArrayList list를 생성
	
	public Cart() {
		this.list = new ArrayList<Item>(); // 생성자로 ArrayList 객체 생성
	}
	
	public void add(Item item) { // Item 객체의 변수 item
		list.add(item);
	} // list가 private로 생성되었기 때문에 public 생성자로 객체를 만들고 public void add함수를 이용해 내용을 추가할 수 있게 만들어줌.
	
	// 3. 장바구니 총합 메소드를 완성하시오
	public int totalPrice() {
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			int p = list.get(i).getPrice();
			sum += p;
		}
		return sum;
	} // Item 객체를 Cart에서 받았기 때문에 총합 메소드를 Cart에서 생성(?)
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
	} // private Price를 입력하면 public으로 받을 수 있게 함
}

public class TotalPrice {

	public static void main(String[] args) {
		// 1. 구매 상품 객체를 생성
		Item p1 = new Item("스트라이프 셔츠", 49900);
		Item p2 = new Item("슬림 면바지", 58900);
		Item p3 = new Item("스니커즈", 46900);
		
		// 2. 장바구니에 상품을 담으세요
		Cart myCart = new Cart();
		myCart.add(p1);
		myCart.add(p2);
		myCart.add(p3);
		
		// 총합 출력
		System.out.printf("총합: %d원", myCart.totalPrice());
		// myCart에 totalPrice를 출력함	
	
	}

}
