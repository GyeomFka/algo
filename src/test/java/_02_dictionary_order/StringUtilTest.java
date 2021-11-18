package _02_dictionary_order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
/*
s1 먼저인 문자 -> 음수 반환
s2 먼저인 문자 -> 양수 반환
같은 문자 -> 0 반환
*/

class StringUtilTest {

    StringUtil util;

    @BeforeEach
    void setup() {
        util = new StringUtil();

    }

    @Test
    void 한_문자의_대소_비교(){
        char s1 = 'a';
        char s2 = 'b';
        char s3 = 'a';

        int result = util.compareOneCharacter(s1, s2);
        assertThat(result).isLessThan(0);

        int result_2 = util.compareOneCharacter(s2, s1);
        assertThat(result_2).isGreaterThan(0);

        int result_3 = util.compareOneCharacter(s1, s3);
        assertThat(result_3).isEqualTo(0);
    }

    @Test
    void 같은_글자_수_까지의_대소_비교() {
        char[] s1 = "sample".toCharArray();
        char[] s2 = "samplz".toCharArray();
        char[] s3 = "sample".toCharArray();

        int result = util.compareUntilSameLength(s1, s2);
        assertThat(result).isLessThan(0);

        int result_2 = util.compareUntilSameLength(s2, s1);
        assertThat(result_2).isGreaterThan(0);

        int result_3 = util.compareUntilSameLength(s1, s3);
        assertThat(result_3).isEqualTo(0);
    }



}