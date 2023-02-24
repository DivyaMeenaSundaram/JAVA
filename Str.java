class Str{
public static void main (String args[]){
String s1="Hi hello how are you hello ";
System.out.println("Given String is:\t" +s1);
System.out.println("..........");
System.out.println("Length of the string is:" +s1.length());
System.out.println("..........");
System.out.println("The uppercase: \t" +s1.toUpperCase());
System.out.println("The lowercase: \t" +s1.toLowerCase());
System.out.println("..........");
System.out.println("Index is: \t" +s1.indexOf("hello"));
System.out.println("Last index is: \t" +s1.lastIndexOf("hello"));
System.out.println("..........");
System.out.println("Character at: \t" +s1.charAt(2));
System.out.println("Last character: \t" +s1.charAt(s1.length()-1));
System.out.println("..........");
System.out.println(s1);
System.out.println(s1.trim());
System.out.println("..........");
System.out.println("Starts with Hi: \t" +s1.startsWith("Hi"));
System.out.println("Starts with Hi ignore case: \t" +s1.startsWith("hi"));
System.out.println("Ends with hello: \t" +s1.endsWith("hello"));
System.out.println("Ends with whitespace: \t" +s1.endsWith(" "));
System.out.println("..........");
System.out.println("Substring: \t" +s1.substring(4,6));
System.out.println("..........");
System.out.println("Replace hello woth bellow: \t" +s1.replace("hello", "bellow"));
System.out.println("..........");
System.out.println("Is string empty: \t" +s1.isEmpty());
System.out.println("..........");
System.out.println("String contains hello: \t" +s1.contains("hello"));
System.out.println("String contains bellow: \t" +s1.contains("bellow"));
System.out.println("..........");
System.out.println("Concatenate a word to the string:\t" +s1.concat("bye"));
System.out.println("Concatenate 2 words to the string:\t" +s1.concat("bye").concat("\t good luck"));
}
}
