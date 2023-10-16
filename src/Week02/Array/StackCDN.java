package Week02.Array;

// Stack
// (사용하기 위해선 import java.util.Stack; 를 추가해야합니다.)
import java.util.Stack;

public class StackCDN {

    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<Integer>(); // 선언 및 생성

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        while (!intStack.isEmpty()) { // 다 지워질때까지 출력
            System.out.println(intStack.pop()); // 3,2,1 출력
        }

        // 다시 추가
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        // peek()
        System.out.println(intStack.peek()); // 3 출력
        System.out.println(intStack.size()); // 3 출력 (peek() 할때 삭제 안됬음)

        // pop()
        System.out.println(intStack.pop()); // 3 출력
        System.out.println(intStack.size()); // 2 출력 (pop() 할때 삭제 됬음)

        System.out.println(intStack.pop()); // 2 출력
        System.out.println(intStack.size()); // 1 출력 (pop() 할때 삭제 됬음)

        while (!intStack.isEmpty()) { // 다 지워질때까지 출력
            System.out.println(intStack.pop()); // 1 출력 (마지막 남은거 하나)
        }
    }
}