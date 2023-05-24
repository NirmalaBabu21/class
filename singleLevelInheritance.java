class Shape
{
    public void printArea()
    {
        System.out.println("Displaying area");
    }
}

class Triangle extends Shape
{
    public void printArea(int l, int h)
    {
        System.out.println((l*h)/2);
    }
}
public class singleLevelInheritance {
    public static void main(String args[])
    {
        Triangle T=new Triangle();
        T.printArea();
        T.printArea(12,20);
     
    }
}
