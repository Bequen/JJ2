package seminare.seminar04;

public class Circle extends Shape {
    Point center;
    double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double distance(Point p) {
        return p.distance(center) - radius;
    }
}
