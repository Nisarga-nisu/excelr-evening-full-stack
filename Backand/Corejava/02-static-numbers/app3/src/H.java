class G
{
     static int i = 10;

	static
	{
		System.out.println("G-SIB1");
	}
   static void tets() 
	{
		System.out.println("G-main");
	}
	static
	{
		System.out.println("G-SIB2");
	}
}
class H
{
	static
	{
		System.out.println("H-SIB1");
	}
	public static void main(String [] args)
	{
	System.out.println("H-main-begin");
	G.test();
	G.test();
	System.out.println(G.i);
	System.out.println(G.i);
	System.out.println("H-main-end");
	}
	static
	{
		System.out.println("H-SIB2");
	}
}
	