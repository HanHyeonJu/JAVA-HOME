package application;

public class ForEachArray {

	public static void main(String[] args) {
		// 인덱스 번호가 필요없는 간단한 배열의 반복에는 for each문 사용
		String[] fruits = {"바나나", "사과", "수박"};
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
