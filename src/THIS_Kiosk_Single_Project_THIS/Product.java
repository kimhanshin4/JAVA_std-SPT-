package THIS_Kiosk_Single_Project_THIS;

import Practice.Kiosk.Menu;

// 1. 만들려고 하는 객체의 설계도.(클래스 선언)
public class Product extends Menu {
    // 2. 객체가 가지고 있어야 할 속성(필드) 정의
    //<필드 영역>
    private String name;
    private double price;
    private String description;


    // 3. 객체를 생성하는 방식을 정의.(생성자) => 변수를 넣은 필드를 어떻게 정의할 것인가.
    //    -constructor
    // 처음 객체가 생성될 때(Instance화) 어떤 로 직을 수행해야 하며, 어떤 값이 필수로 들어와야 하는지 정의!
    //<생성자 영역>

    public Product( String name, double price, String description) {
        super();
        this.name = name;
        this.price = price;
        this.description = description;
    }


    public String getName() {
        return name;
    }

    public double getprice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

}