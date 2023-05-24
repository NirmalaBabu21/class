class Pen
{
    String name;
    int age;

    public void printInfo()
    {   System.out.println("Parameterised Constructor");
        System.out.println(this.name+" "+this.age);
    }
    
    Pen(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}

public class parameterisedConstructor {
    
    public static void main (String args[])
    {
        Pen P=new Pen("Rahul",25);
        P.printInfo();
    }
}
