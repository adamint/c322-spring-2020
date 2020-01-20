import java.util.*;

public class RandomStringGenerator {
    private List<Range> ranges;
    private Random random;

    public RandomStringGenerator(List<Range> ranges) {
        this.ranges = ranges;
        this.random = new Random();
    }

    public List<Range> getRanges() {
        return ranges;
    }

    public String nextString(int numberOfChars) {
        Set<Integer> possibleCharValues = new HashSet<>();
        for (Range range : ranges) {
            for (int i = range.getLowerBound(); i <= range.getUpperBound(); i++) possibleCharValues.add(i);
        }

        List<Integer> charList = new ArrayList<>(possibleCharValues);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfChars; i++) sb.append((char) (int) charList.get(random.nextInt(charList.size())));

        return sb.toString();
    }
}
