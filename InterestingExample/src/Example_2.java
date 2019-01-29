public class Example_2 {
  static void modifyIntArray(int[] numArray){
    //Because the array was passed as a reference,
    //accessing then modifying any value in the array will work.
    for(int i = 0; i < numArray.length; i++){
      numArray[i] += 5;
    }
  }

  public static void main(String[] args) {
    // In Java, arrays are passed as reference.
    int[] numArr = new int[]{1,2,3,4,5,6};
    modifyIntArray(numArr);
    for (int i = 0; i < numArr.length; i++){
      System.out.println(numArr[i]);
    }
  }
}
