public class Circle extends Point implements Comparable<Circle> {

    private double radius;

    public Circle() {
        super(0, 0);
        this.radius = 1.0;
    }

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getSquare() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double circleLong() {
        return 2 * (radius * Math.PI);
    }

    public String toString() {
        return "X: " + super.getX() + "\n" +
                "Y: " + super.getY() + "\n" +
                "Radius: " + radius + "\n";
    }

    public int compareTo(Circle o) {
        return Double.compare(this.getSquare(), o.getSquare());
    }
}