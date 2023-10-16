import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberTest {
    private Number numberUtils;

    @BeforeEach
    public void setUp() {
        numberUtils = new NumberUtils();
    }

    @Test
    public void testCalculateAverageOfDigits() {
        assertEquals(2.0, numberUtils.calculateAverageOfDigits(123));
        assertEquals(4.5, numberUtils.calculateAverageOfDigits(945));
        assertEquals(1.0, numberUtils.calculateAverageOfDigits(111));
        assertEquals(0.0, numberUtils.calculateAverageOfDigits(0));
    }
}
