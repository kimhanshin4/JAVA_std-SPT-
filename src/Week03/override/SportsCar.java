package Week03.override;

public class SportsCar extends Car{
    String engine;
    public void booster() {
        System.out.println("엔진 " + engine + " 부앙~\n");
    }

    public SportsCar(String engine) {
        this.engine = engine;
    }

    // '@' 애노테이션(annotation)
    @Override
    public double brakePedal() {
        speed = 100;
        System.out.println("스포츠카에 브레이크란 없다");
        return speed;
    }

    @Override
    public void horn() {
        booster();
    }
}