import org.example.WordFind;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class WordFindTest {
    private WordFind wordfind;

    @DisplayName("Beforeeach stratup")
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        wordfind = new WordFind();
        System.out.println("Initialization test");
    }

    @DisplayName("Aftereach Test")
    @org.junit.jupiter.api.AfterEach
    void FindWordWithmostI_waaiiiwo_Pass() {
        assertTimeout(Duration.ofMillis(10000), () -> {
            // Симулируем быстрое выполнение
            Thread.sleep(50);
            assertEquals("вааиии", wordfind.findWordWithMostI("вааиии во"));
        });
    }

    @DisplayName("DisabledTest")
    @Disabled
    @org.junit.jupiter.api.Test
    void getFirstLettersInUpperCase_ikkjjkk_Disable() {
        String result = wordfind.getFirstLettersInUpperCase("ikk jj jj kk");
        assertEquals("IJJK",result);
    }

    @ParameterizedTest
    @CsvSource({
            "jlsalfsj samdfkmas, JS",
            "snl ls, SL",
            "fjls jlf, FJ",
            "kdas jk, KJ"
    })
    @DisplayName("Parametized test for getFirstLettersInUpperCase")
    void testAdditionParameterizedPass(String text, String expected) {
        assertEquals(expected, wordfind.getFirstLettersInUpperCase(text));
    }


    @org.junit.jupiter.api.Test
    @DisplayName("Test assert exception")
    void maxDiagonalSum123456() {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        assertThrows(IllegalArgumentException.class, ()->{
            wordfind.maxDiagonalSum(array);
        }
        );
    }




}
