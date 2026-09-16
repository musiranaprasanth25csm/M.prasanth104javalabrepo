class Employee
{
int empid;
String name;
double salary;

Employee()
{
empid=1;

name="arjun";

salary=45000;

}

void display()
{
System.out.println("employee details\n");
System.out.printf("empid=%d\n",empid);
System.out.printf("name=%s\n",name);
System.out.printf("salary=%.4f\n",salary);
}
}
class text1
{
public static void main(String[] args)
{
Employee a=new Employee();
a.display();
}
}