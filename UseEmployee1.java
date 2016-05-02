import java.io.*;
public class UseEmployee1

{
  public static void main(String args[])
{

  Employee1 e;
  e=new Employee1();
e.init("kiran",25000);
e.print();
e.SetSalary(30000);

  if(e.getSalary() >30000)
   System.out.println("Actual salary");

}
}
