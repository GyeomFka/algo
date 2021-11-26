package Chapter2._2G_bubble_sort;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    BubbleSort bs;
    int[] data;

    @BeforeEach
    void setup() {
        bs = new BubbleSort();
    }

    @Test
    void 원소_자리_바꾸기_2개() {
        data = new int[]{2, 1};
        bs.switchElement(data);
        assertThat(data).isEqualTo(new int[]{1, 2});
    }

    @Test
    void 원소_자리_바꾸기_3개() {
        data = new int[]{3, 2, 1};
        bs.switchElement(data);
        assertThat(data).isEqualTo(new int[]{2, 1, 3});
    }

    @Test
    void 조건에_맞으면_true_원소_2개() {
        data = new int[]{1, 2};
        boolean isSorted = bs.isSorted(data);
        assertThat(isSorted).isTrue();
    }

    @Test
    void 조건에_안_맞으면_false_원소_2개() {
        data = new int[]{2, 1};
        boolean isSorted = bs.isSorted(data);
        assertThat(isSorted).isFalse();
    }

    @Test
    void 조건에_맞으면_true_원소_3개() {
        data = new int[]{1, 2, 3};
        boolean isSorted = bs.isSorted(data);
        assertThat(isSorted).isTrue();
    }

    @Test
    void 조건에_안_맞으면_false_원소_3개() {
        data = new int[]{3, 1, 2};
        boolean isSorted = bs.isSorted(data);
        assertThat(isSorted).isFalse();
    }

    @Test
    void 조건에_맞으면_true_원소_4개() {
        data = new int[]{1, 2, 4, 3, 5};
        boolean isSorted = bs.isSorted(data);
        assertThat(isSorted).isFalse();
    }

    @Test
    void 조건식에_맞춘_원소_정렬() {
        data = new int[]{5, 4, 2, 3, 1};

        bs.bubbleSort(data);

        assertThat(data).isEqualTo(new int[]{1, 2, 3, 4, 5});
    }

}