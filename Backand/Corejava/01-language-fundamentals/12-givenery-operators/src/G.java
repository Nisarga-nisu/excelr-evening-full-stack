class G 
{
	public static void main(String[] args) 
	{
		int x = 0;
        int y = x++ + x++ + x++ + x;// 0 + 1 + 2+ 3;
		System.out.println(x);//3
	    System.out.println(y);//4
	}
}
// 0,1,2,3