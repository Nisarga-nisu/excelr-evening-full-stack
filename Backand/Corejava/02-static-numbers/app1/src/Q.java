class Q
{
	static int i;//compound assignements
	static int j = i = 10;

	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
