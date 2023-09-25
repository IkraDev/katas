package oddInt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OddInt {

    public int findOdd(List<Integer> list) {
        if (list.isEmpty()) {
            return -1;
        }
        if (list.size() == 1) {
            return list.get(0);
        }

        Map<String, Integer> findings = new HashMap<>();

        for (int num : list) {
            findings.put(Integer.toString(num) , findings.getOrDefault(Integer.toString(num), 0) + 1);
        }
        for (String key : findings.keySet()) {
            Integer value = findings.get(key);
            if (value % 2 == 1) {
                return Integer.parseInt(key);
            }
        };

        return -2;
    }
}
