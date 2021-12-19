package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_list {

	public static void main(String[] args) {
		// ���� - ����
		ArrayList<Double> doubles = new ArrayList<>();
		
		doubles.add(7.38);
		doubles.add(3.88);
		doubles.add(1.45);
		doubles.add(2.35);
		doubles.add(9.28);
		
		doubles.forEach(System.out::println);
		System.out.println();
		
		Collections.sort(doubles); //����
		
		doubles.forEach(System.out::println);
		
		// ���� - ���ڿ�
		ArrayList<Person> people = new ArrayList<>();
		
		people.add(new Person("���"));
		people.add(new Person("�浿"));
		people.add(new Person("���̾�"));
		people.add(new Person("�Ѹ�"));
		
		Collections.sort(people); //����
		
		people.forEach(System.out::println);
		
	}

}