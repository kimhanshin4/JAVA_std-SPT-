package Practice.Prac1.Carr.poly;

public class Tire {
    String company; // 타이어 회사

    public Tire(String company) {
        this.company = company;
    }

    public void rideComfort() {
        System.out.println(company + " 타이어 승차감은?");
    }
}