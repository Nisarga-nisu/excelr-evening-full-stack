class S 
{
	int i;

	void test(int i);
	{
     System.out.println("from test(int): begin"+ i);
	 int.i=20;
	 System.out.println("from test(int): end"+ i);
	}
	public static void main(String[] args) 
	{
		S r1=new S();
		System.out.println("mian begin:"+s1.i);
		s1.i=10;
		System.out.println("before calling the test(S) method:"+s1.i);
		test(s1.i);
		System.out.println("aftre calling test(S) method:"+s1.i);
	}
}
//r1 ==source
/*
-channges in the destinaton refelecting to the source==>call by reference or pass by reference
-if your sending the reference there is 100% changes of object modification
-reference is like key to the object
*/