class Rel {
  public static void main(String[] args) {
    
    // create variables
    int a = 7, b = 11;

    // value of a and b
    System.out.println("a is " + a + " and b is " + b);

    // == operator
    System.out.println("a is equivalent to b:" +(a == b));  // false

    // != operator
    System.out.println("a is not equivalent to b:" +(a != b));  // true

    // > operator
    System.out.println("a is greater than b:" +(a > b));  // false

    // < operator
    System.out.println("a is lesser than b:" +(a < b));  // true

    // >= operator
    System.out.println("a is greater than or equal to b:" +(a >= b));  // false

    // <= operator
    System.out.println("a is lesser than or equal to b:" +(a <= b));  // true
  }
}