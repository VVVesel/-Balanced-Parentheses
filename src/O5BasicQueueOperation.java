import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class O5BasicQueueOperation {
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
            ArrayDeque<Integer> queue = new ArrayDeque<>();
            for (int i = 0; i < countToPush; i++) {
                queue.offer(numbers[i]);
            }
            for (int i = 0; i < countToPop; i++) {
                queue.poll();
            }
            if (queue.contains(elementToSearch)){
                System.out.println("true");
            }else if (queue.isEmpty()){
                System.out.println("0");
            }else {
                System.out.println(Collections.min(queue));
            }
                //You will be given an integer N representing the number of elements to enqueue (add),
        // an integer S representing the
        // number of elements to dequeue(remove the poll) from the queue, and finaly an integer X,
        // an element that you should  check whether is present in the queue.
        // If it is-prints true on the console,
        // if it is not- print the smallest element currently present in the queue
        }
}

