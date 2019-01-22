package sorts;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortsTests {
  private MergeSort mergeSort = new MergeSort();

  @Test
  public void canary(){
    assert(true);
  }

  @Test
  public void mergeNULLArray()
  {
    assertEquals(null, mergeSort.sort(null, 0, 0));
  }

  @Test
  public void mergeArrayWithNoElement()
  {
    assertEquals(List.of(),
      Arrays.stream(mergeSort.sort(new int[]{}, 0, 0))
        .boxed()
        .collect(Collectors.toList()));
  }

  @Test
  public void sortArrayWithMultipleElements()
  {
    assertEquals(List.of(1,2,3),
      Arrays.stream(mergeSort.sort(new int[]{3,1,2}, 0, 2))
        .boxed()
        .collect(Collectors.toList()));
  }
  @Test
  public void mergeTwoArraysWithMultipleElements(){
    assertEquals(List.of(1,2,3,4,5,6,7),
      Arrays.stream(mergeSort.merge(new int[]{1,2,3,4,5,6,7}, 0, 3, 6))
        .boxed()
        .collect(Collectors.toList()));
  }
}
