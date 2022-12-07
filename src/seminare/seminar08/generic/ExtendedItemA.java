package seminare.seminar08.generic;

//dummy trida pro ukazku podminek na typove parametry v ComaprablePair
//vidite, ze Comparable je genericke rozhrani, zde vyzaduji porovnatelnost s druhou dummy tridou
public class ExtendedItemA extends BaseItem implements Comparable<ExtendedItemB>{

    private double myValue;

    public ExtendedItemA(int baseValue, double specificValue) {
        super(baseValue);
        myValue = specificValue;
    }

    public double getMyValue() {
        return myValue;
    }

    //implementace vyzadovana rozhranim comparable (vsimnete si typu parametru - dle generickeho parametru urceneho v implements)
    @Override
    public int compareTo(ExtendedItemB extendedItemB) {
        double compVal = myValue * value - extendedItemB.getMyValue() * extendedItemB.value;
        return (compVal == 0 ? 0 : (compVal < 0) ? -1 : 1);
    }

    //pro hezci vypis - zkuste, co se vypise, kdyz tuto metodu zrusite
    @Override
    public String toString(){
        return String.format("A %d %f", value, myValue);
    }
}
