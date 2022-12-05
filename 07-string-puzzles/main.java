# String Puzzles
#### Respond to the following:

1. *In your own words*, discuss what each String method does:
  * `.substring(a)`
    * **YOUR WRITING HERE**

  * `.substring(a, b)`
    * **YOUR WRITING HERE**

  * `.indexOf(str)`
    * **YOUR WRITING HERE**

  * `.equals(str)`
    * **YOUR WRITING HERE**


2. *In your own words*, discuss what the following `for` loop accomplishes for `String s`:
```
for(int i = 0; i < s.length(); i++) {
      // DO STUFF
}
```
  * **YOUR WRITING HERE**
  
  
  MY CODE HERE
  class Main {
  public static void main(String[] args) {
    System.out.println(count("cat","dog"));        
    System.out.println(count("abc", "cat"));
    System.out.println(count("abc", ""));
    System.out.println();
    half("woohoo");
    half("hellothere");
    half("abcdef");
    System.out.println();
    System.out.println(repeat("Hello", 3));
    System.out.println(repeat("Hello", 2));

    System.out.println(countHi("abc hi ho"));
    System.out.println(countHi("abc hi hi"));
    System.out.println(countHi("hihi"));

    System.out.println(makeSarcastic("hello world"));
  }
  public static String count(String a, String b){
    if (b.equals("")) {
      return a;
    }
    if (a.substring(a.length()-1).equals(b.substring(0,1))){
      return (a+b.substring(1));
    }
    else {
      return (a+b);
    }
  }
  public static void half(String a){
    System.out.println(a.substring(0,a.length()/2));
  }
  public static String repeat(String a, int b){
    String result = ""; // start empty
    for(int i = 0; i < b; i++) { // repeat 'b' times
      result += a.substring(a.length()-b); // result = result + ________
    }
    return result; // send the resulting String back to main
  }
  public static String makeSarcastic(String s){
    String nar = "";
    for (int i = 0; i<s.length(); i++){
      if (i % 2 == 0){
        nar += s.substring(i, i+1).toLowerCase();
      }
      else{
        nar += s.substring(i, i+1).toUpperCase();
      }
    }
    return nar;
  }

  public static int countHi(String s) {
    int count = 0;
    for (int i = 0; i <= s.length()-2; i++) {
      if (s.substring(i, i+2).equals("hi")) {
        count++;
      }
    }
    return count;
  }  
}
