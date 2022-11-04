import com.kodilla.rps.RpsGame;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test suite for RpsGame")
public class RpsGameTestSuite {

    @Test
    void testBeatsSameParams() {
        //Given
        RpsGame rpsGame = new RpsGame();

        //When
        int result = rpsGame.beats(1, 1);

        //Then
        assertEquals(0, result);
    }

    @Test
    void testBeatsDifferentParams() {
        //Given
        RpsGame rpsGame = new RpsGame();

        //When
        int result = rpsGame.beats(1, 5);

        //Then
        assertEquals(1, result);
    }
}





