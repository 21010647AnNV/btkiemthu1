import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HinhTronTest {

    @Test
    void testCalculateCircleAreaWithPositiveRadius() {
        double radius = 5.0;
        double expectedArea = 78.53975;
        double actualArea = CircleArea.calculateCircleArea(radius);
        Assertions.assertEquals(expectedArea, actualArea, 0.00001);
    }

    @Test
    void testCalculateCircleAreaWithZeroRadius() {
        double radius = 0.0;
        double expectedArea = 0.0;
        double actualArea = CircleArea.calculateCircleArea(radius);
        Assertions.assertEquals(expectedArea, actualArea, 0.00001);
    }

    @Test
    void testCalculateCircleAreaWithNegativeRadius() {
        double radius = -5.0;
        Assertions.assertThrows(IllegalArgumentException.class, () -> CircleArea.calculateCircleArea(radius));
    }
}