class CAR
{
void run()
{
System.out.println("CAR is running");
}
}
class bike extends CAR
{
void run()
{
System.out.println("bike is running");
}
public static void main(String[] args)
{
bike obj=new bike();
obj.run();
}
}
