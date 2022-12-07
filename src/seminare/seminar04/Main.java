package seminare.seminar04;

public class Main {
    public static void Main() {
        Line line = new Line(new Point(0, 0), new Point(2, 0));
        System.out.println(line.distance(new Point(1, 2)));
    }
}
