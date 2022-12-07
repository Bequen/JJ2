package seminare.seminar03;

import java.time.LocalDateTime;

public class Course extends ITimelineItem {

    private String name;

    private LocalDateTime from;
    private LocalDateTime to;

    private String location;

    private String type;

    public Course(String name, String type, LocalDateTime from, LocalDateTime to, String location) {
        this.name = name;
        this.type = type;
        this.from = from;
        this.to = to;
        this.location = location;

        attributes = new IAttribute[] {
                new TimeRangeAttribute(from, to),
                new PlaceAttribute(location)
        };
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public LocalDateTime getFrom() {
        return null;
    }

    @Override
    public LocalDateTime getTo() {
        return null;
    }

    @Override
    public String getBackgroundColor() {
        switch(type) {
            case "Exercise":
                return "#ff0000";
            case "Seminar":
                return "#00ff00";
        }
        return "#ffffff";
    }
}
