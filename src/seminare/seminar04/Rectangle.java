package seminare.seminar04;

public class Rectangle extends Shape {
    Point a, b;

    public Rectangle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(Point start, double width, double height) {
        this.a = start;
        this.b = new Point(this.a.getX() + width, this.a.getY() + height);
    }

    @Override
    public double getArea() {
        return Math.abs(this.b.getX() - this.a.getX()) *
                Math.abs(this.b.getY() - this.a.getY());
    }

    @Override
    public double distance(Point p) {
        double minimum = Double.MAX_VALUE;
        double width = Math.abs(a.getX() - b.getX());
        double height = Math.abs(a.getY() - b.getY());

        Point from = new Point(Math.min(a.getX(), b.getX()), Math.min(a.getY(), b.getY()));

        for(int i = 0; i < 2; i++) {
            Line lineVertical = new Line(from, new Point(from.getX() + width * i, from.getY() + height));
            Line lineHorizontal = new Line(from, new Point(from.getX() + width, from.getY() + height* i));

            minimum = Math.min(lineVertical.distance(p), minimum);
            minimum = Math.min(lineHorizontal.distance(p), minimum);
        }

        return minimum;
    }
}
