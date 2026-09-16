class animal
{
	void breathe()
	{
	System.out.println("breathes");
	}
}
class mammal extends animal
{
	void walk()
	{
	System.out.println("walks");
	}
}
class dog extends mammal
{
	void bark()
	{
	System.out.println("barks");
	}
}
class animals
{
	public static void main(String[] args)
	{
	dog d=new dog();
	d.breathe();
	d.walk();
	d.bark();
	}
}