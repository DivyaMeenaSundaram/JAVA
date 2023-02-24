 // To store objects of different data types, we can declare the type of the Array(or Collection) as an "Object"

import java.util.Arrays;
import java.lang.Object;
class Arrayz{
public static void main(String args[]){
Object[] arr = new Object[3];
   arr[0] = "ab";
   arr[1] = 2;
   arr[2] = 2.3;
System.out.println(Arrays.toString(arr));
}}
