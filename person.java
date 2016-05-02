import java.io.*;

 class person
{
 protected String name,email;
public person(String name,String email)
{
  this.name=name;
  this.email=email;
 }

 public void print()
{
System.out.println(name);
}

public void setEmail(String email)
{
  this.email=email;


}
}

