class Stringz{
public static void main(String args[]){
String s1 = " Hi hellow how are you ";
System.out.println(s1.length());
System.out.println(s1);
System.out.println(s1.trim());
System.out.println(s1.toUpperCase());
System.out.println(s1.toLowerCase());
System.out.println(s1.indexOf("how"));
System.out.println(s1.charAt(4));
System.out.println(s1.startsWith(" "));
System.out.println(s1.substring(4,8));
System.out.println(s1.concat("bye"));
System.out.println(s1.concat("bye").concat(" good day"));
System.out.println(s1);
System.out.println(s1.isEmpty());
System.out.println(s1.replace("how", "who"));
System.out.println(s1);

}
}
