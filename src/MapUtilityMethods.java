import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapUtilityMethods {
    public static void main(String[] args) {
        //Empty
        Collections.emptyMap();

        //Non-empty map
        Map<String, Integer> peopleAges = Map.of(
                "Igor", 30,
                "Maxim", 30,
                "John", 25
        );
        System.out.println("peopleAges = " + peopleAges);
    }

    public static Map<String, Integer> getSmth() {
        return Collections.emptyMap();
    }
}
