public class If{
  public static void main (String args[]){
    int num1 = 100;
    int num2 = 150;
    
    if (num1 > num2){
      // if command only run if statement is true otherwise use else command
      System.out.println("num1 is bigger then num 2");
    } else if (num2 > num1) {
      System.out.println ("num2 is bigger then num1");
    } else {
      System.out.println("both numbers are equal");
    }
  }
}
