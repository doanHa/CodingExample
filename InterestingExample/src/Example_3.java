public class Example_3 {
  static void modifyIntegerValue(Integer num){
    //Just like primitive type, class type variable also suffer from "pass-by-value" curse of Java
    num += 5;
  }
  public static void main(String[] args) {
    Integer number = 10; // there is no need to go = new Integer(10); anymore (hurray for auto-boxing)
    modifyIntegerValue(number);
    System.out.println(number);
  }
}
