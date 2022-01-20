import java.util.HashMap;
import java.util.Map;

public class MapTests {
    public static void main(String[] args) {
        Map<String, Integer> peopleAge = new HashMap<>();

        //Add
        peopleAge.put("Igor", 30);
        peopleAge.put("Maxim", 30);
        peopleAge.put("John", 25);
        peopleAge.put("Unknown", null);

        //Get by key
        System.out.println("peopleAge.get(\"Igor\") = " + peopleAge.get("Igor"));
        System.out.println("peopleAge.get(\"NON-EXISTING-KEY\") = " + peopleAge.get("NON-EXISTING-KEY"));

        //Get all keys
        for (String key : peopleAge.keySet()) {
            System.out.println("key = " + key);
        }

        //Get all values
        for (Integer value : peopleAge.values()) {
            System.out.println(value);
        }

        //Iterate over keys & values
        for (String key : peopleAge.keySet()) {
            Integer value = peopleAge.get(key);

            System.out.println(key + " = " + value);
        }

        //Iterate over keys & values in effective way
        for (Map.Entry<String, Integer> entry : peopleAge.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " = " + value);
        }

        //Contains key & value
        System.out.println("peopleAge.containsKey(\"Igor\") = " + peopleAge.containsKey("Igor"));
        System.out.println("peopleAge.containsKey(\"UNKNOWN\") = " + peopleAge.containsKey("UNKNOWN"));
    }
}
