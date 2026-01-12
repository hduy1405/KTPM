import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class StudentAnalyzerTest {

    private final StudentAnalyzer analyzer = new StudentAnalyzer();

    @Test
    public void testCountExcellentStudents() {
        assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)));
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
        assertEquals(0, analyzer.countExcellentStudents(null));
        assertEquals(0, analyzer.countExcellentStudents(Arrays.asList(-5.0, 15.0)));
    }

    @Test
    public void testCalculateValidAverage() {
        assertEquals(8.166, analyzer.calculateValidAverage(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)), 0.01);
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()), 0.01);
        assertEquals(0.0, analyzer.calculateValidAverage(Arrays.asList(-1.0, 12.0)), 0.01);
    }
}