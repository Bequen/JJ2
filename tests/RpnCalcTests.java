
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


public class RpnCalcTests {

    @BeforeEach
    public void PrepareConstants() {

    }

    @Test
    public void rpnCalcTest() {
        int result = seminare.seminar10.Main.rpnCalc("1 2 +");
        System.out.println(result);

        Map<String, Integer> variables = new HashMap<String, Integer>();
        variables.put("foo", 1);

        result = seminare.seminar10.Main.rpnCalcVariables("1 foo +", variables);
        System.out.println(result);
    }
}
