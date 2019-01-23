package sorts;

public class QuickSort {
  public int[] sort(int[] unsortedList, int low, int high)
  {
    //if the low index is less than the high index,
    //we partition the list around a chosen pivot point
    if(low < high){
      int pi = partition(unsortedList, low, high);
      //we recursively sort the two partition
      sort(unsortedList, low, pi -1);
      sort(unsortedList, pi + 1, high);
    }
    return unsortedList;
  }

  public int partition(int[] unsortedList, int low, int high) {
    //choose the highest as the pivot
    int pivot = unsortedList[high];
    int i = low - 1;
    //go through the list from low to high, if an element is less than the pivot
    //then increase the pointer i, and swap the element at i and j.
    for(int j = low; j < high; j++){
      if(unsortedList[j] <= pivot)
      {
        i++;
        int temp = unsortedList[j];
        unsortedList[j] = unsortedList[i];
        unsortedList[i] = temp;
      }
    }
    //move the pivot to the
    unsortedList[high] = unsortedList[i+1];
    unsortedList[i+1] = pivot;

    return i+1;
  }
}
