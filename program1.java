class A
{
	int a=10;
	int b=20;}
class B extends A
{
	int a=30;
	int b=40;
	B(int a,int b)
	{
	this.a=a;
	this.b=b;}
void m(int a,int b)
{
System.out.println(a+b);
}

}

class program1
{
public static void main(String[] args)
{
B a=new B();
a.m(100,200);
System.out.println(a.a+a.b);

}
}