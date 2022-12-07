package seminare.seminar03;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Timeline {
    private ITimelineItem[] items;

    public Timeline(ITimelineItem[] items) {
        this.items = items;
    }

    private void drawDayHeader(LocalDate date) {
        // Something
    }

    private long getInterval(LocalDateTime begin, LocalDateTime end) {
        // Casovy interval
        Duration duration = Duration.between(begin, end);
        return duration.toMinutes();
    }

    private void drawPause(LocalDateTime begin, LocalDateTime end) {

    }

    public void draw() {
        LocalDate day = LocalDate.now();
        LocalDateTime lastTime = LocalDateTime.now();

        for(ITimelineItem item : items) {
            LocalDateTime start = item.getStart();
            if(day != start.toLocalDate()) {
                drawDayHeader(day);
            } else {
                if(getInterval(lastTime, start) > 15) {
                    drawPause(lastTime, start);
                }
            }
        }
    }
}
