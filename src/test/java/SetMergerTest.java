import org.example.SetMerger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class SetMergerTest {

    @Test
    public void testMergeSets_IntersectingSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        Set<Integer> merged = SetMerger.mergeSets(set1, set2);

        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        assertEquals(expected, merged);
    }

    @Test
    public void testMergeSets_NonIntersectingSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(5, 6, 7, 8));

        Set<Integer> merged = SetMerger.mergeSets(set1, set2);

        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        assertEquals(expected, merged);
    }

    @Test
    public void testMergeSets_EmptySets() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        Set<Integer> merged = SetMerger.mergeSets(set1, set2);

        Set<Integer> expected = new HashSet<>();

        assertEquals(expected, merged);
    }

    @Test
    public void testMergeSets_NullSets() {
        Set<Integer> set1 = null;
        Set<Integer> set2 = null;

        assertThrows(NullPointerException.class, () -> SetMerger.mergeSets(set1, set2));
    }
}
