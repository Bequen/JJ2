import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import seminare.seminar05.Animal;
import seminare.seminar05.AnimalFarm;
import seminare.seminar05.AnimalType;
import seminare.seminar05.Gender;

public class AnimalTests {

    Animal alik;
    Animal bobik;
    Animal chubaka;
    Animal donald;

    AnimalFarm farm;

    @BeforeEach
    public void PrepareConstants() {
        alik = new Animal("Alík", AnimalType.DOG, Gender.MALE);
        bobik = new Animal("Bobík", AnimalType.DUCK, Gender.FEMALE);
        chubaka = new Animal("Chubaka", AnimalType.DOG, Gender.FEMALE);
        donald = new Animal("Donald", AnimalType.DUCK, Gender.MALE);

        farm = new AnimalFarm();
    }

    @Test
    public void addToFarmTest() {
        farm.add(alik);
        farm.add(bobik);
        farm.add(chubaka);
        farm.add(donald);
    }

    @Test
    public void animalStringTest() {
        String t = alik.toString();
        assert ("Alík je pes a dělá \"haf-haf\".".equals(alik.toString()));
        assert ("Bobík je kačena a dělá \"ga-ga\".".equals(bobik.toString()));
        assert ("Chubaka je fena a dělá \"haf-haf\".".equals(chubaka.toString()));
        assert ("Donald je kačer a dělá \"ga-ga\".".equals(donald.toString()));
    }
}
