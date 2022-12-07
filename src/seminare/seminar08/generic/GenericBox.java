package seminare.seminar08.generic;


//ukazka jednoduche geneicke tridy
// z teto genericke tridy lze specifikovanim typoveho parametru T
// vytvorit libovolnou z krabic v ostanich Box* tridach
// anebo i nejakou jinou...
public class GenericBox<T> {

    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
