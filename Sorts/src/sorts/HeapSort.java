package sorts;

public class HeapSort {
  public int[] sort(int[] unsortedList){
    if(unsortedList != null) {
      int listSize = unsortedList.length;
      for (int i = (listSize / 2) - 1; i >= 0; i--) {
        createMaxHeap(unsortedList, listSize, i);
      }
      for (int i = listSize - 1; i >= 0; i--) {
        int temp = unsortedList[0];
        unsortedList[0] = unsortedList[i];
        unsortedList[i] = temp;

        createMaxHeap(unsortedList, i, 0);
      }
    }

    return unsortedList;
  }
  public void createMaxHeap(int[] unsortedList, int heapSize, int rootNode){
    int largest = rootNode;
    int leftNode = 2 * rootNode + 1;
    int rightNode = 2 * rootNode + 2;

    if(leftNode < heapSize && unsortedList[leftNode] > unsortedList[largest])
      largest = leftNode;
    if(rightNode < heapSize && unsortedList[rightNode] > unsortedList[largest])
      largest = rightNode;

    if(largest != rootNode){
      int temp = unsortedList[largest];
      unsortedList[largest] = unsortedList[rootNode];
      unsortedList[rootNode] = temp;

      createMaxHeap(unsortedList, heapSize, largest);
    }
  }
}
