package appication;

public class BooleanAndOr {

	public static void main(String[] args) {
		// && || 합쳐서 사용
		boolean isRaining = true;
		boolean mightRain =  false;
		boolean haveUmbrella = false;
		
		if((isRaining || mightRain) && haveUmbrella) {
			System.out.println("우산을 쓴다!");
		}
		else {
			System.out.println("우산을 쓰지 않는다.");
		}
		
		boolean raincheck = isRaining || mightRain;
		if(raincheck && haveUmbrella) {
			System.out.println("우산을 쓴다.");
		}
		else {
			System.out.println("우산을 쓰지 않는다.");
		}

	}

}
