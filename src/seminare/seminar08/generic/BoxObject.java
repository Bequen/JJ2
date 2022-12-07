package seminare.seminar08.generic;

public class BoxObject {

    private Object value;

    public BoxObject(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
