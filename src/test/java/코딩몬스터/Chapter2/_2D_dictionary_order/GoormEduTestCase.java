package 코딩몬스터.Chapter2._2D_dictionary_order;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
public class GoormEduTestCase {

    StringUtil stringUtil;

    @BeforeEach
    void setup() {
        stringUtil = new StringUtil();
    }

    @Test
    public void compareTest1() {
        char[] s1 = "algorithm".toCharArray();
        char[] s2 = "allergy".toCharArray();
        int result = stringUtil.compareDictiononary(s1, s2);
        assertTrue( result < 0  );
    }

    @Test
    public void compareTest2() {
        char[] s1 = "allergy".toCharArray();
        char[] s2 = "algorithm".toCharArray();
        int result = stringUtil.compareDictiononary(s1, s2);
        assertTrue( result > 0  );
    }
    @Test
    public void compareTest3() {
        char[] s1 = "algorithm".toCharArray();
        char[] s2 = "algorithm".toCharArray();
        int result = stringUtil.compareDictiononary(s1, s2);
        assertTrue( result == 0  );
    }
    @Test
    public void compareTest4() {
        char[] s1 = "zzzzzzzzza".toCharArray();
        char[] s2 = "zzzzzzzzz".toCharArray();
        int result = stringUtil.compareDictiononary(s1, s2);
        assertTrue( result > 0  );
    }
    @Test
    public void compareTest5() {
        char[] s1 = "zzzzzzzzz".toCharArray();
        char[] s2 = "zzzzzzzzza".toCharArray();
        int result = stringUtil.compareDictiononary(s1, s2);
        assertTrue( result < 0  );
    }

    @Test
    public void compareLongTest1() {
        char[] s1 = new char[100000];
        char[] s2 = new char[100000];
        Arrays.fill(s1, 'b');
        Arrays.fill(s2, 'b');
        int result = stringUtil.compareDictiononary(s1, s2);
        assertTrue( result == 0  );
    }

    @Test
    public void compareLongTest2() {
        char[] s1 = new char[100000];
        char[] s2 = new char[100000];
        Arrays.fill(s1, 'b');
        Arrays.fill(s2, 'b');
        s2[s2.length-1]='z';
        int result = stringUtil.compareDictiononary(s1, s2);
        assertTrue( result < 0  );
    }
    @Test
    public void compareLongTest3() {
        char[] s1 = new char[100000];
        char[] s2 = new char[100000];
        Arrays.fill(s1, 'b');
        Arrays.fill(s2, 'b');
        s1[s1.length-1]='z';
        int result = stringUtil.compareDictiononary(s1, s2);
        assertTrue( result > 0  );
    }

/*
    @Test
    public void equalsTest1() {
        char[] s1 = "algorithm".toCharArray();
        char[] s2 = "allergy".toCharArray();
        //boolean result = StringUtil.equals(s1, s2);
        assertEquals( false, result );
    }

    @Test
    public void equalsTest2() {
        char[] s1 = "algorithm".toCharArray();
        char[] s2 = "algorithm".toCharArray();
        //boolean result = StringUtil.equals(s1, s2);
        assertEquals( true, result );
    }

    @Test
    public void equalsTest3() {
        char[] s1 = "allergy".toCharArray();
        char[] s2 = "allergy".toCharArray();
        //boolean result = StringUtil.equals(s1, s2);
        assertEquals( true , result );
    }

    @Test
    public void equalsTest4() {
        char[] s1 = "aaaz".toCharArray();
        char[] s2 = "aaa".toCharArray();
        //boolean result = StringUtil.equals(s1, s2);
        assertEquals( false, result );
    }

    @Test
    public void equalsLongTest1() {
        char[] s1 = new char[100000];
        char[] s2 = new char[100000];
        Arrays.fill(s1, 'z');
        Arrays.fill(s2, 'z');

        //boolean result = StringUtil.equals(s1, s2);
        assertEquals( true, result );
    }

    @Test
    public void equalsLongTest2() {
        char[] s1 = new char[100000];
        char[] s2 = new char[100000];
        Arrays.fill(s1, 'a');
        Arrays.fill(s2, 'a');
        s1[s1.length-1]='z';

        //boolean result = StringUtil.equals(s1, s2);
        assertEquals( false, result );
    }

    @Test
    public void equalsLongTest3() {
        char[] s1 = new char[100000];
        char[] s2 = new char[100000];
        Arrays.fill(s1, 'b');
        Arrays.fill(s2, 'b');
        s2[s2.length-1]='z';

        boolean result = stringUtil.equals(s1, s2);
        assertEquals( false, result );
    }
    */
}