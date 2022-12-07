package seminare.seminar05;

public class Main {
    public static String formatStr(String format, Object ... args) {
        int index = 0;
        for(Object arg : args) {
            format = format.replaceAll("%" + index++, arg.toString());
        }
        return format;
    }

    public static void Main() {
        System.out.println(formatStr("A: %0; B: %1", 1, 1.6));

        AnimalFarm farm = new AnimalFarm();
        farm.add(new Animal("Alik", AnimalType.DOG, Gender.MALE));
        farm.add(new Animal("Bobik", AnimalType.DUCK, Gender.FEMALE));
        farm.add(new Animal("Chubaka", AnimalType.DOG, Gender.FEMALE));
        farm.add(new Animal("Donald", AnimalType.DUCK, Gender.MALE));

        farm.list();
    }
}
