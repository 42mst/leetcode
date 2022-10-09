import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length() < 1){
            return false;
        }
        
        // Stack to store left symbols
        Stack<Character> leftSymbol = new Stack<>();

        // iterate over each character
        // if the closing paranthesis is found, empty the Stack
        // if the stack is empty after the loop, return true
    
        for (char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{' ){
                leftSymbol.push(c);
            } else if(c == ')' && !leftSymbol.isEmpty() && leftSymbol.peek() == '('){
                leftSymbol.pop();
            } else if(c == ']' && !leftSymbol.isEmpty() && leftSymbol.peek() == '['){
                leftSymbol.pop();
            } else if(c == '}' && !leftSymbol.isEmpty() && leftSymbol.peek() == '{'){
                leftSymbol.pop();
            }

            else {
                return false;
            }
        }

        return leftSymbol.isEmpty();
        
    }

    public static void main(String[] args) {
        ValidParentheses v = new ValidParentheses();
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "{[]}";
        if(v.isValid(s1)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if(v.isValid(s2)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if(v.isValid(s3)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if(v.isValid(s4)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
