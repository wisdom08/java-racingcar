package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

    @DisplayName("특정 위치의 문자를 가져온다.")
    @ValueSource(strings = "abc")
    @ParameterizedTest
    void charAt(String input) {
        assertThat(input.charAt(0)).isEqualTo('a');
    }


    @DisplayName("특정 위치의 문자를 가져올 때, 위치값을 벗어나면 StringIndexOutOfBoundsException 에러가 발생한다.")
    @ValueSource(strings = "abc")
    @ParameterizedTest
    void charAtException(String input) {
        assertThatThrownBy(() -> {
            input.charAt(100);
        }).isInstanceOf(IndexOutOfBoundsException.class);
    }
}
