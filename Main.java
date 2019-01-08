import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] formula = sc.nextLine().split(" ");
        Deque<Integer> deque = new ArrayDeque<>();
        for (String f : formula) {
            if (f.equals("+")) {
                deque.addFirst(deque.pollFirst() + deque.pollFirst());
            } else if (f.equals("-")) {
                deque.addFirst(deque.pollFirst() - deque.pollFirst());
            } else if (f.equals("*")) {
                deque.addFirst(deque.pollFirst() * deque.pollFirst());
            } else if (f.equals("/")) {
                deque.addFirst(deque.pollFirst() / deque.pollFirst());
            } else {
                deque.addFirst(Integer.parseInt(f));
            }
        }
        System.out.println(deque.pollFirst());
    }
}