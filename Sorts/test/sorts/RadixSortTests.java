package sorts;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class RadixSortTests {
  RadixSort radixSort = new RadixSort();
  @Test
  public void canary()
  {
    assert(true);
  }

  @Test
  public void sortNullArray(){
    assertEquals(null, radixSort.sort(null, 0));
  }

  @Test
  public void sortArrayWithOneElement(){
    assertEquals(List.of(1),
      Arrays.stream(radixSort.sort(new int[]{1}, 1))
        .boxed()
        .collect(Collectors.toList()));
  }

  @Test
  public void sortArrayWithMultipleElements(){
    assertEquals(List.of(1,2,3,4,5,6),
      Arrays.stream(radixSort.sort(new int[]{5,6,3,4,2,1}, 6))
        .boxed()
        .collect(Collectors.toList()));
  }
}
