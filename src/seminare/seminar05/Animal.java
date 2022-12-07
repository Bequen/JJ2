package seminare.seminar05;

/**
 * Stores information about animal to be used in AnimalFarm
 */
public class Animal {
    private String name;
    private AnimalType type;
    private Gender gender;

    /**
     * Constructs Animal
     * @param name Name of the animal
     * @param type Animal type
     * @param gender Gender of an animal
     */
    public Animal(String name, AnimalType type, Gender gender) {
        this.name = name;
        this.type = type;
        this.gender = gender;
    }

    @Override
    public String toString() {
        String whatTheFuckitIs = gender == Gender.MALE ? type.male : type.female;
        return name + " je " + whatTheFuckitIs + " a dělá \"" + type.sound + "\".";
    }
}
