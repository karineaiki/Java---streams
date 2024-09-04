import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Shield {

    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Black Widow", 34, false));
        heroes.add(new Hero("Captain America", 100, false));
        heroes.add(new Hero("Vision", 3, true));
        heroes.add(new Hero("Iron Man", 48, false));
        heroes.add(new Hero("Scarlet Witch", 29, true));
        heroes.add(new Hero("Thor", 1501, false));
        heroes.add(new Hero("Spider-Man", 18, false));
        heroes.add(new Hero("Hulk", 49, true));
        heroes.add(new Hero("Doctor Strange", 42, false));

        heroes.stream()
            .filter(hero -> hero.getAge() >= 60);

        List<Hero> elders = (List<Hero>) heroes.stream()
            .filter(hero -> hero.getAge() >= 60)
            .collect(Collectors.toList());
            
        // TODO 1 : filter heroes in order to found heroes older than 59
        System.out.println("\nElders:");
        elders.forEach((elder) -> {System.out.println(elder.getName());});

        List<Hero> intolerants = (List<Hero>) heroes.stream()
            .filter(hero -> hero.isGlutenIntolerant())
            .collect(Collectors.toList());

        // TODO 2 : filter heroes in order to found heroes that are gluten intolerants
        System.out.println("\nGluten intolerants:");
        intolerants.forEach((intolerant) -> {System.out.println(intolerant.getName());});
    }
}
