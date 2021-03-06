import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static junit.framework.TestCase.assertEquals;

public class SumTest {

  @Test
  public void addNumbers() throws Exception {
    List<Integer> list = new ArrayList<>();
    Sum sum = new Sum(list);
    list.add(5);
    list.add(6);
    assertEquals(11, sum.addNumbers());
  }

  @Test
  public void addNumbersWithOneElement() throws Exception {
    List<Integer> list = new ArrayList<>();
    Sum sum = new Sum(list);
    list.add(2);
    assertEquals(2, sum.addNumbers());
  }

  @Test
  public void addNumbersWithNull() throws Exception {
    List<Integer> list = new ArrayList<>();
    Sum sum = new Sum(list);
    assertEquals(0, sum.addNumbers());
  }
  @Test
  public void addNumbersWithZero() throws Exception {
    List<Integer> list = new ArrayList<>();
    Sum sum = new Sum(list);
    list.add(0);
    assertEquals(0, sum.addNumbers());
  }
}