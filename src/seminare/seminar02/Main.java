package seminare.seminar02;

public class Main {
    public static void MyMain() {
        Country[] countries = new Country[] {
                new Country("czech republic", "+420"),
                new Country("slovakia", "+421"),
                new Country("madarsko", "+1")
        };

        Person[] persons = new Person[] {
                new Person(0, "Prokop", "Dvere", 10, "555444333", countries[0]),
                new Person(1, "Tomas", "Putna", 12,"999888777", countries[0]),
                new Person(2, "Fero", "Dunaj", 12,"123456789", countries[1]),
                new Person(3, "Johnny", "Cash", 12,"7654321", countries[2]),
        };
        Index index = new Index(persons, countries);
        index.print();
    }
}
