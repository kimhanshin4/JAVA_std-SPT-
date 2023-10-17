package JAVA_std.Week03.poly;

public class Main {
    public static void main(String[] args) {

        // 자식클래스가 부모클래스로 강제 형변환
        Tire kiaSampleTire = new KiaTire("KIA");
        Tire hankookSampleTire = new HankookTire("HANKOOK");

        // 매개변수 다형성 확인!
        Car car1 = new Car(new KiaTire("KIA"));
        Car car2 = new Car(new HankookTire("HANKOOK"));

        // 반환타입 다형성 확인!
        Tire hankookTire = car1.getHankookTire();
        KiaTire kiaTire = (KiaTire) car2.getKiaTire();

        // 오버라이딩된 메서드 호출
        car1.tire.rideComfort(); // KIA 타이어 승차감은 60
        car2.tire.rideComfort(); // HANKOOK 타이어 승차감은 100
    }
}