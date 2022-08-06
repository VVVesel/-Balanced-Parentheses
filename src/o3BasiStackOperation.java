import java.sql.Array;
import java.util.*;

public class o3BasiStackOperation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] input = Arrays.stream(console.nextLine().split(" "))
                .mapToInt(e ->Integer.parseInt(e))
                .toArray();

        int countToPush = input[0];
        int countToPop = input[1];
        int elementToSearch = input[2];

         int[] numbers = Arrays.stream(console.nextLine().split(" "))
                 .mapToInt(Integer :: parseInt)
                 .toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < countToPush; i++) {
                stack.push(numbers[i]);
        }
        for (int i = 0; i < countToPop; i++) {
            stack.pop();
        }
        if (stack.contains(elementToSearch)){
            System.out.println("true");
        }else if (stack.isEmpty()){
            System.out.println("0");
        }else {
            System.out.println(Collections.min(stack));
        }

        //You will be given an integer N representing the number of elements
        // to push into the stack, an integer S representing the number of elements
        // to pop from the stack, and finally an integer X, an element that you should
        // check whether is present in the stack. If it is, print "true" on the console.
        // If it’s not, print the smallest element currently present in the stack.
    }
}
