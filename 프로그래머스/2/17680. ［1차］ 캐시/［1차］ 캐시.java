import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        int time = 0;

        LinkedHashMap<String, Boolean> cache = new LinkedHashMap<>(cacheSize, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, Boolean> eldest) {
                return size() > cacheSize;
            }
        };

        for (String city : cities) {
            city = city.toLowerCase();

            if (cache.containsKey(city)) {
                time += 1;
                cache.get(city);
            } else {
                time += 5;
                cache.put(city, true);
            }
        }

        return time;
    }
}