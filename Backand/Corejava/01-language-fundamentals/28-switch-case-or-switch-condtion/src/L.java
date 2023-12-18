class L
{
	public static void main(String[] args) 
	{
		char ch ='a';//error
		switch(ch)//byte,short,int,char,string,enum type
		{
			case 'b':
				System.out.println("from case b");
			break;
			case 'c':
				System.out.println("from case c");
			break;
			case 'd':
				System.out.println("from case d");
		}
	}
}

