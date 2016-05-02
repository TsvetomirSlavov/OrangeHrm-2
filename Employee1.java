import java.io.*;
public class Employee1
{
  private String name;
  private int salary;

public void init(String n,int sal)
{

  name=n;
  salary=sal;
}
  public void print()
{
   System.out.println(name);
   System.out.println(salary);
}

   public void SetSalary(int sal)
{
  salary=sal;

}
   public int getSalary()
{
       return salary;

}
    }
