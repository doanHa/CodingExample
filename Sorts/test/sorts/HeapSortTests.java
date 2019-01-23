package sorts;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeapSortTests {
  HeapSort heapSort = new HeapSort();

  @Test
  public void canary(){
    assert(true);
  }

  @Test
  public void sortNULLArray(){
    assertEquals(null, heapSort.sort(null));
  }

  @Test
  public void sortArrayWithOneElement(){
    assertEquals(List.of(1),
      Arrays.stream(heapSort.sort(new int[]{1}))
        .boxed()
        .collect(Collectors.toList()));
  }

  @Test
  public void sortArrayWithMultipleElement(){
    assertEquals(List.of(1,2,3,4,5,6,7),
      Arrays.stream(heapSort.sort(new int[]{5,4,3,6,1,2,7}))
        .boxed()
        .collect(Collectors.toList()));

  }

}
