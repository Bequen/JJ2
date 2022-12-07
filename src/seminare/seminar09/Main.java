package seminare.seminar09;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<String, Integer> freq(String s) {
        int idx = 0;
        Map<String, Integer> result = new HashMap<String, Integer>();

        int cur = 0;
        while(cur != -1) {
            cur = s.indexOf(" ,0123456789", idx);
            if(cur == -1)
                break;

            String key = s.substring(idx, cur);
            if(result.containsKey(key)) {
                result.replace(key, result.get(key) + 1);
            } else {
                result.put(key, 1);
            }

            idx = cur;
        }

        return result;
    }

    public static Map<String, Integer> freqIgnoreCase(String s) {
        return freq(s.toLowerCase());
    }
}
