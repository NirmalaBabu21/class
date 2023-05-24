class Company
{ 
    public void printInfo()
    {
        System.out.println("Company !!!!");
    }
}

class TCS extends Company
{
    public void display()
    {
        System.out.println("TCS");
    }
}
class Infosys extends Company
{
    public void show()
    {
        System.out.println("Infosys");
    }
}
class Employees extends TCS
{
    public void appear()
    {
        System.out.println("Rahul");
    }
}
public class HybridInheritance {
    public static void main(String args[])
    {
        Employees E=new Employees();
        E.printInfo();
    }
}
