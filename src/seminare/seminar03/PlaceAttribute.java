package seminare.seminar03;

public class PlaceAttribute implements IAttribute {
    private String place;

    public PlaceAttribute(String place) {
        this.place = place;
    }

    @Override
    public String getIcon() {
        return "mistecko";
    }

    @Override
    public String getContent() {
        return place;
    }
}
