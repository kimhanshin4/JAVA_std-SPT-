package Practice.Prac1.Carr.packageExample.main;

import Practice.Prac1.Carr.packageExample.pk1.Car;

public class Main {
    public static void main(String[] args) { //메인 메서드
//        Car car =  new Car(); //다른 패키지에 있어서 안됨
        // 다른 패키지에 있는 class를 이용해 객체 생성
        // Package 클래스의 일부분이며, 하위 패키지를 도트(.)로 구분. -> 패키지 경로 입력
//        Practice.Prac1.Carr.packageExample.pk1.Car car1 = new Practice.Prac1.Carr.packageExample.pk1.Car();
//        Practice.Prac1.Carr.packageExample.pk2.Car car2 = new Practice.Prac1.Carr.packageExample.pk2.Car();
//
//        car1.horn();
//        car2.horn();

        // Import
        Car car = new Car();
        Practice.Prac1.Carr.packageExample.pk2.Car pkCar = new Practice.Prac1.Carr.packageExample.pk2.Car();
        car.horn();
        pkCar.horn();
    }
}
