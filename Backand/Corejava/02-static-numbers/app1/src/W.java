class W
{
	static int i = 10;
	static int j = 20;
	static int K = (i += 100)+ (j *= 2);

	public static void main(String[] args) 
	{

		System.out.println(i);
		System.out.println(j);
		System.out.println(K);
	}
}
