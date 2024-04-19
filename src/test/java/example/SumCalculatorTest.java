package example;


import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("fast")
public class SumCalculatorTest {

    private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testThatSumWorksCorrect() {
        //When
        int actual = sumCalculator.sum(3);

        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatAnotherSumWorksCorrect() {
        //When
        int actual = sumCalculator.sum(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testWithIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            sumCalculator.sum(0);
        });


    }


}
