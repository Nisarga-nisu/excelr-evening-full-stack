class Driverclass 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello from Driver class");
	}
}
class Derived1 extends Driverclas
{
	static
	{
		Derived1.main(null);
	}
}
class Derived2 extends Driverclass
{
	static
	{
		Derived2.main(null);
	}
}
class mainclass
{
	public static void main(String[] args)
	{
		System.out.println("MainClass begin");
        System.out.println(Derived1.i);
		System.out.println(Derived2.j);
		System.out.println("Mainclass end");

}
}
