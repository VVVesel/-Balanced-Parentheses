import java.sql.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class o4MaxElement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int[]  command = Arrays.stream(console.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int commandTipe = command[0];
            switch(commandTipe){
                case 1:
                    stack.push(command[1]);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println(Collections.max(stack));
                    break;
            }
            //You have an empty sequence, and you will be given N commands. Each command is one of the following types:
            //•	"1 X" - Push the element X into the stack.
            //•	"2" - Delete the element present at the top of the stack.
            //•	"3" - Print the maximum element in the stack.


        }
    }
}
