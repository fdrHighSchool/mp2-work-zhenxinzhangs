# Shapes
#### Respond to the following:

1. Write a plan for the following output:
```
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
```
  * **YOUR WRITING HERE**


2. Write a plan for the following output:
```
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
```
  * **YOUR WRITING HERE**
  
 MY CODE HERE
  class Main {
  public static void main(String[] args) {
    square(4);
    System.out.println();
    rectangle(2, 4);
    System.out.println();
    rightTriangle(3);
    System.out.println();
    triangle(3);

  } // end main method
  public static void square(int s) {
    for (int row = 0; row < s; row++) {
      for (int col = 0; col < s; col++) {
        System.out.print("* ");
      } // end col for loop
      System.out.println();
    } // end row for loop
  } // end square method

  public static void rectangle(int l, int w) {
    for (int row = 0; row < l; row++){
      for (int col = 0; col < w; col++){
        System.out.print("* ");
      }
      System.out.println();
    }
  } // end rectangle method

  public static void rightTriangle(int s) {
    int i, j;
    for (i = 1; i <= s; i++){
      for (j = 1; j <= i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  } // end rightTriangle method

  public static void triangle(int s) {
    int i, j;
    for (i=0; i<s; i++){
      for (j=s-i; j>1; j--){
        System.out.print(" ");
      } 
      for (j=0; j<=i; j++ ){                
        System.out.print("* ");
      }
      System.out.println();
    }    
  } // end triangle method  
} // end class
