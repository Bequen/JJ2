package seminare.seminar03;

import java.time.LocalDateTime;

public class TimeRangeAttribute implements IAttribute {
    public LocalDateTime from;
    public LocalDateTime to;

    public TimeRangeAttribute(LocalDateTime from, LocalDateTime to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String getIcon() {
        return "hodiny";
    }

    @Override
    public String getContent() {
        return from.toString() + "-" + to.toString();
    }
}
