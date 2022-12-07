package seminare.seminar04;

/**
 * Represents line segment with two points
 */
public class Line {
    public Point start, end;

    /**
     * Instantiates zero length line
     */
    public Line() {

    }

    /**
     * Instantiates line with two points
     * @param start start of the line
     * @param end end of the line
     */
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    /**
     * Calculates length of the line
     * @return Length of the line
     */
    public double getLength() {
        return Math.sqrt(start.getX() * end.getX() + start.getY() * end.getY());
    }

    /**
     * Returns distance to point from line
     * @param p point to which we are calculating distance
     * @return distance to the point
     */
    public double distance(Point p) {
        double a = this.start.getY() - this.end.getY();
        double b = this.end.getX() - this.start.getX();
        double c = this.start.getX() * this.end.getY() - this.end.getX() * this.start.getY();

        return Math.abs(a * start.getX() + b * start.getY() + c) / Math.sqrt(a * a + b * b);
    }
}
