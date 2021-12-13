package hinhhoc;

public class Shape {
    private String color = "Green";
    private boolean filler = true;

    public Shape() {
    }

    public Shape(String color, boolean filler) {
        this.color = color;
        this.filler = filler;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiller() {
        return filler;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }

    @Override
    public String toString() {
        return "A hinhhoc2.Shape with color of " +
                getColor() +
                " And" +
                ((isFiller()) ? "filler" : "not filler");
    }
}
