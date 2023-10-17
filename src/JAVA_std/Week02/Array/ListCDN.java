package JAVA_std.Week02.Array;

// ArrayList
// (사용하기 위해선 import java.util.ArrayList; 를 추가해야합니다.)
import java.util.ArrayList;

public class ListCDN {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언 및 생성

        intList.add(1);
        intList.add(2);
        intList.add(3);

        System.out.println(intList.get(0)); // 1 출력
        System.out.println(intList.get(1)); // 2 출력
        System.out.println(intList.get(2)); // 3 출력
        System.out.println(intList.toString()); // [1,2,3] 출력

        intList.set(1, 10); // 1번순번의 값을 10으로 수정합니다.
        System.out.println(intList.get(1)); // 10 출력


        intList.remove(1); // 1번순번의 값을 삭제합니다.
        System.out.println(intList.toString()); // [1,3] 출력

        intList.clear(); // 전체 값을 삭제합니다.
        System.out.println(intList.toString()); // [] 출력
    }
}
