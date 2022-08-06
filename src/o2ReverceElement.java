import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class o2ReverceElement {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String[] numbers = console.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (String number : numbers){
            stack.push(Integer.parseInt(number));
        }
        for (Integer element : stack){
            System.out.printf("%s ", stack.pop());
        }
    }
}
