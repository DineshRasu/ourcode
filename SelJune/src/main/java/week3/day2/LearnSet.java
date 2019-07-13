package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {
 public static void main(String[] args) {
	
	 List<String> names	= new ArrayList<>();

	 names.add("Suresh");
	 names.add("Sathis");
	 names.add("Sathis");
	 names.add("Rani");
	 names.add("MGR");
	 names.add("MGR");
	 names.add("MGR");

	 int size =names.size();

	// System.out.println(size);
	 
	 Set<String> nameset = new LinkedHashSet<>(names);
	// nameset.addAll(names);
	 System.out.println(nameset);
			 
}
 
 
 
}
