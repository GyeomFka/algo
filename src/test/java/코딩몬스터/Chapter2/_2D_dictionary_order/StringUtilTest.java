package 코딩몬스터.Chapter2._2D_dictionary_order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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

        int cnt = Math.min(s1.length, s2.length);

        int result = util.compareUntilSameLength(s1, s2, cnt);
        assertThat(result).isLessThan(0);

        int result_2 = util.compareUntilSameLength(s2, s1, cnt);
        assertThat(result_2).isGreaterThan(0);

        int result_3 = util.compareUntilSameLength(s1, s3, cnt);
        assertThat(result_3).isEqualTo(0);
    }

    @Test
    void 다른_자리수_까지의_비교() {
        char[] s1 = "aaa".toCharArray();
        char[] s2 = "aab".toCharArray();

        char[] s3 = "app".toCharArray();
        char[] s4 = "apple".toCharArray();

        int result = util.compareDictiononary(s3, s4);
        //return -1;
        assertThat(result).isLessThan(0);

        int result_2 = util.compareDictiononary(s3, s3);
        assertThat(result_2).isEqualTo(0);

        int result_3 = util.compareDictiononary(s1, s2);
        assertThat(result_3).isLessThan(0);

        int result_4 = util.compareDictiononary(s2, s1);
        assertThat(result_4).isGreaterThan(0);


    }








}