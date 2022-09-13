// import java.util.Scanner;

public class task3 {

  final static int n = 5;
  final static int m = 5;

  static int findMax(int matrix[][]) {

    // Initializing max element as INT_MIN
    int maxElement = 0;
    int maxI = 0;
    int maxJ = 0;

    // checking each element of matrix
    // if it is greater than maxElement,
    // update maxElement
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (matrix[i][j] >= maxElement) {
          maxElement = matrix[i][j];
          maxI = i;
          maxJ = j;
        }
      }
    }
    System.out.print("Max value is matrix[" + maxI + "][" + maxJ + "] = " + maxElement);
    // finally return maxElement
    return maxElement;
  }

  public static void main(String[] args) {
    // Scanner scan = new Scanner(System.in);
    // System.out.print("Input n: ");
    // while (!scan.hasNextInt()) {
    // System.out.println("Input is not matrix number");
    // System.out.print("Input n: ");
    // scan.nextLine();
    // }
    // int n = scan.nextInt();

    // System.out.print("Input m: ");
    // while (!scan.hasNextInt()) {
    // System.out.println("Input is not matrix number");
    // System.out.print("Input m: ");
    // scan.nextLine();
    // }
    // int m = scan.nextInt();

    int[][] matrix = new int[m][n];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = (int) (Math.random() * 10);
      }
    }
    System.out.println("Matrix: ");
    for (int i = 0; i < matrix.length; i++, System.out.println()) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
    }

    System.out.println(findMax(matrix));
  }
}
