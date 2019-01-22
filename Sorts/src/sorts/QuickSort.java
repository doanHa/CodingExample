package sorts;

public class QuickSort {
  public int[] sort(int[] unsortedList, int low, int high)
  {
    if(low < high){
      int pi = partition(unsortedList, low, high);

      sort(unsortedList, low, pi -1);
      sort(unsortedList, pi + 1, high);
    }
    return unsortedList;
  }

  public int partition(int[] unsortedList, int low, int high) {
    int pivot = unsortedList[high];
    int i = low - 1;
    for(int j = low; j < high; j++){
      if(unsortedList[j] <= pivot)
      {
        i++;
        int temp = unsortedList[j];
        unsortedList[j] = unsortedList[i];
        unsortedList[i] = temp;
      }
    }

    unsortedList[high] = unsortedList[i+1];
    unsortedList[i+1] = pivot;

    return i+1;
  }
}
