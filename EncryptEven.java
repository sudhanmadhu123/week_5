class EncryptEven {
  public static void main(String[] args) {
    String input = "YOU KNOW YOU HAVE TO STRUGGLE";
    int i=0;
    for ( i = 0; i < input.length(); i++) {
      if (i % 2 == 0) {
        System.out.print(input.charAt(i));
      }
    }
    for ( i = 0; i < input.length(); i++){
    if (i % 2 != 0) {
      System.out.print(input.charAt(i));
    }
    }
  }
}