import java.util.ArrayList;
import java.util.Arrays;

public class Example_4 {
  public static void main(String[] args) {
    //This will initialize the ArrayList with 1,2,3,4. Short and easy to use.
    ArrayList<Integer> numArray = new ArrayList<>(Arrays.asList(1,2,3,4));

    //This is called the "double braces initialization".
    //This create an inner anonymous class within the numberArray,
    // and using "this" to reference the value being constructed.
    //Even though this create extra memory space, the compiling time difference is negligible.
    ArrayList<Integer> numberArray = new ArrayList<>(){{
        add(1);
        add(2);
        add(3);
      }};
  }
}
