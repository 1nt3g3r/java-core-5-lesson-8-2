import java.util.ArrayDeque;
import java.util.Queue;

public class QueueNullTests {
    public static void main(String[] args) {
        Queue<Integer> numbers = new ArrayDeque<>();
        numbers.add(null);

        System.out.println("numbers.poll() = " + numbers.poll());
    }
}
