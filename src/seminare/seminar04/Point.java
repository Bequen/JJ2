package seminare.seminar04;

import java.util.Objects;

public class Point {
    private double x;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    private double y;

    public Point() {
        this.x = this.y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double distance(Point p) {
        double x = this.x - p.x;
        double y = this.y - p.y;
        return Math.sqrt(x * x + y * y);
    }

    public Point Sub(Point p) {
        x -= p.x;
        y -= p.y;
        return this;
    }

    public Point Add(Point p) {
        x += p.x;
        y += p.y;
        return this;
    }

    public Point normalized() {
        Point normalized = new Point(x,  y);
        double len = normalized.distance(new Point());
        normalized.x /= len;
        normalized.y /= len;
        return normalized;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
