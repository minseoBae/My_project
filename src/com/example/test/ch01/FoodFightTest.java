package ch01;

import static com.example.java.ch01.Solution.solution;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FoodFightTest {
    @Test
    void main() {
        String food1 = solution(new int[]{1, 2, 4, 6});
        String food2 = solution(new int[]{1, 4, 7, 9});
        String food3 = solution(new int[]{1, 10, 2, 1});
        assertEquals(food1, "1223330333221");
        assertEquals(food2, "1122233330333322211");
        assertEquals(food3, "1111120211111");
    }
}
