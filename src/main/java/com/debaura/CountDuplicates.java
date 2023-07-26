package com.debaura;

import static java.util.Arrays.asList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDuplicates {

	public static void main(String[] args) {
		System.out.println(countDuplicates("87654567jjjjHHSCDUdcnduuuu77"));
	}

	public static int countDuplicates(String text) {
		List<String> characters = asList(text.toLowerCase().split(""));
		Map<String, Integer> map = new HashMap<>();
		characters.forEach(l -> map.put(l, map.getOrDefault(l, 0) + 1));
		int count = 0;

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				count++;
			}

		}
		return count;
	}

}
