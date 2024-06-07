import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {

    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();     // Queue 는 인터페이스이기 때문에 구현체인 LinkedList 사용함

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("===  Stack ===");

        // 비어있지 않다면
        while(!st.empty()) {
            System.out.println(st.pop());
        }

        System.out.println();
        
        System.out.println("=== Queue ===");

        // 비어있지 않다면
        while(!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}