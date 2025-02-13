package listinterface.frequencyofelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
    public static void countFrequencyOfEle(ArrayList<String> list) {
        Map<String, Integer> map = new HashMap<>();

        for (String str : list) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        String[] list = {"apple", "banana", "apple", "orange"};

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(list));
        countFrequencyOfEle(arrayList);
    }
}
