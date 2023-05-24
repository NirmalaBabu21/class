class Student
{
  String name;
  int age;
  
  public void getInfo()
  {
    name="Rahul";
    age =25;
  }

  public void printInfo()
  {
    System.out.println(name+" "+age);
  }

  Student()
  {
    System.out.println("Non-parametrised constructer");
  }
}
public class nonParameterisedConstructor 
{
    public static void main(String args[])
    {
        Student S1= new Student();
        S1.getInfo();
        S1.printInfo();

    }

}
    

