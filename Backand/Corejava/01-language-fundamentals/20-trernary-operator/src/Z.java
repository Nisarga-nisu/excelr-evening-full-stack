class Z  
		{
    public static void main(String[] args)
    {
 
        // variable declaration
        int n1 = 5, n2 = 10, n3 =15, min;
 
        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);
		System.out.println("third num: " + n3);
 
        // Largest among n1 and n2
        min = (n1 < n2) ? (n1 < n3 ? n1 : n3) : (n2 < n3 ? n2 : n3)  ;
 
        // Print the largest number
        System.out.println("minimum is = " + min);
    }
}