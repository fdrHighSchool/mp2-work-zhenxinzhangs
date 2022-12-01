class Main {
  public static void main(String[] args) {
    System.out.println(isLeapYear(2022));
    System.out.println(isLeapYear(2024));
    System.out.println(isLeapYear(1900));
    System.out.println(isLeapYear(2000));
  } // closes main
  public static boolean isLeapYear(int year){
    if (year%4 == 0){
      return true;
    }
    else if (year%100 == 0){
      return true;
    } // closes year 100
    else if (year%400 == 0){
      return true;
    } // closes year 400
    else{
      return false;
    } // closes else
  } // closes isLeapyear
} // closes Main method
