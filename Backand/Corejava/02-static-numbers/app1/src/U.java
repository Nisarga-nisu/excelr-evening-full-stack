class U 
{
	static int i = j;//illigal reference forward
	static int j;

	public static void main(String[] args) 
	{

		System.out.println(i);
		System.out.println(j);
	}
}
//error