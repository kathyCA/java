class bank
{
int a;
int getRateOfInterest()
{
return 0;
}
}
class SBI extends bank
{
int getRateOfInterest()
{
int a = 9;
return a;
}
}
class ICICI extends bank
{
int getRateOfInterest()
{
int a = 8;
return a;
}
}
class AXIS extends bank
{
int getRateOfInterest()
{
int a = 11;
return a;
}
}
class test
{
public static void main(String args[])
{
SBI s = new SBI();
ICICI i = new ICICI();
AXIS a = new AXIS();
System.out.println("SBI INTEREST =" +s.getRateOfInterest());
System.out.println("ICICI INTEREST =" +i.getRateOfInterest());
System.out.println("AXIS INTEREST =" +a.getRateOfInterest());
}
}

