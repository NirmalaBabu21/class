class bag
{
    String name;
    int compartment;

    public void printInfo(String name)
    {   
        System.out.println(name);
    }

    public void printInfo(int compartment)
    {
        System.out.println(compartment);
    }

    public void printInfo(String name,int compartment)
    {
        System.out.println(name+" "+compartment);
    }

}
public class functionOverloading {

    public static void main(String args[])
{
    bag b=new bag();
    b.printInfo("Nike");
    b.printInfo(2);
    b.printInfo("Nike", 2);

}    
}
