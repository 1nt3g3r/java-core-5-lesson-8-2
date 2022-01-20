package breaktypetests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BreakTypeTests {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();

        List anotherList = items;

        anotherList.add(1);
        anotherList.add("Test");
        anotherList.add(Map.of("key", 150));

        HashMap m;
        for(Object o: items) {
            System.out.println("o = " + o);
            System.out.println("o.getClass() = " + o.getClass());
        }
    }
}
