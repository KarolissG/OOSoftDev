// Student Name 	: Karolis Grigaliunas
// Student Id Number: C00287940

public class RectangleTest 
{
    public static void main(String args[])
    {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setLength(5);
        rectangle1.setWidth(4);
        System.out.println(rectangle1.toString());
        System.out.println("Area = "+rectangle1.getArea());
        System.out.println("Perimiter = "+rectangle1.getPerimiter());
        rectangle1.printRectangle();
    }   
}
