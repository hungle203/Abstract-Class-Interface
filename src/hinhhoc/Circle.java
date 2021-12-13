package hinhhoc;

public class Circle extends Shape    {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filler, double radius) {
        super(color, filler);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "hinhhoc2.Circle{" + super.toString() +
                "radius= " + radius +
                '}';
    }
}
