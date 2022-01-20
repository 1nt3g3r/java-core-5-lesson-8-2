package enumtests;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MyEnumSet{
    public static <T> Set<T> of(Class<T> cl) {
        return new HashSet<>(Arrays.asList(cl.getEnumConstants()));
    }

    public static void main(String[] args) {
        System.out.println("MyEnumSet.of(Season.class) = " + MyEnumSet.of(Season.class));
    }
}
