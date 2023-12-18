class O 
{
	public static void main(String[] args) 
	{
		int firstnum = 5;
		int secondnum = 11;
		int thirdnum = 10;
		 
		int min = ( firstnum < secondnum && firstnum < thirdnum ) ? firstnum : ((secondnum < thirdnum ) ? secondnum : thirdnum) ;

		System.out.println(min);
	}
}
