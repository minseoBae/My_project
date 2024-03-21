package ch01;

import static com.example.java.ch01.MaxValue.max;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MaxValueTest {
    @Test
    void main() {
        int max1 = max(1, 2, 4);
        int max2 = max(5, 10, 12);
        int max3 = max(100, 200, 500);
        assertEquals(max1, 4);
        assertEquals(max2, 12);
        assertEquals(max3, 500);
    }
}
