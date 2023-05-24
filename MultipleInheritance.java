interface Animals
{int eyes=2; // this will be fixed, and cannot be changed, ie in interfaces the declared variables will be fixed, static and  public
void walk();// by deafult it will be abtract and the the function body will not be written in interfaces
}

interface Herbivorse
{}

class Horses implements Animals, Herbivorse
{
    public void walk()
    {
        System.out.println("Walk");
        System.out.println(eyes);
    }
}
public class MultipleInheritance {
    public static void main (String args[])
    {
        Horses h=new Horses();
        h.walk();
    }
}
