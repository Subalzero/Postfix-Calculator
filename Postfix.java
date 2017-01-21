
import java.util.Stack;

public class Postfix {
	
	/*
	 * Programming Assignment no. 5
	 */
    
    public String translate(String infix) {
    	
    	/*
		 * This method translates infix expression to postfix expression.
		 * However, in order to prevent confusion of elements, a space is
		 * added every new element. This will be useful whenever an infix
		 * expression has an operand with 2 or more digits.
		 */
		
		/*
		 * The input infix String with '.' decimal must be preceded with a number.
		 * Otherwise, the method will generate an incorrect pattern.
		 */
    	
        Stack<Character> s = new Stack<>();
        s.push('\0');
        String output = "";
        for(int i = 0; i < infix.length(); i++) {
            switch(infix.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    s.push(infix.charAt(i));
                    break;
                case ')':
                case ']':
                case '}':
                    while(s.peek() != '(' && s.peek() != '[' && s.peek() != '{') {
                        output += " " + Character.toString(s.pop());
                    }
                    s.pop();
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                case '^':
                    output += " ";
                    if(pred(infix.charAt(i)) <= pred(s.peek())) {
                        if(output.charAt(output.length() - 1) != ' ') {
                            output += " ";
                        }
                        if(s.peek() != '(' && s.peek() != '[' && s.peek() != '{') {
                            output += Character.toString(s.pop()) + " ";
                        }
                    }
                    s.push(infix.charAt(i));
                    break;
                default:
                    output += Character.toString(infix.charAt(i));
                    break;
            }
        }
        while(s.peek() != '\0') {
            output += " " + Character.toString(s.pop());
        }
        return output;
    }
    
    private int pred(char in) {
        switch(in) {
            case '\0':
                return 0;
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 3;
            default:
                return 4;
        }
    }
    
    /*
     * Programming Assignment no. 6
     */
    
    public double solve(String postfix) {
    	
    	/*
		 * This method solves postfix equation. However, each operand must be
		 * separated by a space so that the method will know that it is the end
		 * of the operand.
		 */
    	
        Stack<Double> s = new Stack<>();
        String temp1 = "";
        double temp2;
        double operandR, operandL;
        for(int i = 0; i < postfix.length(); i++) {
            switch(postfix.charAt(i)) {
                case '+':
                    operandR = s.pop();
                    operandL = s.pop();
                    s.push(operandL + operandR);
                    break;
                case '-':
                    operandR = s.pop();
                    operandL = s.pop();
                    s.push(operandL - operandR);
                    break;
                case '*':
                    operandR = s.pop();
                    operandL = s.pop();
                    s.push(operandL * operandR);
                    break;
                case '/':
                    operandR = s.pop();
                    operandL = s.pop();
                    s.push(operandL / operandR);
                    break;
                case '^':
                    operandR = s.pop();
                    operandL = s.pop();
                    s.push(Math.pow(operandL, operandR));
                    break;
                default:
                    try {
                        if(postfix.charAt(i) != ' ') {
                            temp1 += Character.toString(postfix.charAt(i));
                        }
                        else {
                        	/* If a space is detected, the operand is pushed in the stack.
        					 * Then, temp1 is set to empty string for the new operand.
        					 */
                            temp2 = Double.parseDouble(temp1);
                            temp1 = "";
                            s.push(temp2);
                        }
                    }
                    catch(NumberFormatException e) {
                        //Do nothing.
                    }
                    break;
            }
        }
        return s.pop();
    }
}
