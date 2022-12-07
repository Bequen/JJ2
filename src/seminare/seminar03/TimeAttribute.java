package seminare.seminar03;

import java.time.LocalDateTime;

public class TimeAttribute implements IAttribute {
    public LocalDateTime time;

    public TimeAttribute(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String getIcon() {
        return "hodiny";
    }

    @Override
    public String getContent() {
        return time.toString();
    }
}
