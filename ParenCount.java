
import java.util.Stack;
import java.util.EmptyStackException;
/*
 * Programming Assignment no. 4
 */
public class ParenCount {
	
	/*
	 * The Method inside this class scans the number sentence for PARENTHESES like
	 * characters. If the number of right parentheses exceeds the number of left
	 * parentheses, the method returns a value -1. If left exceeds right, returns 1.
	 * If valid, returns 0. If the parentheses are not properly ordered, returns 2.
	 */
    
    public int checkStr(String input) {
        
        Stack<Character> s = new Stack<>();
        
        for(int i = 0; i < input.length(); i++) {
            switch(input.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    s.push(input.charAt(i));
                    break;
                case ')':
                case ']':
                case '}':
                	try {
    					if(s.peek() == '{' || s.peek() == '[') {
    						return 2;
    					}
    					else {
    						s.pop();
    					}
                	}
                    catch(EmptyStackException e) {
                        return -1;
                    }
            }
        }
        if(s.isEmpty()) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
