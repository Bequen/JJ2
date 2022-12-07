package seminare.seminar05;

/**
 * AnimalType with name for each type and sound they make
 */
public enum AnimalType {
    DOG(1, "pes", "fena", "haf-haf"),
    DUCK(2, "kačer", "kačena", "ga-ga");

    private int index;
    public String male, female, sound;
    AnimalType(int index, String male, String female, String sound) {
        this.index = index;
        this.male = male;
        this.female = female;
        this.sound = sound;
    }
}
