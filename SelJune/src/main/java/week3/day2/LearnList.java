package week3.day2;

import java.util.*;
import org.apache.commons.collections4.Get;

public class LearnList {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("Suresh");
		names.add("Sathis");
		names.add("Dinesh");
		names.add("Rani");
		names.add("MGR");
		names.add("NGK");
		names.add("Vani");

		int size = names.size();

		System.out.println(size);

//for (int i=0; i<
		// names.size();i++) {

		// System.out.println(names.get(i));

		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).endsWith("i") || (names.get(i).startsWith("S"))) {

				System.out.println(names.get(i));
			}

		}

	}

}
