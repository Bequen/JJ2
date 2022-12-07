package seminare.seminar03;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exam extends ITimelineItem implements IColor {
    private IAttribute[] attributes;

    public LocalDateTime time;

    public String name;
    public String place;

    public Exam(LocalDateTime time, String place, String name, int people, int max) {
        this.name = name;
        this.time = time;

        attributes = new IAttribute[] {
                new TimeAttribute(time),
                new PlaceAttribute(place),
                new AvailabilityAttribute(people, max)
        };
    }

    @Override
    public String getBackgroundColor() {
        if(time.toLocalDate() == LocalDate.now()) {
            return "#ffffff";
        } else {
            return "#000000";
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "Zkouska";
    }

    @Override
    public LocalDateTime getFrom() {
        return null;
    }

    @Override
    public LocalDateTime getTo() {
        return null;
    }
}
