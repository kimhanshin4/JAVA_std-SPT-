package JAVA_std.Week03.superExample;

public class Main {
    public static void main(String[] args) {
        // 자식 클래스 스포츠카 객체 생성
        SportsCar sportsCar = new SportsCar("Orion");

        // 자식 객체의 model, color, price 초기값 확인
        System.out.println("sportsCar.model = " + sportsCar.model); // Ferrari
        System.out.println("sportsCar.color = " + sportsCar.color); // Red
        System.out.println("sportsCar.price = " + sportsCar.price); // 3.0E8
        System.out.println();

        // setCarInfo 메서드 호출해서 부모 및 자식 필드 값 저장
        sportsCar.setCarInfo("GV80", "Black", 50000000);

        // this.price = price; 결과 확인
        System.out.println("sportsCar.price = " + sportsCar.price); // 5.0E7
        System.out.println();

        // super.model = model; super.color = color;
        // 결과 확인을 위해 자식 클래스 필드 model, color 확인 & 부모 클래스 메서드인 getModel(), getColor() 호출
        // 자식 클래스 필드 값은 변화 없음.
        System.out.println("sportsCar.model = " + sportsCar.model); // Ferrari
        System.out.println("sportsCar.color = " + sportsCar.color); // Red
        System.out.println();

        // 부모 클래스 필드 값 저장됨.
        System.out.println("sportsCar.getModel() = " + sportsCar.getModel()); // GV80
        System.out.println("sportsCar.getColor() = " + sportsCar.getColor()); // Black

    }
}