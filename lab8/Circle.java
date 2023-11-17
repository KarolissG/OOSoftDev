class Circle extends TwoDShape
{
    private double radius;
    public Circle(String name, String colour,double radius)
    {
        super(name,colour);
        this.radius=radius;
    }
    public double area() {
        return (3.14*(Math.pow(this.radius, 2.0)));
    }

    public String toString()
    {
        return super.toString()+"\nRadius = "+this.radius;
    }
}
