public class Example_1 {
  static void modifyIntValue(int a){
    //Here, because the parameter is passed by value, changing the value here would not change the actual value
    a += 5;
    System.out.println("variable's value after modifyIntValue should be: " + a);
  }
  public static void main(String[] args) {
    //In Java, objects are passed by value
    int num = 1;
    modifyIntValue(num);
    System.out.println("variable's value after modifyIntValue actually is: " + num);

    //And same for this example: even though java array will be passed by reference,
    //this example took each object(int) in the array and pass it, so instead of passing
    //an array reference, now we pass each object's value
    int[] numArr = new int[]{1,2,3,4};
    for(int i = 0; i < numArr.length; i++){
      modifyIntValue(numArr[i]);
      System.out.println("variable's value after modifyIntValue actually is: " + numArr[i]);
    }
  }

}
