class explicit
{
	public static void main(String[] args)
	{
	int i=10;
	byte b=(byte)i;
	System.out.println(i/10+"..."+b/10);
	
	int k=100;
	char c=(char)k;
	System.out.println(k+"..."+c);
	
	long l=1001;
	char d=(char)l;
	System.out.println(l+"..."+d);
	
	long o=100l;
	int j=(int)o;
	System.out.println(o+"..."+j);
	}
}