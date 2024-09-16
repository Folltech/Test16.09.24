import org.example.SetIntersectionChecker;
import org.example.UniqueNumberExtractor;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SetIntersectionCheckerTest {
    static UniqueNumberExtractor extractor;

    @AfterAll
    static void createObject() {
        extractor = new UniqueNumberExtractor();
        System.out.println("Start Test");
    }

    @Test
    public void oneСommonElement() {
        SetIntersectionChecker checker = new SetIntersectionChecker();
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5);
        List<Integer> numbers2 = Arrays.asList(5,2,8,5,1);

        Set<Integer> nms1 = extractor.extractUniqueNumbers(numbers1);
        Set<Integer> nms2 = extractor.extractUniqueNumbers(numbers2);

        assertTrue(checker.isIntersecting(nms1, nms2),"1 test: True");
    }

    @Test
    public void noneСommonElement() {
        SetIntersectionChecker checker = new SetIntersectionChecker();
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5);
        List<Integer> numbers2 = Arrays.asList(5,9,8,5,0);

        Set<Integer> nms1 = extractor.extractUniqueNumbers(numbers1);
        Set<Integer> nms2 = extractor.extractUniqueNumbers(numbers2);

        assertTrue(checker.isIntersecting(nms1, nms2),"2 test:True");
    }

    @Test
    public void allСommonElement() {
        SetIntersectionChecker checker = new SetIntersectionChecker();
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5);
        List<Integer> numbers2 = Arrays.asList(1,2,3,4,5);

        Set<Integer> nms1 = extractor.extractUniqueNumbers(numbers1);
        Set<Integer> nms2 = extractor.extractUniqueNumbers(numbers2);

        assertTrue(checker.isIntersecting(nms1, nms2),"3 test:True");
    }
    @Test
    public void theСommonElement() {
        SetIntersectionChecker checker = new SetIntersectionChecker();
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5);
        List<Integer> numbers2 = Arrays.asList(1,6,7,8,9,10,11);

        Set<Integer> nms1 = extractor.extractUniqueNumbers(numbers1);
        Set<Integer> nms2 = extractor.extractUniqueNumbers(numbers2);

        assertTrue(checker.isIntersecting(nms1, nms2),"3 test:True");
    }
}
