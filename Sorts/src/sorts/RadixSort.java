package sorts;

import java.util.Arrays;

public class RadixSort {
  public int[] sort(int[] unsortedList, int listSize) {
    if(unsortedList != null){
      int max = getMax(unsortedList, listSize);

      for (int exp = 1; (max / exp) > 0; exp *= 10) {
        countSort(unsortedList, listSize, exp);
      }
    }

    return unsortedList;
  }

  private int getMax(int[] unsortedList, int listSize) {
    int currentMax = unsortedList[0];
    for (int i = 1; i < listSize; i++) {
      if (unsortedList[i] > currentMax)
        currentMax = unsortedList[i];
    }
    return currentMax;
  }

  public void countSort(int[] unsortedList, int listSize, int exp){
    int output[] = new int[listSize];
    int i;
    int count[] = new int[10];
    Arrays.fill(count, 0);

    for(i = 0; i < listSize; i++)
      count[(unsortedList[i]/exp)%10]++;

    for(i = 1; i < 10; i++)
      count[i] += count[i - 1];

    for(i = listSize - 1; i >= 0; i--){
      output[count[(unsortedList[i]/exp)%10] - 1] = unsortedList[i];
      count[(unsortedList[i]/exp)%10]--;
    }

    for(i = 0; i < listSize; i++){
      unsortedList[i] = output[i];
    }
  }

}
