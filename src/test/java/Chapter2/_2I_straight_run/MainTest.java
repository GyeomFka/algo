package Chapter2._2I_straight_run;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main main;

    @BeforeEach
    void setup() {
        main = new Main();
    }

    @Test
    void 수열_검증_참() {
        int[] data = new int[]{1, 2, 3, 4, 5};

        boolean result = main.isStraighted(data);

        assertTrue(result);
    }

    @Test
    void 수열_검증_거짓() {
        int[] data = new int[]{1, 2, 4, 5, 6};

        boolean result = main.isStraighted(data);

        assertFalse(result);
    }
}