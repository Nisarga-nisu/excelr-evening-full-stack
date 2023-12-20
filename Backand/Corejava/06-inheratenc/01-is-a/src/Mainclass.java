class Driverclass 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello from Driver class");
	}
}
class Derived1 extends Driverclass
{
	static int i;
	static
	{
		Derived1.main(null);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello from Derived1 class");
	}
}
class 
{
Derived2 extends Driverclass
{
	static int j;
	static
	{
		Derived2.Main(null);
	}
public static void main(String[] args) 
	{
		System.out.println("Hello from Derived2 class");
	}
}
class Mainclass
{
	public static void main(String[] args)
	{
		System.out.println("Mainclass begin");
        System.out.println(Derived1.i);
		System.out.println(Derived2.j);
		System.out.println("Mainclass end");

}
}
