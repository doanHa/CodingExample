package sorts;

public class MergeSort{
 public int[] sort(int[] unsortedList, int low, int high)
 {
    if(low < high) {
      int middle = (low + high)/2;

      sort(unsortedList, low, middle);
      sort(unsortedList, middle + 1, high);
      merge(unsortedList, low, middle, high);
    }
    return unsortedList;
 }
 public int[] merge (int[] unsortedList, int left, int middle, int right)
 {
   int leftArraySize = middle - left + 1;
   int rightArraySize = right - middle;

   int[] leftArray = new int[leftArraySize];
   int[] rightArray = new int[rightArraySize];

   for(int i = 0;i < leftArraySize; i++)
   {
     leftArray[i] = unsortedList[left + i];
   }
   for(int i = 0; i < rightArraySize; i++)
   {
     rightArray[i] = unsortedList[middle + i + 1];
   }

   int i = 0, j = 0, k = left;
   while(i < leftArraySize && j < rightArraySize){
     if(leftArray[i] < rightArray[j])
     {
       unsortedList[k] = leftArray[i];
       i++;
     } else {
       unsortedList[k] = rightArray[j];
       j++;
     }
     k++;
   }
   if(i < leftArraySize)
   {
     unsortedList[k] = leftArray[i];
     i++;
     k++;
   }
   if(j < rightArraySize)
   {
     unsortedList[k] = rightArray[j];
     j++;
     k++;
   }
   return unsortedList;
 }
}
