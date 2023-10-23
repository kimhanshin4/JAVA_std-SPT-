package Practice.bKiosk;

public class Menu {
    private int menuId;
    private String menuName;

    private double price;
    private String coinName;
    private String ingredients;

    public Menu(int menuId, String menuName, double price, String coinName, String ingrediendts) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.price = price;
        this.coinName = coinName;
        this.ingredients = ingrediendts;
    }

    public int getMenuId() {
        return menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public double getPrice() {
        return price;
    }

    public String getCoinName() {
        return coinName;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void printMenuInfo() {
        System.out.println(this.menuId + this.menuName + this.price + this.coinName + this.ingredients);
    }

    public void printScreenMain() {
        System.out.println("빌보네 버거집에 오신걸 환영합니다♬");
        System.out.print("1. 피핀네 머슈룸 버거 | 400골드 | 빵, 패티, 야채, 버섯");
        System.out.print("2. 레골라스네 램버스 버거 | 2800골드 | 빵, 야채");
        System.out.print("3. 라다가스트네 헤롱헤롱 버거 | 15골드 | 빵, 버섯");
        System.out.println("-------------------------------------------------");
        System.out.print("4.주문하기");
        System.out.println("5.주문확인");
        System.out.print("  ");
    }

}