package enumtests;

import java.util.*;

public class SeasonTests {
    public static void main(String[] args) {
        //Use simple Map
        Map<Season, String> seasonDescriptions = new EnumMap<>(Season.class);
        //new HashMap<>();
        seasonDescriptions.put(Season.autumn, "Leaves falls");

        System.out.println("seasonDescriptions = " + seasonDescriptions);

        EnumSet<Season> allSeasons = EnumSet.allOf(Season.class);
        System.out.println("shouldIHaveVacation(allSeasons) = " + shouldIHaveVacation(allSeasons));
        System.out.println("allSeasons = " + allSeasons);

        EnumSet<Season> allButNotWinter = EnumSet.complementOf(
                EnumSet.of(Season.winter)
        );
        System.out.println("allButNotWinter = " + allButNotWinter);
    }

    public static boolean shouldIHaveVacation(Collection<Season> seasons) {
        return seasons.contains(Season.summer) || seasons.contains(Season.spring);
    }
}
