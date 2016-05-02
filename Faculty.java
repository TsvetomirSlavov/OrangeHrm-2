import java.io.*;

class Faculty extends person
{
 protected String subjects;
 

public Faculty(String name,String email,String subjects)
{
  super(name,email);

this.subjects=subjects;
}
public void print()
{
super.print();
System.out.println(subjects);

}

public void setSubjects(String subjects)
{

 this.subjects=subjects;
}
}


