package mapinterface.invertmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertMap {
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();

            // If value is not already in the inverted map, add a new list
            invertedMap.putIfAbsent(value, new ArrayList<>());

            // Add the key to the list of keys for that value
            invertedMap.get(value).add(key);
        }
        return invertedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);

        Map<Integer, List<String>> result = invertMap(inputMap);
        System.out.println(result);
    }
}
