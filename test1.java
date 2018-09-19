class X
{
   public void methodX()
   {
     System.out.println("Class X method");
   }
}
class Y extends X
{
public void methodY()
{
System.out.println("class Y method");
}
}
class test1 extends Y
{
   public void methodtest1()
   {
     System.out.println("class test1 method");
   }
   public static void main(String args[])
   {
     test1 obj = new test1();
     obj.methodX(); 
     obj.methodY(); 
     obj.methodtest1();
  }
}
