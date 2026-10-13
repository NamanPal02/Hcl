package Day3;
import java.util.*;
public class queues {
    public static void main(String[] args) {
//        implemet queue with the help of linked list
        Queue<Integer> q = new LinkedList<>();
        q.offer(25);
        q.offer(26);
        q.offer(2);
        q.offer(21);
        q.offer(53);
        System.out.println(q);
//        implementing queue with the help of ArrayDeque
        Queue<Integer> q2 = new ArrayDeque<>();
        q2.addAll(q);
        q2.offer(97);
        System.out.println(q2);
// implemet stack with ArrayDeque
        ArrayDeque<Integer> st = new ArrayDeque<>();
        st.push(56);
        st.push(25);
        st.push(35);
        st.push(19);

        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
//        implementing queue with priority queue
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        System.out.println("pq starts from here");
        pq.add(12);
        pq.add(13);
        pq.add(14);
        pq.add(15);
        while (!pq.isEmpty()){
            System.out.println(pq.poll() + " ");
        }


    }
}
