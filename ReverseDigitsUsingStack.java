package fp;
import java.util.Stack;
public class ReverseDigitsUsingStack {

	public static int reverseDigits (int num) {
		String numStr = Integer.toString(num);
		Stack<Character>Stack = new Stack<>();
		for (int i = 0; i< numStr.length(); i++ ) {
			Stack.push(numStr.charAt(i));
			
		}
		StringBuilder reversedNum = new StringBuilder();
		while(!Stack.isEmpty()) {
			reversedNum.append(Stack.pop());
		}
		return Integer.parseInt(reversedNum.toString());
		
		

	}


public static void main (String[] arg) {
	int inputNumber = 1234;
	int reversedNumber  = reverseDigits(inputNumber);
	System.out.println("reversedNumber:" + reversedNumber);
	
  }
	
}
