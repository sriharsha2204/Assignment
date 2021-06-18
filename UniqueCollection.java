package collectionexamples;

import java.util.*;
public class UniqueCollection {
	static Set<String> getCollection(String[] str){
		List<String> st = new ArrayList<>();
		Collections.addAll(st, str);
		Collections.sort(st);
		Set<String> s= new HashSet<>();
		s.addAll(st);
		return s;
	}
	public static void main(String[] args) {
		String[] str = {"Srilu","Anu","Swetha"};
		System.out.println(getCollection(str));
	}
}
