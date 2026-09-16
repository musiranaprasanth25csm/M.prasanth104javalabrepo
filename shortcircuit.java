class shortcircuit
{
	public static void main(String[] args)
	{
	int i=10;
	int j=20;
	if((i++=10) && (j++=20))
	System.out.println(i);
	System.out.println(j);
	 
	 if((i++=10) || (j++=20))
		 System.out.println(i);
	 System.out.println(j);
	}
}
	