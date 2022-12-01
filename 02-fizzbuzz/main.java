# FizzBuzz
#### Respond to the following:

1. Fill out the following truth table:

| P  | Q  | P && Q | P \|\| Q |
|:--:|:--:|:------:|:--------:|
| T  | T  |   T    |     T    |
| T  | F  |   F    |     T    |
| F  | T  |   F    |     T    |
| F  | F  |   F    |     F    |


2. Prove a version of DeMorgan's Law:

| P  | Q  | P \|\| Q | ! (P \|\| Q) | !P | !Q | !P && !Q |
|:--:|:--:|:--------:|:------------:|:--:|:--:|:--------:|
| T  | T  |    T     |      F       |  F | F  |    F     |
| T  | F  |    T     |      F       |  F | T  |    F     |
| F  | T  |    T     |      F       |  T | F  |    F     |
| F  | F  |    F     |      T       |  T | T  |    T     |

3. What does DeMorgan's state and how did you prove it for the case above?
  * **YOUR WRITING HERE**
  
  
//MY CODE HERE
  class Main {
  public static void main(String[] args) {
    //for (int i = 1; i < 101; (++))
    System.out.println(fizzbuzz(9));
    System.out.println(fizzbuzz(1));
    System.out.println(fizzbuzz(15));
    System.out.println(fizzbuzz(90));
  }
  public static String fizzbuzz(int num){
    if (num%3 != 0 && num%5 !=0){
      return "none";
    }
    else if (num%3 == 0 && num%5 == 0){
      return "fizzbuzz";
    }
    else if (num%3 == 0){
      return "fizz";
    }
    else if (num%5 == 0){
      return "buzz";
    }
    else{
      return "none";
    }
  }
}
