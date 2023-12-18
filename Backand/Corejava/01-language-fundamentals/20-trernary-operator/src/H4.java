class H 
		{
    public static void main(String[] args)
    {
 
        int a = 10 ;
        int b = 5;
		int c = 8;
		int d = 12;

        int minvalue = (a < b) ? ((a < c) ? ((a < d) ? a : d) :(( c < d) ? c : d)) : ((b < c) ? ((b < d) ? b : d) : ((c < d) ? c : d));
 
        System.out.println("minimum value:" + minivalue);
    }
}