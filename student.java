class student
{
 String name;
 int rollno;
 double cgpa;
 void display()
 {
 System.out.printf("rollno:" +rollno);
 System.out.println("\nname:" +name);
 System.out.println("cgpa:" +cgpa);
 
 }
}
class details
{

public static void main(String[] args)
{
	student s1=new student();
	s1.rollno=98;
	s1.name="anand";
	s1.cgpa=9.22;
	s1.display();
}
}