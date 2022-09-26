import java.util.Arrays;
import java.util.Scanner;

public class lab2 {

  public static int sum(byte[] array) {
    int result = 0;
    for (final byte v : array) {
      result += v;
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter array size: ");
    int size;
    byte input;
    while (true) {
      try {
        size = scan.nextInt();
        break;
      } catch (Exception e) {
        System.out.print("Array cannot be that size, reenter: ");
        scan.nextLine();
      }
    }
    byte arr[] = new byte[size];
    System.out.print("Enter array elements: ");
    for (int i = 0; i < size; i++) {
      while (true) {
        try {
          input = scan.nextByte();
          break;
        } catch (Exception e) {
          System.out.print("Enter only number type byte:");
          scan.nextLine();
        }
      }
      arr[i] = input;
    }
    System.out.println("Array: " + Arrays.toString(arr));
    System.out.println("Sum of array elements: " + sum(arr));
  }
}







// public static void main(String[] args) {
//   Scanner scan = new Scanner(System.in);
//   System.out.print("Enter array size: ");
//   while (!scan.hasNextInt()) {
//     System.out.println("Input is not a number");
//     System.out.print("Enter array size: ");
//     scan.nextLine();
//   }
//   int size = scan.nextInt();

//   byte arr[] = new byte[size];

//   System.out.print("Enter array elements: ");
//   for (int i = 0; i < size; i++) {
//     while (!scan.hasNextByte()) {
//       // System.out.print("Enter only number type byte: ");
//       scan.nextLine();
//     }
//     arr[i] = scan.nextByte();
//   }

//   System.out.println("Array: " + Arrays.toString(arr));
//   System.out.println(sum(arr));
// }