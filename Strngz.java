class Strngz{
public static void main (String args[]){
String s1 = " Hi hello how are you ";

System.out.println(s1.length());
System.out.println(s1.toUpperCase());
System.out.println(s1.toLowerCase());
System.out.println(s1);
System.out.println(s1.trim());
System.out.println(s1.replace("how","wow"));
System.out.println(s1);
System.out.println(s1.concat("\t bye good day ").concat("get lost"));
System.out.println(s1.charAt(6));
System.out.println(s1.indexOf("how"));
System.out.println(s1.substring(5,10));
System.out.println(s1.contains("hi"));
System.out.println(s1.endsWith(" "));
System.out.println(s1.replace('h','z'));
}
}