class W
	{
	public static void main(String[] args)
    {
 
        int a = 10 ;
        int b = 5;
		int c = 8;
		int d = 12;
		int e = 7;

        int minvalue = (a < b) ? ((a < c) ? ((a < d) ? ((a < e) ? a : e) :((d < e) ? d : e)) : ((c < d) ? ((c < e) ? c: e) : ((d < e) ? d : e)) : ((b< c)? (( b < d) ? ((b < e) ? b : e ) : ((d : e )) : ((c < d) ? (( c< e ) ? c : e ) : (( d < e ) ? d : e));
        System.out.println("minimum value:" + minvalue);
    }
}