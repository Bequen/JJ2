package seminare.seminar03;

import java.time.LocalDateTime;

public class Main {
    public static void Main() {
        Course[] courses = new Course[]{
                new Course("Softwarove inzenyrstvi", "Prednaska",
                        LocalDateTime.of(2023, 3, 3, 10, 0, 0),
                        LocalDateTime.of(2023, 3, 3, 10, 0, 0),
                        "E3000"),
                new Course("Databazove systemy 2", "Cviko",
                        LocalDateTime.of(2023, 3, 3, 10, 0, 0),
                        LocalDateTime.of(2023, 3, 3, 10, 0, 0),
                        "E3000"),
        };

        Timeline timeline = new Timeline(courses);
    }
}
