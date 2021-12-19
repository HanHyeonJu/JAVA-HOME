package appication;

public class BooleanOr {

	public static void main(String[] args) {
		boolean isRaining = true;
		boolean mightRain = false; // 비가 올수도 있는가?
		boolean takeUmbrella = false;
		
		takeUmbrella = isRaining || mightRain;
		System.out.println(takeUmbrella);

	}

}
