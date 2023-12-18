class Q
{

	static
		{

		//usage before decleration is not possible (IFR  (illegal forward refarance))
		System.out.println(i);
		}

		static int i=10;

	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
