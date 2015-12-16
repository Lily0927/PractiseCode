package leetcodeEasy;

import java.util.HashMap;

public class RomantoInteger {
	// Given a roman numeral, convert it to an integer.
	//
	// Input is guaranteed to be within the range from 1 to 3999.

	public int romanToInt(String s) {
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		m.put('I', 1);
		m.put('V', 5);
		m.put('X', 10);
		m.put('L', 50);
		m.put('C', 100);
		m.put('D', 500);
		m.put('M', 1000);
		
		return 0;
	
	}

}
