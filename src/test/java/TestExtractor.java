import org.example.UniqueNumberExtractor;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExtractor {
    static UniqueNumberExtractor extractor;

    @AfterAll
    static void createObject() {
        extractor = new UniqueNumberExtractor();
        System.out.println("Start Test");
    }
    @Test
    public void testExtractUniqueWithDuplicates() {
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList(1,2,3,4,1,5,3);

        Set<Integer> expectedUniqueNumbers = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);

        assertEquals(expectedUniqueNumbers, actualUniqueNumbers, "");
    }
    @Test
    public void testExractUniqueNumbersEmptyList() {
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList();

        Set<Integer> expectedUniqueNumbers = new HashSet<>();
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);

        assertEquals(expectedUniqueNumbers, actualUniqueNumbers, "");
    }
    @Test
    public void testExractUniqueNumbersWithNegativeNumbers() {
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList(-1,-2,-3,-1,0);

        Set<Integer> expectedUniqueNumbers = new HashSet<>(Arrays.asList(-1,-2,-3,0));
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);

        assertEquals(expectedUniqueNumbers, actualUniqueNumbers, "");
    }
    @Test
    public void testExractUniqueNumbersAllDuplicates() {
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList(2,2,2,2);

        Set<Integer> expectedUniqueNumbers = new HashSet<>(Arrays.asList(2));
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);

        assertEquals(expectedUniqueNumbers, actualUniqueNumbers, "");
    }
}
