class Car
{
    String name, color;

    public void printInfo()
    {
        System.out.println("Copy Constructor");
        System.out.println(name+" "+color);

    }

    public void getInfo(String name, String color)
    {
        this.name=name;
        this.color=color;
    }

    Car( Car c)
    {
        this.name=c.name;
        this.color=c.color;
    }
    Car()
    {}
}
public class copyConstructor {
    public static void main(String args[])
    {
        Car c1=new Car();
        c1.getInfo("Maruthi", "Black");
        Car c2= new Car(c1);
        c2.printInfo();
    }
}
