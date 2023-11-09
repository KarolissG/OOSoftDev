public abstract class ThreeDShape extends Shape {
    public ThreeDShape(String name, String colour) {
        super(name, colour);
    }

    public abstract double volume();

    public String toString() {
        return (super.toString());
    }
}
class Cylinder extends ThreeDShape
{
    private int h;
    private int r;
    public Cylinder(String name, String colour,int height,int radius)
    {
        super(name, colour);
        h=height;
        r=radius;
    }
    public double area() {
        return (2*3.13*(r*r))+(2*3.14*r*h);
    }
    public double volume()
    {
        return 3.14*(r*r)*h;
    }
    public String toString()
    {
        return super.toString()+"\nHeight = "+this.h+"\nRadius = "+this.r;
    }
}

class Sphere extends ThreeDShape
{
    private int radius;

    public Sphere(String name, String colour,int r)
    {
        super(name, colour);
        this.radius=r;
    }
    public double area() {
        return (4.0*3.14*(radius*radius));
    }
    public double volume()
    {
        return (4.0/3.0)*3.14*(radius*radius*radius);
    }
    public String toString()
    {
        return super.toString()+"\nRadius = "+this.radius;
    }

}