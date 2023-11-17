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