package study;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {

    @ParameterizedTest
    @ValueSource(strings = "1,2")
    void splitTest(String input) {
        String[] split = input.split(",");
        assertThat(split).isEqualTo(new String[]{"1", "2"});
    }

    @ParameterizedTest
    @ValueSource(strings = "1")
    void split_one(String input) {
        String[] split = input.split(",");
        assertThat(split).containsExactly("1");
    }
}
