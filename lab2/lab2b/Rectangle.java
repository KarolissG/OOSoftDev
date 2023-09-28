public class Rectangle
{
    private int length;
    private int width;

    public Rectangle()//constructor method
    {
        length=1;
        width=1;
    }
    public void setLength(int lengthIn)//setter methods
    {
        if(lengthIn>0 && lengthIn<=40)
            {
                length=lengthIn;
            }
    }
    public void setWidth(int widthIn)
    {
        if(widthIn>0 && widthIn<=40)
            {
                width=widthIn;
            }
    }
    public int getLength()//getter methods
    {
        return length;
    }
    public int getWidth()
    {
        return width;
    }
    public String toString()
    {
        return ("Length = "+length+"\nWidth = "+width);
    }
    public int getArea()
    {
        return length*width;
    }
    public int getPerimiter()
    {
        return (length*2)+(width*2);
    }
    public void printRectangle()
    {
        for (int i=0;i<width;i++)
            {
                System.out.print("\n");
                if (i == 0 || i == width-1)
                {
                    for (int x=0;x<length;x++)
                        {
                            System.out.print("*");
                        }
                }
                else
                {
                    for (int x=0;x<length;x++)
                        {
                            if(x==0 || x == length-1)
                            {
                            System.out.print("*");
                            }
                            else
                            {
                            System.out.print(" ");
                            }
                        }
                }
            }
    }
}
