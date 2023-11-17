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
