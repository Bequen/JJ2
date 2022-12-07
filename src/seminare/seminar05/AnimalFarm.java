package seminare.seminar05;

import java.util.ArrayList;
import java.util.List;

/**
 * AnimalFarm
 * Contains animals
 */
public class AnimalFarm {
    /**
     * Animals on the farm
     */
    public List<Animal> animals;

    /**
     * Constructs AnimalFarm
     */
    public AnimalFarm() {
        animals = new ArrayList<Animal>();
    }

    /**
     * Adds animal to farm
     * @param animal animal to add
     */
    public void add(Animal animal) {
        animals.add(animal);
    }

    /**
     * Lists and prints all the animals on the farm
     */
    public void list() {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}
