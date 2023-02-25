Write a program to get first and surname from user and print it using concat
import java.util.*;
class Names{
public static void main(String args[]){
Scanner s1 = new Scanner(System.in);
System.out.println("Enter your First name");
String a = s1.nextLine();
System.out.println("Enter your Surname name");
String b = s1.nextLine();
System.out.println("Your full name is: +a.concat(" ").concat(b));
}
}

