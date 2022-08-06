import java.util.ArrayDeque;
import java.util.Scanner;

public class o6BalancedParentheses {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String brackets = console.nextLine();

        boolean isBalanced = true;
        ArrayDeque<Character> openingBrackets = new ArrayDeque<>();
        for (int i = 0; i < brackets.length(); i++) {
            char currentBracket = brackets.charAt(i);
            if (currentBracket == '{' || currentBracket == '(' || currentBracket == '[') {
                openingBrackets.push(currentBracket);

            } else {
                char lastOppeningBrackets = openingBrackets.pop();
                if (currentBracket == '}' && lastOppeningBrackets != '{') {
                    isBalanced = false;
                } else if (currentBracket == ')' && lastOppeningBrackets != '(') {
                    isBalanced = false;

                } else if (currentBracket == ']' && lastOppeningBrackets != '[') {
                    isBalanced = false;
                }
            }

        }
        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        //Given a sequence consisting of parentheses, determine whether the expression is balanced.
        // A sequence of parentheses is balanced if every open parenthesis can be paired uniquely with
        // a closing parenthesis that occurs after the former. Also, the interval between them must be balanced.
        //You will be given three types of parentheses: (, {, and [.
        //{[()]} - This is a balanced parenthesis.
        //{[(])} - This is not a balanced parenthesis.
        //Input
        //•	Each input consists of a single line, the sequence of parentheses.
        //•	1 ≤ Length of sequence ≤ 1000.
        //•	Each character of the sequence will be one of the following: {, }, (, ), [, ].
        //Output
        //•	For each test case, print on a new line "YES" if the parentheses are balanced. Otherwise, print "NO".

        // {[()]} --> YES
    }
}
