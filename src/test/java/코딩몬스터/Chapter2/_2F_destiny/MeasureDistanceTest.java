package 코딩몬스터.Chapter2._2F_destiny;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MeasureDistanceTest {

    MeasureDistance measureDistance;

    @BeforeEach
    void setup() {

    }

    @Test
    void 객체_기본_설정_확인() {
        measureDistance = new MeasureDistance(new Point2D[]{new Point2D(1,2), new Point2D(3,2), new Point2D(9,4)});
        assertThat(measureDistance.getStars().length).isEqualTo(3);
    }

    @Test
    void 두_점_사이의_거리_구하고_소수점_처리() {
        measureDistance = new MeasureDistance(
                new Point2D[]{ new Point2D(0,0), new Point2D(1,1) }
        );

        double distance = measureDistance.getDistanceTo(measureDistance.getStars()[0], measureDistance.getStars()[1]);

        assertThat(distance).isEqualTo(1.4);
    }

    @Test
    void 주워진_좌표_배열_연산_틀_만들기() {

    }

}