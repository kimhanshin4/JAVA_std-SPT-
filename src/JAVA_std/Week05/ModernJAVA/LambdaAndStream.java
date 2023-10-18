package JAVA_std.Week05.ModernJAVA;

import java.util.ArrayList;
import java.util.List;

// 주차장 예제
// 티켓, 파킹머니 있는 차들만 주차하게 하는
public class LambdaAndStream {
    public static void main(String[] args) {

        //주차대상 차량
        ArrayList<Car> carsWantToPark = new ArrayList<>();

        //주차장
        ArrayList<Car> parkingLot = new ArrayList<>();

        //주말 주차장
        ArrayList<Car> weekendParkingLot = new ArrayList<>();

        // 5개의 car instance
        Car car1 = new Car("Benz", "Class E", true, 0);
        Car car2 = new Car("BMW", "Series 7", false, 100);
        Car car3 = new Car("BMW", "X9", false, 0);
        Car car4 = new Car("Audi", "A7", true, 0);
        Car car5 = new Car("Hyundai", "Ionic 6", false, 10000);

        carsWantToPark.add(car1);
        carsWantToPark.add(car2);
        carsWantToPark.add(car3);
        carsWantToPark.add(car4);
        carsWantToPark.add(car5);

//        parkingLot.addAll(parkingCarWithTicket(carsWantToPark));
        parkingLot.addAll(parkCars(carsWantToPark, Car::hasTicket)); //매개변수로 메서드를 넘겨주는 새로운 방법

//        parkingLot.addAll(parkingCarWithMoney(carsWantToPark));
        parkingLot.addAll(parkCars(carsWantToPark, Car::noTicketButMoney));

        // 익명함수 적용 ()->{}, {}안에 들어갈 로직이 간단하면 생략가능
        parkingLot.addAll(parkCars(carsWantToPark, (Car car)-> car.hasParkingTicket() && car.getParkingMoney() > 1000));

        for (Car car : parkingLot) {
            System.out.println("Parked Car : " + car.getCompany() + "-" + car.getModel());
        }


    }

    // 타입은 뭐로 넣어야 할까? => (함수형)인터페이스
    // 인터페이스 => 타입 역할을 할 수 있다 (멀티 리모컨 예제)
    // 함수형 인터페이스 : 추상 메서드를 딱 하나만 가지고 있다
//        public exampleMethod (int parameter1, ??? parameterFunction) {
//        parameterFunction~~~
//    }

    // (A) 와 (B) 둘이 식이 유사한데, 하나로 작성할 순 없을까???
//    public static List<Car> parkingCarWithTicket(List<Car> carsWantToPark) { //(A)
//        ArrayList<Car> cars = new ArrayList<>();
//
//        for (Car car : carsWantToPark) {
//            if (car.hasParkingTicket()) {
//                cars.add(car);
//            }
//        }
//
//        return cars;
//    }
//
//    public static List<Car> parkingCarWithMoney(List<Car> carsWantToPark) { //(B)
//        ArrayList<Car> cars = new ArrayList<>();
//
//        for (Car car : carsWantToPark) {
//            if (!car.hasParkingTicket() && car.getParkingMoney() > 1000) {
//                cars.add(car);
//            }
//        }
//
//        return cars;
//    }


    // 위 두 메서드를 하나로! : 내부 주요 로직을 함수로 전달 받자

    public static List<Car> parkCars(List<Car> carsWantToPark, Predicate<Car> function) {
        List<Car> cars = new ArrayList<>();

        for (Car car : carsWantToPark) {
            // 전달된 함수를 사용하여 구현
            if (function.test(car)) {
                cars.add(car);
            }
        }
        return cars;
    }
}

class Car {
    private final String company; // 자동차 회사
    private final String model; // 자동차 모델

    private final boolean hasParkingTicket;
    private final int parkingMoney;

    public Car(String company, String model, boolean hasParkingTicket, int parkingMoney) {
        this.company = company;
        this.model = model;
        this.hasParkingTicket = hasParkingTicket;
        this.parkingMoney = parkingMoney;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public boolean hasParkingTicket() {
        return hasParkingTicket;
    }

    public int getParkingMoney() {
        return parkingMoney;
    }

    public static boolean hasTicket(Car car) {
        return car.hasParkingTicket;
    }

    public static boolean noTicketButMoney(Car car) {
        return !car.hasParkingTicket && car.getParkingMoney() > 1000;
    }
}

interface Predicate<T> {
    boolean test(T t);
}