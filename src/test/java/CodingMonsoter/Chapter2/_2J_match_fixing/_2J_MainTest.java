package CodingMonsoter.Chapter2._2J_match_fixing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2J_MainTest {
/*
    int data[] = new int[]{1,2,3,4,5};
    int n = data.length;
    int k = 3;
*/
    _2J_Main main;

    int[] data;
    int n;
    int k;

    @BeforeEach
    void setup() {
        main = new _2J_Main();
        data = new int[]{1, 2, 4, 6, 3, 5, 1, 8, 2, 4};
        n = data.length;
    }

    @Test
    void 객체_상태_확인() {
        data = new int[]{2,4,6,8,2,4};
        k = 3;
        main.getEachCase(data, k);

        assertThat(main.getResult().length).isEqualTo(data.length-k+1);

        for (int i = 0; i < main.getResult().length; i++) {
            System.out.println(main.getResult()[i]);
        }

    }

    @Test
    void 연속된_두_개의_숫자_확인() {
        k = 2;
        int oddCase;
        int evenCase;

        main.getEachCase(data, k);

        oddCase = main.getOddCase();
        evenCase = main.getEvenCase();

        assertThat(oddCase).isEqualTo(3);
        assertThat(evenCase).isEqualTo(6);
    }

}
