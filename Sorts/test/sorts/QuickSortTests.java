package sorts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuickSortTests {
  QuickSort quickSort = new QuickSort();

  @Test
  public void canary()
  {
    assert(true);
  }

  @Test
  public void sortNullArray()
  {
    assertEquals(null, quickSort.sort(null, 0, 0));
  }

  @Test
  public void sortArrayWithOneElement()
  {
    assertEquals(List.of(1),
      Arrays.stream(quickSort.sort(new int[]{1}, 0, 0))
        .boxed()
        .collect(Collectors.toList()));
  }

  @Test
  public void sortArrayWithMultipleElement()
  {
    assertEquals(List.of(1,2,3,4,5,6),
      Arrays.stream(quickSort.sort(new int[]{2,3,6,5,1,4}, 0, 5))
        .boxed()
        .collect(Collectors.toList()));
  }
}
