class Palindrome{
  public static void main(String args[]) {
    String str = "NOON";
    int count = 0;
    for (int i = 0; i < str.length() / 2; i++) {
      for (int j = (str.length() - 1) / 2; j > 0; j--) {
        if (str.charAt(i) == str.charAt(j)) {
          count = count + 1;
        }
      }
    }
    if (count == 1) {
      System.out.print("the given string is palindrom ");
    } else {
      System.out.print("not palindrome");
    }
  }
}