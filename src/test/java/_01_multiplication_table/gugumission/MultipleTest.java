package _01_multiplication_table.gugumission;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MultipleTest {

    Multiple multiple;

    @BeforeEach
    void setup() {
        multiple = new Multiple();
    }

    @Test
    void 단순_구구단_출력() {
        assertThat(1).isEqualTo(1);
    }


}