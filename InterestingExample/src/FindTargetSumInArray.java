import java.util.LinkedList;
import java.util.Queue;

/*
Input: {4, 16, 9, 1, 3, 25}
Target: 25

Given an array and a target number, find the sum of any contiguous sub-array that match the target number
Example: Input {4, 16, 9, 1, 3, 25} 25
         Output {16, 9} or {25}
         Input {4, 16, 9, 1, 3, 25} 30
         Output {4, 16, 9, 1} or {4, 1, 25}
         Input {4, 16, 9, 1, 3, 25} 121
         Output No contiguous sub-array found
Note: contiguous sub-array mean numbers next to each other, so, the following example should be upheld
         Input {4, 16, 9, 1, 3, 25} 32
         Output No contiguous sub-array found
 */
public class FindTargetSumInArray {

  static void contiguousSum(int[] numbers, int target){
    int current_sum = numbers[0];
    int start = 0, i;
    //go through the numbers array.
    for(i = 1; i <= numbers.length; i++ ){
      while(current_sum > target && start < i - 1){
        current_sum -= numbers[start];
        start++;
      }
      // print out the result if current_sum reach the target
      if(current_sum == target){
        System.out.println("The result is:");
        for(int k = start; k < i; k++){
          System.out.print("\t" + numbers[k]);
        }
        System.out.println();
        return;
      }
      if(i < numbers.length){
        current_sum += numbers[i];
      }
    }

    System.out.println("No contiguous sub-array with target sum found");
//    return numbers;
  }

  public static void main(String[] args) {
    int[] numbers = new int[]{4, 16, 9, 1, 3, 25};
    int target = 32;
    contiguousSum(numbers, target);
    //result = contiguousSum(numbers, target);
    //System.out.println(result);
  }
}
