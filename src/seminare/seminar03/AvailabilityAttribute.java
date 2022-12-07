package seminare.seminar03;

public class AvailabilityAttribute implements IAttribute {
    private int people;
    private int max;

    public AvailabilityAttribute(int people, int max) {
        this.people = people;
        this.max = max;
    }

    @Override
    public String getIcon() {
        return "peple";
    }

    @Override
    public String getContent() {
        return people + "/" + max;
    }
}
