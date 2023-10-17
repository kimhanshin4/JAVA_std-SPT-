package JAVA_std.Week03;

// Car class를 이용한 객체 생성

public class Main {
    public static void main(String[] args) {
//        Car car1 = new Car(); // new키워드를 통한 생성자 호출
//        Car car2 = new Car(); // 객체도 변수 형태로 저장 가능 => 배열로 관리 가능
//        System.out.println(car1); // JAVA_std.Week03.Car@682a0b20 car1의 주소값. //참조형 변수는 별도의 값을 저장, 주소를 불러온다.

//        Car[] carArr = new Car[3];
//        Car car1 = new Car();
//        car1.changeGear('P');
//        carArr[0] = car1;
//
//        Car car2 = new Car();
//        car2.changeGear('N');
//        carArr[1] = car2;
//
//        Car car3 = new Car();
//        car3.changeGear('D');
//        carArr[2] = car3;
//
//        for (Car car: carArr) {
//            System.out.println("car.gear = " + car.gear);


//        Car car = new Car(); // 객체 생성
//        //초기값 기본 값 확인 : 초기값을 준 건 해당 값, 아닌 건 default value set
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
//        // 필드 사용 = 읽어오는 것 + 수정하는 것
//        car.color = "blue";
//        car.speed = 100;
//        car.lights = false;
//
//        System.out.println("car.color = " + car.color);
//        System.out.println("car.speed = " + car.speed);
//        System.out.println("car.lights = " + car.lights);


        //메서드 호출 및 반환값을 저장
        Car car = new Car();

        System.out.println("페달 밟기 전 car.gear = " + car.gear);
        double speed = car.gasPedal(100,'D');
        System.out.println("speed = " + speed);

        boolean lights = car.onOffLights();
        System.out.println("lights = " + lights);

        System.out.println();
        System.out.println("페달 발은 후 car.gear = " + car.gear);

        System.out.println();
        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(110, 120, 150);
    }
}
