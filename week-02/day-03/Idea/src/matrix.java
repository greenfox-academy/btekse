/**
 * Created by Balázs on 2017. 04. 08..
 */

// - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`

public class Matrix {
  public static void main(String[] args) {
    int[][] ai = {{1, 2, 3, 4}, {4, 5, 6, 7}, {7, 8, 9, 10}};

    int total = sum(ai);
    System.out.println(total);
  }

  public static int sum(int[][] values) {
    int total = 0;
    for (int i = 0; i < values.length; i++) {
      for (int j = 0; j < values[i].length; j++) {
        total += values[i][j];
      }
    }
    return total;
  }
}
