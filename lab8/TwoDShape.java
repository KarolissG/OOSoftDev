public abstract class TwoDShape extends Shape {
    public TwoDShape(String name, String colour) {
        super(name, colour);
    }

    public abstract double area();

    public String toString() {
        return (super.toString());
    }
}

class Circle extends TwoDShape
{
    private double radius;
    public Circle(String name, String colour,double radius)
    {
        super(name,colour);
        this.radius=radius;
    }
    public double area() {
        return (3.14*(radius*radius));
    }

    public String toString()
    {
        return super.toString()+"\nRadius = "+this.radius;
    }
}

class Rectangle extends TwoDShape
{
    private double l;
    private double w;
    public Rectangle(String name, String colour,double l,double w)
    {
        super(name,colour);
        this.l=l;
        this.w=w;      
    }
    public double area() {
        return l*w;
    }
    public String toString()
    {
        return super.toString()+"\nLenght = "+this.l+"\nWidth = "+this.w;
    }
}

