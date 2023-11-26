package org.sample;

import java.util.ArrayList;
import java.util.List;

import org.sample.StringReverse;

public class WebTable {
	public static void main(String[] args) {
		StringReverse s1 = new StringReverse();
		s1.setId(100);
		s1.setName("Gugan");
		s1.setPhNo(123456789l);

		StringReverse s2 = new StringReverse();
		s2.setId(150);
		s2.setName("Azhagu");
		s2.setPhNo(1234567289l);

		List<StringReverse> l1 = new ArrayList();
		l1.add(s1);
		l1.add(s2);

		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i).getId());
			System.out.println(l1.get(i).getName());
			System.out.println(l1.get(i).getPhNo());
		}
	}
}
