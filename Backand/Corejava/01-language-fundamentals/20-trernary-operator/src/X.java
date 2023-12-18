class X
	{
	public static void main(String[] args)
    {
 
        int firstnum = 10;
        int secondnum = 5;     
		int thirdnum = 8;
		int fourthnum = 12;

        int min = (firstnum < secondnum && firstnum < thirdnum && firstnum < fourthnum) ? firstnum :( secondnum < thirdnum && secondnum < fourthnum) ? secondnum : (thirdnum < fourthnum) ? thirdnum : fourthnum;
        System.out.println(min);
    }
}