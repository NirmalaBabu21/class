class Mobile
{ public void printInfo()
    {
        System.out.println("I am your mobile, say Hii!!!!!!!!!!!!!!!!");
    }
}
class Redmi extends Mobile
{
    public void display()
    {
        System.out.println("I am Redmi, Hello!!!!!!!!!");
    }
}
class Realme extends Mobile
{
    public void show()
    {
        System.out.println("I name is Realme, nice to meet u!!!!!!!");
    }
}
public class HierachialInheritance {

    public static void main(String args[])
    {
        Realme R1=new Realme();
        Redmi R2=new Redmi();
        R1.printInfo();
        R2.printInfo();
    }
    
}
