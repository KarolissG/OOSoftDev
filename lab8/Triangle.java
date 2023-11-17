class Triangle extends TwoDShape {
    private double height;
    private double base;
    public Triangle(String name, String colour,double h,double b){
        super(name, colour);
        height=h;
        base=b;
    }
    public double area(){
        return (base/2.0)*height;
    }

    public String toString(){
        return super.toString()+"\nBase :"+base+"\nHeight :"+height;
    }
}
