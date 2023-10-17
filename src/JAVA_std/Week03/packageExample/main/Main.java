package JAVA_std.Week03.packageExample.main;
import JAVA_std.Week03.packageExample.pk1.Car; //pk1을 import
public class Main {
    public static void main(String[] args) {
//        Car car = new Car(); //에러. 같은 패키지가 아님

        // 클래스의 일부분, 하위 패키지를 도트(.)로 구분
//        JAVA_std.Week03.packageExample.pk1.Car car1 = new JAVA_std.Week03.packageExample.pk1.Car();
//        JAVA_std.Week03.packageExample.pk2.Car car2 = new JAVA_std.Week03.packageExample.pk2.Car();
//        // 다른 패키지의 내용을 내부소스를 통해 가져올 수 있다.
//        car1.horn();
//        car2.horn();

        Car car = new Car();  //pk1을 import
        JAVA_std.Week03.packageExample.pk2.Car pkCar = new JAVA_std.Week03.packageExample.pk2.Car();
        //import는 하나밖에 안되나?
        car.horn();
        pkCar.horn();
    }
}
