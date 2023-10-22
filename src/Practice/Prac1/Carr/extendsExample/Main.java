package Practice.Prac1.Carr.extendsExample;

public class Main {
    public static void main(String[] args) {
        // 부모 클래스 객체에서 자식 클래스 멤버 사용
        Car car = new Car();
        // car.engine = "Orion"; // 오류
        // car.booster(); // 오류

        // 자식 클래스 객체 생성
        SportsCar sportsCar = new SportsCar();
        sportsCar.engine = "Orion";
        sportsCar.booster();

        // 자식 클래스 객체에서 부모 클래스 멤버 사용
        System.out.println("sportsCar.company = " + sportsCar.company);
        System.out.println("sportsCar.getModel() = " + sportsCar.getModel());
        sportsCar.company = "GENESIS";
        sportsCar.setModel("GV80");
        System.out.println("sportsCar.company = " + sportsCar.company);
        System.out.println("sportsCar.getModel() = " + sportsCar.getModel());
        System.out.println();

        sportsCar.horn();
        System.out.println(sportsCar.changeGear('D'));
    }
}