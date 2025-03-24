package collection.deque.test.stack;

import java.util.ArrayDeque;

public class SimpleHistoryTest {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("youtube");
        stack.push("google");
        stack.push("facebook");

        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
    }
}
