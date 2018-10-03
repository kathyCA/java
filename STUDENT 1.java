interface sturoll
{
void rollno();
}
interface stuname extends sturoll
{
void name();
}
interface stubranch extends sturoll
{
void branch();
}
class STUDENT implements stuname
{
public void rollno()
{
System.out.println("16ug10013");
}
public void name()
{
System.out.println("katherine");
}
public void branch()
{
System.out.println("IT");
}
public static  void main(String[]args)
{
STUDENT s=new STUDENT();
System.out.println("roll no:");
s.rollno();
System.out.println("name:");
s.name();
System.out.println("branch:");
s.branch()
}
}

