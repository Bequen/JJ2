package seminare.seminar08.generic;

import java.lang.Number;

public class BoxNumber {
    private Number value;

    public BoxNumber(Number value) {
        this.value = value;
    }

    public Number getValue() {
        return value;
    }

    public void setValue(Number value) {
        this.value = value;
    }
}
