package Week03.sample;

// 지역변수
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getNumber()); // 2
        System.out.println(main.getNumber()); // 2 => getNumber메서드 내에서 num 1+1 값을 한 번 리턴하고 소멸.
    }

    // 메서드
    public int getNumber() {
        // 지역 변수 <-> 전역변수(static과 공통적인 성격)
        // 해당 메서드가 실행될 때 마다 독립적인 값 저장, 관리
        // 메서드 내부에서 정의될 때 생성
        // 메서드 종료시 소멸.
        int num = 1;
        num += 1;
        return num;
    }
}
