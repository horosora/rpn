import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(calculateRPN(sc.nextLine()));
    }

    private static Integer calculateRPN(String formula) {
        Integer x, y;
        Deque<Integer> deque = new ArrayDeque<>();
        for (String f : formula.split(" ")) {
            switch (f) {
                case "+":
                    x = deque.pollFirst();
                    y = deque.pollFirst();
                    deque.addFirst(y + x);
                    break;
                case "-":
                    x = deque.pollFirst();
                    y = deque.pollFirst();
                    deque.addFirst(y - x);
                    break;
                case "*":
                    x = deque.pollFirst();
                    y = deque.pollFirst();
                    deque.addFirst(y * x);
                    break;
                case "/":
                    x = deque.pollFirst();
                    y = deque.pollFirst();
                    deque.addFirst(y / x);
                    break;
                default:
                    deque.addFirst(Integer.parseInt(f));
            }
        }
        return deque.pollFirst();
    }
}
