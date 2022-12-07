import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import seminare.seminar08.Set;

import static org.junit.jupiter.api.Assertions.*;

public class SetTests {
    Set<Integer> set;

    @BeforeEach
    public void PrepareConstants() {
        set = new Set<>();
    }

    @Test
    public void insertTest() {
        set.insert(1);
        set.insert(2);
    }
}
