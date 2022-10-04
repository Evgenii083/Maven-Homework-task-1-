import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/ForRegisteredAndUnderLimit.csv")
    void shouldCalculateForRegisteredAndUnderLimit(int expected, int amount, boolean registered) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/ForRegisteredAndOverLimit.csv")
    void shouldCalculateForRegisteredAndOverLimit(int expected, int amount, boolean registered) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/ForNoRegisteredAndUnderLimit.csv")
    void shouldCalculateForNoRegisteredAndUnderLimit(int expected, int amount, boolean registered) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

   @ParameterizedTest
   @CsvFileSource(files = "src/test/resources/ForNoRegisteredAndOverLimit.csv")
    void shouldCalculateForNoRegisteredAndOverLimit(int expected, int amount, boolean registered) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/ForNoRegisteredAndBoundaryLimit.csv")
    void shouldCalculateForNoRegisteredAndBoundaryLimit(int expected , int amount , boolean registered) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}