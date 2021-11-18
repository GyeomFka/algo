package _02_dictionary_order;

public class StringUtil {
 	static char[] s1;
	static char[] s2;

	public int compareOneCharacter(char s1, char s2) {
		if(s1 < s2) {
			return -1;
		} else if(s1 > s2) {
			return 1;
		} else {
			return 0;
		}
	}


}