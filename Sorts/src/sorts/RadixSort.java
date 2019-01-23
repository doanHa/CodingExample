package sorts;

import java.util.Arrays;

public class RadixSort {
  public int[] sort(int[] unsortedList, int listSize) {
    if(unsortedList != null){
      //find the biggest number in the list so that we know how many digits
      //we will have to work with. O(n)
      int max = getMax(unsortedList, listSize);
      //sort the digits
      for (int exp = 1; (max / exp) > 0; exp *= 10) {
        countSort(unsortedList, listSize, exp);
      }
    }

    return unsortedList;
  }
  //function to find the max value in the list
  private int getMax(int[] unsortedList, int listSize) {
    int currentMax = unsortedList[0];
    for (int i = 1; i < listSize; i++) {
      if (unsortedList[i] > currentMax)
        currentMax = unsortedList[i];
    }
    return currentMax;
  }

  public void countSort(int[] unsortedList, int listSize, int exp){
    //create a temporary output array to store the numbers
    int output[] = new int[listSize];
    int i;
    //create a count array to count each digit (0...9)
    int count[] = new int[10];
    Arrays.fill(count, 0);
    //count each digit at the exponent in the list
    for(i = 0; i < listSize; i++)
      count[(unsortedList[i]/exp)%10]++;
    //calculate the position of each number in the list, base of the digit
    //stable calculate (numbers with the same digit value will retain their order)
    for(i = 1; i < 10; i++)
      count[i] += count[i - 1];
    //rearrange the numbers base on their calculate position
    for(i = listSize - 1; i >= 0; i--){
      output[count[(unsortedList[i]/exp)%10] - 1] = unsortedList[i];
      count[(unsortedList[i]/exp)%10]--;
    }
    //copy from the temporary output to the list
    for(i = 0; i < listSize; i++){
      unsortedList[i] = output[i];
    }
  }

}
