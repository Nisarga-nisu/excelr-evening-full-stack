class V 
{
	public static void main(String[] args) 
	{
		//error
		// first i not get the value
		int i;
		int j = 10 + i + (i = 20);
		System.out.println(i);
		System.out.println(j);
	}
}