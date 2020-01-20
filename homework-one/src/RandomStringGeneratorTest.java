import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RandomStringGeneratorTest {
    @Test
    public void testStringGenerator() {
        List<Range> ranges = new ArrayList<>();
        ranges.add(new Range('a', 'z'));

        RandomStringGenerator generator1 = new RandomStringGenerator(ranges);
        String generatedOne = generator1.nextString(10);

        assertEquals(10, generatedOne.length());
        assertEquals(generatedOne.toLowerCase(), generatedOne);

        ranges.clear();
        ranges.add(new Range('A', 'Z'));

        RandomStringGenerator generator2 = new RandomStringGenerator(ranges);
        String generatedTwo = generator2.nextString(28);

        assertEquals(28, generatedTwo.length());
        assertEquals(generatedTwo.toUpperCase(), generatedTwo);


    }
}
