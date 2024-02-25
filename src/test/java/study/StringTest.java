package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

public class StringTest {

    @ParameterizedTest
    @CsvSource(value = {"1,2:,"}, delimiter = ':')
    void splitTest(String input, String separator) {
        String[] split = input.split(separator);
        assertThat(split).isEqualTo(new String[]{"1", "2"});
    }

    @Test
    void split_one() {
        String input = "1";
        String[] split = input.split(",");
        assertThat(split).containsExactly("1");
    }

    @Test
    void substringTest() {
        String input = "(1,2)";
        String substring = input.substring(1).substring(0, input.length()-2);
        assertThat(substring).isEqualTo("1,2");
    }

    @DisplayName("특정 위치의 문자를 가져온다.")
    @ValueSource(strings = "abc")
    @ParameterizedTest
    void charAt(String input) {
        assertAll(
                () -> assertThat(input.charAt(0)).isEqualTo('a'),
                () -> assertThat(input.charAt(1)).isEqualTo('b'),
                () -> assertThat(input.charAt(2)).isEqualTo('c')
        );
    }


    @DisplayName("특정 위치의 문자를 가져올 때, 위치값을 벗어나면 StringIndexOutOfBoundsException 에러가 발생한다.")
    @CsvSource({"abc, -1", "abc, 3"})
    @ParameterizedTest
    void charAtException(String text, int index) {
        assertThatThrownBy(() -> {
            text.charAt(index);
        }).isInstanceOf(IndexOutOfBoundsException.class);
    }
}
