package _02_dictionary_order;

public class StringUtil {
 	static char[] s1;
	static char[] s2;

	public int compareOneCharacter(char s1, char s2) {
		return s1 - s2;
	}

	public int compareUntilSameLength(char[] s1, char[] s2) {
		for(int i = 0; i < s1.length; i++) {

			int eachCharResult = compareOneCharacter(s1[i], s2[i]);

			if (eachCharResult != 0) {
				return eachCharResult;
			}
		}
		return 0;
	}
}