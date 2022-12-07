import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import seminare.seminar04.Circle;
import seminare.seminar04.Line;
import seminare.seminar04.Point;

public class LineTests {
    Line line1;
    Circle circle1;

    @BeforeEach
    public void PrepareConstants() {
        line1 = new Line(new Point(0, 0), new Point(1, 0));
        circle1 = new Circle(new Point(0, 0), 10);
    }

    @Test
    public void getLengthTest() {
        assert line1.distance(new Point(1, 1)) >= 0.0;
    }

    @Test
    public void circleTest() {
        assert(circle1.getArea() >= 314.0 &&
                circle1.getArea() <= 315.0);
    }

    @Test
    public void distanceTest() {
        assertEquals(circle1.distance(new Point(15, 0)), 5);
    }
}
