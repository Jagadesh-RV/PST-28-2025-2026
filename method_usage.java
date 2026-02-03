public class method_usage {
  static void method1() {
    System.out.println("This is first method");
    method2();
  }
  public static void  method2(){
      System.out.println("This is a second method");
      method3();
  }
  public static void method3(){
      System.out.println("This is a third method");
      method4();
  }
  public static void method4(){
      System.out.println("This is fourth method");
      method5();
  }
  public static void method5(){
      System.out.println("This is fifth method");
  }
  
  public static void main(String[] args) {
    method1();
  }
}