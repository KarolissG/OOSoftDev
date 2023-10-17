class Circle extends Point {
    private static int radius;

    public Circle() {
    }

    public Circle(int x, int y, int r) {
        super(x, y);
        radius = r;
    }

    public void setRadius(int r) {
        radius = r;
    }

    public static int getRadius() {
        return radius;
    }

    public String toString() {
        return "\nx= " + x + "\ny= " + y + "\nr= " + radius;
    }

}
