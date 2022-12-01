# Letter Grade
#### Respond to the following:

1. Write a plan for the following extension:
  * Attach a "+" on their grade if the grade ends in a 7, 8 or 9 (eg: 78 -> C+, 89 -> B+)
  * Attach a "-" on their grade if the grade ends in a 0, 1 or 2 (eg: 92 -> A-, 61 -> D-)

    * **YOUR WRITING HERE**


2. Discuss how you would make sure 100 is not misrepresented as an A-.
  * **YOUR WRITING HERE**


3. Discuss how you would make sure grades that are an F are not mislabeled as F- or F+ (eg: 49 -> F+ and 52 -> F-)
  * **YOUR WRITING HERE**


MY CODE HERE
class Main {
  public static void main(String[] args) {
    System.out.println(grade(90));
    System.out.println(grade(89));
    System.out.println(grade(79));
    System.out.println(grade(60));
    System.out.println(grade(59));
  }
  public static int grade(int letter){
    if (letter >= 90){
      System.out.println("A");
    }
    else if (letter <= 90 && letter >= 80){
      System.out.println("B");
    }
    else if (letter <= 80 && letter >= 70){
      System.out.println("C");
    }
    else if (letter <= 70 && letter >= 60){
      System.out.println("D");
    }
    else if (letter <= 60){
      System.out.println("F");
    }
    return letter;
  }
}
