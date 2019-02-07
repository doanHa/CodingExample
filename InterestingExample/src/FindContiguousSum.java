/*
Problem: find the contiguous sum given a positive number

Requirement: - An array of positive number
             - The result should comprised of numbers next to each other in the array
 */


public class FindContiguousSum {

    /* Returns true if the there is a sub-array of arr[] with sum equal to
       'sum' otherwise returns false.  Also, prints the result */
    static void contiguousSum(int arr[], int n, int sum)
    {
      int curr_sum = arr[0], start = 0, i;

      // Pick a starting point
      for (i = 1; i <= n; i++)
      {
        // If curr_sum exceeds the sum, then remove the starting elements, and move to the next one
        while (curr_sum > sum && start < i-1)
        {
          curr_sum = curr_sum - arr[start];
          start++;
        }

        // If curr_sum becomes equal to sum, then print out the result
        if (curr_sum == sum)
        {
          System.out.println("The result is: ");
          for(int j = start; j < i; j++) {
            System.out.print(arr[j] + "\t");
          }
          System.out.println();
          //return; //uncomment the return to find only 1 possible solution
        }

        // Add this element to curr_sum
        if (i < n)
          curr_sum = curr_sum + arr[i];

      }

      System.out.println("No sub-array found");
      return;
    }

    public static void main(String[] args)
    {
      int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
      int sum = 38;
      contiguousSum(arr, arr.length, sum);
    }
}

