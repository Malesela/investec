package highestCommonFactorTest;

import highestCommonFactor.HighestCommonFactor;
import org.junit.Assert;
import org.junit.Test;

public class HighestCommonFactorTest {
    @Test
    public void positive() {

        int[] numbers = {39, 65, 91, 117};

        HighestCommonFactor highestCommonFactor = new HighestCommonFactor();

        int gcd = highestCommonFactor.highestCommonFactor(numbers);

        Assert.assertEquals(13, gcd);
    }

    @Test
    public void negative() {

        int[] numbers = {39, 65, 91, 117};

        HighestCommonFactor highestCommonFactor = new HighestCommonFactor();

        int gcd = highestCommonFactor.highestCommonFactor(numbers);

        Assert.assertEquals(11, gcd);
    }

}
