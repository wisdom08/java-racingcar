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

    @ParameterizedTest
    @ValueSource(strings = "(1,2)")
    void substringTest(String input) {
        String substring = input.substring(1).substring(0, input.length()-2);
        assertThat(substring).isEqualTo("1,2");
    }
}
