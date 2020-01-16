package by.select.stage2.logic;

import java.util.Comparator;

public class ComparatorStringLength implements Comparator<String> {
	public int compare(String a, String b) {
		if (a.length() > b.length()) {
			return 1;
		} else if (a.length() < b.length()) {
			return -1;
		} else {
			return 0;
		}
	}
}
