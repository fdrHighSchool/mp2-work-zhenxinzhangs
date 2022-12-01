# Div By 3
#### Respond to the following:

1. A number is considered *prime* if its only factors are 1 and itself. For example, 7 is prime (1 and 7 are the only factors) and 9 is not (1, 3 and 9 are factors).  
Outline an algorithm to determine whether or not a number is prime.  
Think of the following method header:
`public static boolean isPrime(int num)`

  * **YOUR WRITING HERE**

class Main {
  public static void main(String[] args) {
    System.out.println(div(129130)); // false
    System.out.println(div(51283)); // false
    System.out.println(div(289313)); // false
    System.out.println(div(12123)); // true
    System.out.println(div(12124)); // false
    System.out.println(div(12125)); // false
    System.out.println(div(12126)); // true
    System.out.println(div(453553453)); // false

  }
  public static boolean div(int a){
    if ((a % 10000000) % 3 == 0){
      return true;
    }
    else{
      return false;
    }
  }
}
