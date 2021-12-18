package zerobase._3w;

import org.assertj.core.api.Assertions;
import inflearn.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DistanceApplicationTest {

    DistanceApplication app = new DistanceApplication();

    @Test
    void 점_사이의_거리() {

        MyLocation my = new MyLocation(0, 0);
        RandomLocation ran = new RandomLocation(3, 4);

        double a = app.calculateDistance(my, ran);

        System.out.println(a);

    }

}