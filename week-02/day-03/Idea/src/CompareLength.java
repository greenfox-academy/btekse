/**
 * Created by Balázs on 2017. 03. 27..
 */
// - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print if `p2` has more elements than `p1`
public class CompareLength {

  public static void main(String[] args) {
    int[] p1 = {1, 2, 3};
    int[] p2 = {4, 5};

      System.out.println(p2.length > p1.length);
  }
}
