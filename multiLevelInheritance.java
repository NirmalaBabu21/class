class House
{ public void printInfo()
    {
        System.out.println("House");
    }
}

class Room extends House
{
    public void printInfo(int rooms)
    {
        System.out.println("Rooms:"+ rooms);
    }
}

class cupbords extends Room
{
    public void printInfo(float cupboards)
    {
        System.out.println("Cupboards:"+ cupboards);
    }
}

public class multiLevelInheritance {

    public static void main(String args[])
    {
        cupbords c= new cupbords();
        c.printInfo(5);
    }
    
}
