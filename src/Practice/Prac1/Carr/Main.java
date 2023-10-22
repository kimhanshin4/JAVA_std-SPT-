package Practice.Prac1.Carr;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); //객체 생성

        System.out.println("car.gear + " + car.gear);
        //메서드 호출 및 반환값을 저장
        double speed = car.gasPedal(100,'D');
        System.out.println("speed = " + speed);
        System.out.println("car.gear + " + car.gear);

        boolean lights = car.onOffLights();
        System.out.println("lights = " + lights);
        System.out.println();

        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(110, 120, 150);




//        //초기값 기본 값 확인 : 초기값을 준 건 해당 값, 아닌 건 default 값이 들어올 것
//        System.out.println("car.model = " + car.model);
//        System.out.println("car.color = " + car.color);
//        System.out.println();
//
//        System.out.println("car.speed = " + car.speed);
//        System.out.println("car.gear = " + car.gear);
//        System.out.println("car.lights = " + car.lights);
//        System.out.println();
//
//        System.out.println("car.tire = " + car.tire);
//        System.out.println("car.door = " + car.door);
//        System.out.println();
//
//        //필드 사용
//        car.color = "blue";
//        car.speed = 100;
//        car.lights = false;
//
//        System.out.println("car.color = " + car.color);
//        System.out.println("car.speed = " + car.speed);
//        System.out.println("car.lights = " + car.lights);

    }
}
