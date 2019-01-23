package sorts;

public class HeapSort {

  public int[] sort(int[] unsortedList){
    if(unsortedList != null) {
      int listSize = unsortedList.length;
      //create the initial max heap from the unsorted list
      for (int i = (listSize / 2) - 1; i >= 0; i--)
        createMaxHeap(unsortedList, listSize, i);

      //swap largest (rootNode of the heap) to the back of the list
      //then create the max heap from the remaining elements and repeat the process
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
    //we assume the largest node is the root node
    int largest = rootNode;
    int leftNode = 2 * rootNode + 1;
    int rightNode = 2 * rootNode + 2;

    //check if leftNode, then rightNode, if they are within the heap and if they
    //larger than the largest, if they are, assign them to largest.
    if(leftNode < heapSize && unsortedList[leftNode] > unsortedList[largest])
      largest = leftNode;
    if(rightNode < heapSize && unsortedList[rightNode] > unsortedList[largest])
      largest = rightNode;

    //if largest is not the rootNode, we need to swap them
    //then we have to create the max heap for the sub-tree (branches)
    if(largest != rootNode){
      int temp = unsortedList[largest];
      unsortedList[largest] = unsortedList[rootNode];
      unsortedList[rootNode] = temp;

      createMaxHeap(unsortedList, heapSize, largest);
    }
  }
}
