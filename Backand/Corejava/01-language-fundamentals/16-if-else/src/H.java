class H
{
	public static void main(String[] args) 
	{
		int i =0;
		if((i++ = 1) && (i++ = 1))
		{
			System.out.println("from if");
		}
		System.out.println("end of main");
		System.out.println(i);
	}
}
