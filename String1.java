class String1 {
  public static void main(String args[]) {


/* Combine two strings */
    		String s2 = "Java ";		    				
    		String s3 = "Programming";		     	
    		String joinedString = s2.concat(s3);	     		     // join two strings
    		System.out.println("Concatenation of two Strings: " + joinedString);

/* Compare if the strings are equal */
    		String s4 = "java programming";
    		String s5 = "JAVA PROGRAMMING";
    		String s6 = "python programming";

    		boolean result1 = s4.equals(s5);			          // compare first and second strings
    		System.out.println("Strings first and second are equal: " + result1);

 		boolean result2 = s4.equalsIgnoreCase(s5);
		System.out.println("Strings first and second are equal: " + result2);  		

    		boolean result3 = s4.equals(s6);			         // compare first and third strings
    		System.out.println("Strings first and third are equal: " + result3);      

 }
}