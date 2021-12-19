package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_list {

	public static void main(String[] args) {
		// 정렬 - 숫자
		ArrayList<Double> doubles = new ArrayList<>();
		
		doubles.add(7.38);
		doubles.add(3.88);
		doubles.add(1.45);
		doubles.add(2.35);
		doubles.add(9.28);
		
		doubles.forEach(System.out::println);
		System.out.println();
		
		Collections.sort(doubles); //정렬
		
		doubles.forEach(System.out::println);
		
		// 정렬 - 문자열
		ArrayList<Person> people = new ArrayList<>();
		
		people.add(new Person("펭수"));
		people.add(new Person("길동"));
		people.add(new Person("라이언"));
		people.add(new Person("둘리"));
		
		Collections.sort(people); //정렬
		
		people.forEach(System.out::println);
		
	}

}
