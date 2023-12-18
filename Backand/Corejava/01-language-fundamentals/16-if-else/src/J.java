class J 
{
	public static void main(String[] args) 
	{
		if(false)
		{
		System.out.println("outer-if-begin");
		if(true)
			{
			if(true)
				{
				if(true)
					System.out.println("outer-if-begin");
				}
			}
		}
		System.out.println("counter-if-end");
	}
}



	