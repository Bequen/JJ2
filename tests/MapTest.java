import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static seminare.seminar09.Main.freq;

public class MapTest {
    public void PrepareConstants() {

    }

    @Test
    public void freqTest() {
        Map<String, Integer> result = freq("ahoj jak se mas ahoj");
        Assert.assertTrue(result.get("ahoj") == 2);
    }
}
