class S 
{
	int i;

	 static void test(S ref)
	{
     System.out.println("from test(int): begin"+ ref.i);
	 ref.i = 20;
	 System.out.println("from test(int): end"+ ref.i);
	}
	public static void main(String[] args) 
	{
		S s1=new S();
		System.out.println("mian begin:"+s1.i);
		s1.i=10;//s1 is reference
		//s1.i is value is value
		System.out.println("before calling the test(S) method:"+s1.i);
		test(s1);
		System.out.println("aftre calling test(S) method:"+s1.i);
	}
}
/*
call by value /pass by value
-chenge in the destination would not be reflecting to the source
-because we are not sendingg the reference insted we rae sending the value 
-value is not a key to the object(refernce is a key to the obejct)
-we are sending only value not the key,so there is 0% of object
*/