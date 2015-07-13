package Skiena;

import java.util.Hashtable;
import java.util.LinkedList;

public class solution4_4 {

	public static void sortByColor(pair pairs[]) {
		Hashtable<String, LinkedList<Integer>> hash = new Hashtable<String, LinkedList<Integer>>();
		String colorArray[] = { "red", "blue", "yellow" };
		// Storing COlors in Hash
		for (String s : colorArray) {
			hash.put(s, new LinkedList<Integer>());
		}

		for (pair p : pairs) {
			int number = p.num;
			String color = p.color;
			LinkedList<Integer> list = hash.get(color);
			list.add(number);
		}

		for (String s : colorArray) {
			System.out.println("Color:" + s);
			LinkedList<Integer> list = hash.get(s);
			for (int number : list) {
				System.out.print(number + " ");
			}
			System.out.println();
		}

	}

	public static void insertPair() {
		pair p[] = new pair[5];
		int num[] = { 1, 3, 4, 6, 9 };
		String colors[] = { "blue", "red", "blue", "yellow", "red" };

		for (int i = 0; i < 5; i++) {
			p[i] = new pair(num[i], colors[i]);
		}
		sortByColor(p);

	}

}

class pair {
	int num;
	String color;

	pair(int num, String color) {
		this.num = num;
		this.color = color;
	}
}
