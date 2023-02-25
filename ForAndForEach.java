// for and for-each
import java.util.Arrays;
class ForAndForEach
{
public static void main(String args[])
{
String s="Hi Divya";
System.out.println(s.length());

String s1[]={"hi", "Divya"};
String s2[][]={{"hi", "Divya"}, {"no", "yes"}};
System.out.println(s1.length);
s1[0]="Meena";
System.out.println(s1[0]);
System.out.println(Arrays.toString(s1));
System.out.println(Arrays.deepToString(s2));
 /* for (int i=0; i<s1.length; i++)
	{
	System.out.print(s1[i] + "\t");
	} */
/*	for(String a: s1)
	{
	System.out.print(a + "\t");
	}	*/

}
}
