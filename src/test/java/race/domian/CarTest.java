package race.domian;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import race.strategy.ForwardStrategy;
import race.strategy.HoldStrategy;

import static org.assertj.core.api.Assertions.assertThat;
import static race.domian.Car.DISTANCE_TO_MOVE_AT_ONCE;
import static race.domian.Position.START_POSITION;

class CarTest {
    private static Car car;

    @BeforeEach
    void setUp() {
        car = new Car("jihye");
    }

    @Test
    void getInitialLocation() {
        assertThat(car.getPosition()).isEqualTo(START_POSITION);
    }

    @Test
    void moveOnce() {
        ForwardStrategy forwardStrategy = new ForwardStrategy();
        car.move(forwardStrategy);
        assertThat(car.getPosition()).isEqualTo(DISTANCE_TO_MOVE_AT_ONCE);
    }

    @Test
    void hold() {
        HoldStrategy holdStrategy = new HoldStrategy();
        car.move(holdStrategy);
        assertThat(car.getPosition()).isEqualTo(START_POSITION);
    }

    @Test
    void 한번_움직이면_최대값은_1이다() {
        ForwardStrategy forwardStrategy = new ForwardStrategy();
        int maxPosition = 1;
        car.move(forwardStrategy);
        assertThat(car.isWinner(maxPosition)).isTrue();
    }
}