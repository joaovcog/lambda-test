package lambda;

import java.util.function.Predicate;

/**
 *
 * @author joaov
 */
public class FindMatchingAnimals {

    private static void print(Animal a, CheckTrait check) {
        if (check.test(a)) {
            System.out.println(a.getSpecies());
        }
    }
    
    private static void printWithPredicate(Animal a, Predicate<Animal> check) {
        if (check.test(a)) {
            System.out.println(a.getSpecies());
        }
    }

    public static void main(String[] args) {
        print(new Animal("Kangaroo", true, false), a -> a.canHop());
        print(new Animal("Fish", false, true), (Animal a) -> {
            int x = 0;
            Animal b;
            System.out.println(a.getSpecies() + " can hop? " + a.canHop());
            return a.canHop();
        });
    }
}
