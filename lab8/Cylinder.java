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
        return (2*3.13*(Math.pow(r,2.0)))+(2*3.14*r*h);
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