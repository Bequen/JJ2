package seminare.seminar03;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class ITimelineItem implements IColor {
    LocalDateTime from;

    protected IAttribute[] attributes;
    public IAttribute[] getAttributes() {
        return attributes;
    }
    public String getName() {
        return "";
    }
    public String getType() {
        return "";
    }

    public abstract LocalDateTime getFrom();

    public abstract LocalDateTime getTo();

    public void print() {
        System.out.println("==================================");
        System.out.println(getName());
        System.out.println(getType());
        for(IAttribute attr : attributes) {
            System.out.println(attr.getIcon() + attr.getContent());
        }
        System.out.println("==================================");
    }

    public LocalDateTime getStart() {
        return LocalDateTime.now();
    }
}
