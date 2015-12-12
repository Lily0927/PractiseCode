package leetcodeEasy;

public class ValidAnagram {
	// Given two strings s and t, write a function to determine if t is an
	// anagram of s.
	//
	// For example,
	// s = "anagram", t = "nagaram", return true.
	// s = "rat", t = "car", return false.
	//
	// Note:
	// You may assume the string contains only lowercase alphabets.
	public boolean isAnagram(String s, String t) {
		if(s.length()!=t.length()){
			return false;
		}
		int[] letter=new int[26];
		for(int i=0;i<s.length();i++){
			letter[s.charAt(i)-'a']+=1;
		}
		for(int j=0;j<t.length();j++){
			letter[t.charAt(j)-'a']-=1;
		}
		for(int i=0;i<letter.length;i++){
			if(letter[i]!=0){
				return false;
			}
		}
		return true;
	}

}
