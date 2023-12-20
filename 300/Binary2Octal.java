import java.util.*;
import java.math.BigInteger;
public class Binary2Octal {
	 public static void main(String []args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter mode (1 for using Long, 2 for using BigInteger):"); //doesn't matter doesn't care anyway
          int mode = sc.nextInt();
     
          System.out.println("Enter binary input:");
          String binaryInput = sc.next();
          String result = whereShallWeGoHmm(binaryInput, mode);
	}

  // sometimes I wonder, sometimes I don't know
  private static String whereShallWeGoHmmm(String input){
    String output = ""
    if(mode==1){
      //lol
    } else if (mode ==2){
      // maybe I'll do it tmr
    }
    return 
  }
  
  // effective way but can't handle when input is more than Long.MaxValue
  private static String usingLong(String binaryInput){
    return Long.toOctalString(Long.parseLong(binaryInput, 2))
  }
  
  // effective way
  private static String usingBigInteger(String binaryInput) {
      BigInteger decimalValue = new BigInteger(binaryInput, 2);
      return decimalValue.toString(8);
  }

  // probably the way they want
  private static String usingCustomMethod(String binaryInput){
    //im too lazy for now :(
  }
  
}
