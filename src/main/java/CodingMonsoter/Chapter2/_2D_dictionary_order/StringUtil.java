package CodingMonsoter.Chapter2._2D_dictionary_order;

public class StringUtil {
 	static char[] s1;
	static char[] s2;

	public int compareDictiononary(char[] s1, char[] s2) {
		int result;
		int cnt = Math.min(s1.length, s2.length);
		boolean isSameLength = s1.length == s2.length;

		if (isSameLength) {
			result = compareUntilSameLength(s1, s2, cnt);
		} else {
			if(compareUntilSameLength(s1, s2, cnt) == 0) {//다른 자릿수일때
				result = s1.length - s2.length;
			} else {
				result = compareUntilSameLength(s1, s2, cnt);
			}
		}
		return result;
	}

	public int compareUntilSameLength(char[] s1, char[] s2, int cnt) {
		for(int i = 0; i < cnt; i++) {

			int eachCharResult = compareOneCharacter(s1[i], s2[i]);

			if (eachCharResult != 0) {
				return eachCharResult;
			}
		}
		return 0;
	}

	public int compareOneCharacter(char s1, char s2) {
		return s1 - s2;
	}
}
