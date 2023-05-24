class EmployeeInfo
{
    String name;
    int age;

    public void getInfo(String name, int age)
    {
        this.name= name;
        this.age=age;
    }

    public void printInfo()
    {
        System.out.println(name+" "+ age);
    }
}

public class Employee {
    public static void main(String args[])
    {
        EmployeeInfo E= new EmployeeInfo();
        String name= "Rahul";
        int age=25;
        E.getInfo(name, age);
        E.printInfo();
        
    }   
}
