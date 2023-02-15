import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatNoException;

class HeightTest {
    @DisplayName("생성자 테스트")
    @Test
    void create() {
        new Height("1");
    }

    @DisplayName("높이가 정수로 들어오는지 확인")
    @Test
    void checkIntegerSuccess() {
        assertThatNoException().isThrownBy(() -> new Height("1"));
    }


}