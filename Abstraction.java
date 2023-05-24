abstract class Animal
{   Animal(){System.out.println("Creating an animal");}
    abstract void walk();
    public void eat(){System.out.println("eat");}
}
class Horse extends Animal
{   Horse(){System.out.println("I am a Horse");}
    public void walk()
    {System.out.println("Walks on four legs");}
}
class Hen extends Animal
{
    public void walk()
    {System.out.println("Walks on two legs");}
}
public class Abstraction {
    public static void main(String args[])
    {
        Horse h=new Horse();
        h.walk();
        h.eat();
    }
    
}
