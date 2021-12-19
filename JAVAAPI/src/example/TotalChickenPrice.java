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
		// ArrayList 생성
		ArrayList<Chicken> order = new ArrayList<Chicken>();
		
		// 1. 주문한 치킨을 ArrayList에 추가하시오
		order.add(new Chicken("로스트 치킨", 9900));
		order.add(new Chicken("파닭 치킨", 12900));
		order.add(new Chicken("마늘아 치킨", 13900));
		
		//2. ArrayList를 순회하여 총 합을 구하시오
		int sum = 0;
		for(int i = 0; i < order.size(); i++) {
			int p = order.get(i).getPrice();
			sum += p;
		}// order.get(i) 까지 하면 order list에 i번째 내용을 가져오는 것이고 .getPrice()까지 사용하면 return받은 i번째 Price값만 가져올 수 있다.
	    
		// 결과 출력
		System.out.printf("총합 : %d원\n", sum);
	}

}
