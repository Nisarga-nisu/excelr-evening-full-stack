class G 
{
		static int i;
		static void test()
		{
		System.out.println("from test begin:"+i);
		i = 20;
		System.out.println("from test end:"+i);
	}
		public static void main(String[] args) 
		{
	System.out.println("from begin:"+i);
	i =10;
	test();
	System.out.println("from end:"+i);
	}
}
