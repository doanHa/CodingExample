import java.util.LinkedList;
import java.util.Queue;

/*
Input: {4, 16, 9, 1, 3, 25}
Target: 25

Given an array and a target number, find the sum of any sub-array that match the target number
Example: Input {4, 16, 9, 1, 3, 25} 25
         Output {16, 9} or {25}
         Input {4, 16, 9, 1, 3, 25} 30
         Output {4, 16, 9, 1} or {4, 1, 25}
         Input {4, 16, 9, 1, 3, 25} 121
         Output No match
 */
public class FindTargetSumInArray {

  static int[] contiguousSum(int[] numbers, int target){
    int current_sum = numbers[0];
    int start, i;
    Queue<Integer> solution = new LinkedList<>();
    for(i = 1; i <= numbers.length; i++ ){

    }
    return numbers;
  }

  public static void main(String[] args) {
    int[] numbers = new int[]{4, 16, 9, 1, 3, 25};
    int target = 25;
    //result = contiguousSum(numbers, target);
    //System.out.println(result);
  }
}
