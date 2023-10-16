package Week02.Array;

// Queue
// (사용하기 위해선 java.util.LinkedList; 와 import java.util.Queue; 를 추가해야합니다.)
import java.util.LinkedList;
import java.util.Queue;

public class QueueCDN {

    public static void main(String[] args) {
        Queue<Integer> intQueue = new LinkedList<>(); // 선언 및 생성

        intQueue.add(1);
        intQueue.add(2);
        intQueue.add(3);

        while (!intQueue.isEmpty()) { // 다 지워질때까지 출력
            System.out.println(intQueue.poll()); // 1,2,3 출력
        }

        // 다시 추가
        intQueue.add(1);
        intQueue.add(2);
        intQueue.add(3);

        // peek()
        System.out.println(intQueue.peek()); // 1 출력 (맨먼저 들어간값이 1 이라서)
        System.out.println(intQueue.size()); // 3 출력 (peek() 할때 삭제 안됬음)

        // poll()
        System.out.println(intQueue.poll()); // 1 출력
        System.out.println(intQueue.size()); // 2 출력 (poll() 할때 삭제 됬음)

        System.out.println(intQueue.poll()); // 2 출력
        System.out.println(intQueue.size()); // 1 출력 (poll() 할때 삭제 됬음)

        while (!intQueue.isEmpty()) { // 다 지워질때까지 출력
            System.out.println(intQueue.poll()); // 3 출력 (마지막 남은거 하나)
        }
    }
}