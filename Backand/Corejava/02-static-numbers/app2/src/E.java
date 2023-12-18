class E 
{
	static int i =test1();
	static int j =test2();

    static int test1()
	{
		System.out.println("executing all the statement of test1");
		return  10;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
	static int test2()
	{
		System.out.println("executing all the statement of test2");
		return  20;
	}
}
