class B
{
	static
	{
System.out.println("B-SIB1");
	}

	public static void main(String[] args) 
	{
		System.out.println("B-main");
	}
	static
	{
    System.out.println("A-SIB2");
	}
}
//SIB (static intilizer block)