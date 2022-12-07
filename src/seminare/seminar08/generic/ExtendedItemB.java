package seminare.seminar08.generic;

//dummy trida pro ukazku ComaprablePair
//projdete komentare k ExtendedItemA - je to to same...
public class ExtendedItemB extends BaseItem implements Comparable<ExtendedItemA> {

    private int myValue;

    public ExtendedItemB(int baseValue, int specificValue) {
        super(baseValue);
        myValue = specificValue;
    }

    public int getMyValue() {
        return myValue;
    }


    @Override
    public int compareTo(ExtendedItemA extendedItemA) {
        double compVal = myValue * value - extendedItemA.getMyValue() * extendedItemA.value;
        return (compVal == 0 ? 0 : (compVal < 0) ? -1 : 1);
    }

    @Override
    public String toString(){
        return String.format("B %d %d", value, myValue);
    }
}
