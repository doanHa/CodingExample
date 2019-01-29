public class Example_2 {
  static void modifyIntArray(int[] numArray){
    for(int i = 0; i < numArray.length; i++){
      numArray[i] += 5;
    }
  }

  public static void main(String[] args) {
    // In Java, arrays are passed as reference, so the parameter
    int[] numArr = new int[]{1,2,3,4,5,6};
    modifyIntArray(numArr);
    for (int i = 0; i < numArr.length; i++){
      System.out.println(numArr[i]);
    }
  }
}
