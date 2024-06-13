import clients.Animal;
import clients.Owner;
import clients.impl.Cat;
import clients.impl.Dog;

import java.time.LocalDate;
import java.util.HashMap;



public class Main {
    public static void main(String[] args) {
        Cat a = new Cat(1, "Barsik", LocalDate.of(2020, 3, 14), new Owner(999), false);
        System.out.println(a.getName());
        Dog d = new Dog(2, "Sharik", LocalDate.of(2018, 5, 19), new Owner(888));
        Animal b = new Cat(1, "Barsik", LocalDate.of(2020, 3, 14), new Owner(999), false);
        System.out.println(a.getType());
        System.out.println(d.getType());
        HashMap<Animal, Owner> animalOwner = new HashMap<>();
        animalOwner.put(a, a.getOwner());
        animalOwner.put(d, d.getOwner());
        animalOwner.put(b, b.getOwner());
//        System.out.println(animalOwner);
        System.out.println(animalOwner.get(new Cat(1, "Barsik", LocalDate.of(2020, 3, 14), new Owner(999), false)));
        Cat.meow();
    }
}
