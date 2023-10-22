package Practice.Prac1.Carr.sample;

public class Main {
    public static void main(String[] args) { //메인 메서드
        Main main = new Main();
        System.out.println(main.getNumber());
        System.out.println(main.getNumber());

    }
    // ↓ 기본 생성자 => 자동 생성 => 생략 가능
//    public Main () {}
    // 메서드
    public int getNumber() { //return 타입이 int인 메서드
        //지역변수 <-> 전역변수(static)
        //해당 메서드가 실행 될 때마다 독립적인 값을 저장, 관리.
        //이 메서드가 종료될 때 소멸
        int number = 1;
        number += 1; // number = number + 1
        return number;
    }
}
