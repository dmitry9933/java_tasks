public class tast6 {
  public static void main(String[] args) {
    String row1 = "Year is 2009";
    String row2 = "YNot2Bad";
    String row3 = "1 is a number";
    String row4 = "No digits here";
    String row5 = "3.5423";
    int intValue;

    // char[] chars = row1.toCharArray();
    // for (int i = 0; i < chars.length; i++) {
    // System.out.println("a " + i + " " + chars[i]);
    // if (i == 0 || chars[i - 1] == ' ') {
    // chars[i] = Character.toUpperCase(chars[i]);
    // }
    // }
    // System.out.println(new String(chars));

    String[] words = row1.split("\\s+");
    for (int i = 0; i < words.length; i++) {
      // You may want to check for a non-word character before blindly
      // performing a replacement
      // It may also be necessary to adjust the character class
      words[i] = words[i].replaceAll("[^\\w]", "");
    }
    System.out.println("Words array: ");
      for (int i = 0; i < words.length; i++) {
        System.out.println(words[i] + " ");
      }
    
    int yes = 0;
    System.out.println("Result: ");
    for (int i = 0; i < words.length; i++) {
      try {
        intValue = Integer.parseInt(words[i]); // https://stackabuse.com/java-check-if-string-is-a-number/
        System.out.println(words[i] + " - Integer");
        yes += 1;
      } catch (NumberFormatException e) {
        System.out.println(words[i] + " - Input String cannot be parsed to Integer.");
      }

    }
    if (yes > 0) {
      System.out.println("Row '" + row1 + "' has integers");
    }
    else {
      System.out.println("This row '" + row1 + "' does not contain any integers");
    }
  }
}
